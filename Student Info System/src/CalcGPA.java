import java.util.ArrayList;


public class CalcGPA {
	public static void printClassGpa(ArrayList<Student> inList)
	{
		System.out.println("------------------------------------------");
		for(int i = 0; i < inList.size(); i++)
		{
		    System.out.print(i + " " + inList.get(i).getFirstName() + " " + inList.get(i).getLastName() + " " 
		                         + inList.get(i).getClassPeriod1() + " " + inList.get(i).getGrade1() + " " 
		    		             + inList.get(i).getClassPeriod2() + " " + inList.get(i).getGrade2() + " " 
		                         + inList.get(i).getClassPeriod3() + " " + inList.get(i).getGrade3() + " "
		                     );
		    System.out.printf("%.2f%n", inList.get(i).getGpa());
		}   
		
		System.out.println("------------------------------------------");
	}
	
	public static ArrayList<Student> calcSudentGPA(ArrayList<Student> inList)
	{
		int numGrades = 3;
		double class1 = 0.0;
		double class2 = 0.0;
		double class3 = 0.0;
		double sumClass = 0.0;
		double gradePtAvg = 0.0;
		
		for(int i=0; i < inList.size(); i++)
		{
			class1 = convertGrade(inList.get(i).getGrade1());
			class2 = convertGrade(inList.get(i).getGrade2());
			class3 = convertGrade(inList.get(i).getGrade3());
			
			sumClass = class1 + class2 + class3;
			
			gradePtAvg = (sumClass/numGrades);
			
			inList.get(i).setGpa(gradePtAvg);
		}
		
		return inList;
	}
	
	public static double convertGrade(String grade)
	{
		double numGrade = 0.0;
		
		switch (grade){
		case "A+": numGrade = 4.30;
				   break;
		case "A" : numGrade = 4.00;
		           break;
		case "A-": numGrade = 3.70;
		           break;
		case "B+": numGrade = 3.4;
		           break;
		case "B" : numGrade = 3.00;
		           break;
		case "B-": numGrade = 2.70;
		           break;
		case "C+": numGrade = 2.40;
		           break;
		case "C" : numGrade = 2.00;
		           break;
		case "C-": numGrade = 1.70;
		           break;
		case "D+": numGrade = 1.40;
		           break;
		case "D" : numGrade = 1.00;
		           break;
		case "D-": numGrade = 0.70;
		           break;
		default  : numGrade = 0.00;
		           break;
		}
		
		return numGrade;
	}
}
