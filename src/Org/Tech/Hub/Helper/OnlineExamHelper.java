package Org.Tech.Hub.Helper;
import java.util.*;
import Org.Tech.Hub.question.*;

public class OnlineExamHelper 
{
	List list=new ArrayList();
	int count=0;
	public void addNewQuestion(Questions question)
	{
			list.add(question);
	}
	public void viewAllQuesions()
	{
		for (Object obj:list)
		{
			Questions q=(Questions)obj;
			

			System.out.println("Id="+q.getId()+"\t Question="+q.getQuestion()+"\t Option1="+q.getOption1()+"\tOption2="+q.getOption2()+
					"\tOption3="+q.getOption3()+"\tOption4="+q.getOption4()+"\tAnswer="+q.getAnswer());
		}
	}
	public void removeQuestion(int questionId)
	{
		for(Object obj:list)
		{
			Questions q=(Questions)obj;
			int qid=q.getId();
			
			if(qid==questionId)
			{
				
				int index=list.indexOf(q);
				if(index!=-1)
				{
					list.remove(index);
				}
			}
		}
	}
	public boolean searchQuestion(String questionName)
	{
		Iterator i=list.iterator();
		boolean b=false;
		while(i.hasNext()) 
		{
			Object obj=i.next();
			Questions q=(Questions)obj;
			String questions=q.getQuestion();
			if(questions.equals(questionName)) 
			{
				b=true;
				break;
			}
			
		}
		return b;
	}
	public void attemptQuestion(int questionId,String answer)
	{
		for(Object obj:list)
		{
			Questions q=(Questions)obj;
			int qid=q.getId();
			String ans=q.getAnswer();
			if(qid==questionId && ans.equals(answer))
			{
				++count;
			}
		}
	}
	public void showResult()
	{
		if(list.size()!=0)
		{
			float totalQuestions=(float)list.size();
			float IncorrectQuestions=totalQuestions-count;
			float per=count/totalQuestions;
			System.out.println("Percentage Achived By Student:"+(per*100));
		}
		else
		{
			System.out.println("Plz Add Question in test then you get result");
		}
	}		
}


