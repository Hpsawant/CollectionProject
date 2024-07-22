package Org.Tech.Hub.OnlineExam;
import java.util.*;
import Org.Tech.Hub.question.*;
import Org.Tech.Hub.Helper.*;

public class OnlineExamClientApp 
{

	public static void main(String[] args) 
	{
		OnlineExamHelper hel=new OnlineExamHelper();
		do
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to my project");
		System.out.println("Press 1 for Add Question");
		System.out.println("Press 2 for Remove Question");
		System.out.println("Press 3 for View All Question");
		System.out.println("Press 4 for Search the Question");
		System.out.println("Press 5 for Attempt Question");
		System.out.println("Press 6 for Show Percentage of student");
		
		System.out.println("Enter Your Choise");
		int choise=sc.nextInt();
		String question;
		switch(choise)
		{
		case 1:
			sc.nextLine();
			System.out.println("Enter the Question id");
			int qid=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Question");
			question=sc.nextLine();
			
			System.out.println("Enter the Question Option1");
			String option1=sc.nextLine();
			
			System.out.println("Enter the Question Option2");
			String option2=sc.nextLine();
			
			System.out.println("Enter the Question Option3");
			String option3=sc.nextLine();
			
			System.out.println("Enter the Question Option4");
			String option4=sc.nextLine();
			
			System.out.println("Enter the Answer");
			String ans=sc.nextLine();
			
			Questions q = new Questions();
			q.setId(qid);
			q.setQuestion(question);
			q.setOption1(option1);
			q.setOption2(option2);
			q.setOption3(option3);
			q.setOption4(option4);
			q.setAnswer(ans);
			hel.addNewQuestion(q);
			break;
			
		case 2:
			sc.nextInt();
			System.out.println("Enter Question id for remove");
			int qId=sc.nextInt();
			hel.removeQuestion(qId);
			break;
			
		case 3:
			System.out.println("Here we will see the All questions present in the project");
			hel.viewAllQuesions();
			break;
			
		case 4:
			System.out.println("Enter the question searching purpose");
			sc.nextLine();
			question=sc.nextLine();
			boolean b=hel.searchQuestion(question);
			if(b) {
				System.out.println("Question found");
			}else {
				System.out.println("Question not found");
				
			}
			break;
			
			
		case 5:
			System.out.println("Enter the Questions Number");
			qid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Answer");
			ans=sc.nextLine();
	
			hel.attemptQuestion(qid, ans);
			break;
			
		case 6:
			System.out.println("Your all data is:");
			hel.showResult();
			break;
			
			default:
			System.out.println("Wrong Choise...");
		}
		}
		while(true);

	}

}
