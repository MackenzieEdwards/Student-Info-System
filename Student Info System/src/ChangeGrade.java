import java.util.ArrayList;
import java.util.Scanner;

public class ChangeGrade
{
	public static void printClassList(ArrayList<Student> inList)
	{
		for(int i = 0; i < inList.size(); i++)   
		    System.out.println(i + " " + inList.get(i).getFirstName() + " " + inList.get(i).getLastName() + " " 
		                         + inList.get(i).getClassPeriod1() + " " + inList.get(i).getGrade1() + " " 
		    		             + inList.get(i).getClassPeriod2() + " " + inList.get(i).getGrade2() + " " 
		                         + inList.get(i).getClassPeriod3() + " " + inList.get(i).getGrade3() 
		                      );
		    		           
	}
	
    public static ArrayList<Student> chgGradeMenu(ArrayList<Student> inList){
        int choice = 0;
        
		do {
			System.out.println("What would you like to do: \n 1) Change Grade \n 2) Switch Classes \n 3) return to main menu");
			Scanner userinput = new Scanner(System.in);
			choice = userinput.nextInt();
			
			if(choice ==1)
			{
				inList = gradeChanger(inList);
			}
			else if(choice == 2)
			{
				inList = ScheduleChanger(inList);
			}
			else if (choice == 3)
		    {
				break;
			}
			else 
			{
				System.out.println("Invalid input");
				System.out.println();
			}
		} while (choice != 3);
		
		return inList;	
    }
    
	
	public static ArrayList<Student> gradeChanger(ArrayList<Student> inList)
	{
		int whichStudent = 0;
		int whichClass = 0;
		String newGrade = null;
				
		//which student are we doing something for?
		printClassList(inList);
		
		System.out.println("Enter the student number who's grade you want to change?");
		Scanner userInput = new Scanner(System.in);
		whichStudent = userInput.nextInt();
		
		//what class are we changing the grade for?
		do{
			System.out.println("What class grade would you like to change?");
			System.out.println();
			System.out.println("1" + " " + inList.get(whichStudent).getClassPeriod1() + " " + inList.get(whichStudent).getGrade1());
			System.out.println("2" + " " + inList.get(whichStudent).getClassPeriod2() + " " + inList.get(whichStudent).getGrade2());
			System.out.println("3" + " " + inList.get(whichStudent).getClassPeriod3() + " " + inList.get(whichStudent).getGrade3());
			Scanner userInput1 = new Scanner(System.in);
			whichClass = userInput1.nextInt();
			
			if(whichClass > 3)
			{
				System.out.println("Invalid Input, try again");
			}
			
		} while (whichClass > 3);
		
		//get user selection/input of class to change grade for
		System.out.println("Enter new grade");
		Scanner userInput2 = new Scanner(System.in);
		newGrade = userInput2.next();
		
		//add new grade to array list
		if(whichClass == 1)
		{
			inList.get(whichStudent).setGrade1(newGrade.toUpperCase());
		}
		else if(whichClass == 2)
		{
			inList.get(whichStudent).setGrade2(newGrade.toUpperCase());
		}
		else if (whichClass == 3)
		{
			inList.get(whichStudent).setGrade3(newGrade.toUpperCase());
		}
		else
		{
			System.out.println("Invalid Input: No Grades were changed");
			System.out.println();
		}
		
		inList = CalcGPA.calcSudentGPA(inList);
		
		System.out.println(inList.get(whichStudent).getFirstName() + " " + inList.get(whichStudent).getLastName() + " " 
                + inList.get(whichStudent).getClassPeriod1() + " " + inList.get(whichStudent).getGrade1() + " " 
	             + inList.get(whichStudent).getClassPeriod2() + " " + inList.get(whichStudent).getGrade2() + " " 
                + inList.get(whichStudent).getClassPeriod3() + " " + inList.get(whichStudent).getGrade3() 
             );
		
		return inList;
	}
	
	public static ArrayList<Student> ScheduleChanger(ArrayList<Student> inList)
	{
		int whichStudent = 0;
		int fromClass = 0;
		int toClass = 0;
		String tempClass = null;
        String tempGrade = null;
		
		//which student are we doing something for?
		printClassList(inList);
		
		System.out.println("Enter the student number who's classes you want to switch?");
		Scanner userInput = new Scanner(System.in);
		whichStudent = userInput.nextInt();
		
		//what classes are we switching?
				do{
					System.out.println("Which class are you switching?");
					System.out.println("1" + " " + inList.get(whichStudent).getClassPeriod1() );
					System.out.println("2" + " " + inList.get(whichStudent).getClassPeriod2() );
					System.out.println("3" + " " + inList.get(whichStudent).getClassPeriod3() );
					Scanner userInput1 = new Scanner(System.in);
					fromClass = userInput1.nextInt();
					
					if(fromClass > 3)
					{
						System.out.println("Invalid Input, try again");
						System.out.println();
					}
					
				} while (fromClass > 3);
				
				switch(fromClass){
					case 1:
						System.out.println("Which class do you want to replace " + inList.get(whichStudent).getClassPeriod1()+ " with?");
						System.out.println("2" + " " + inList.get(whichStudent).getClassPeriod2() );
						System.out.println("3" + " " + inList.get(whichStudent).getClassPeriod3() );
						break;
					case 2:
						System.out.println("Which class do you want to replace " + inList.get(whichStudent).getClassPeriod2()+ " with?");
						System.out.println("1" + " " + inList.get(whichStudent).getClassPeriod1() );
						System.out.println("3" + " " + inList.get(whichStudent).getClassPeriod3() );
						break;
					case 3:
						System.out.println("Which class do you want to replace " + inList.get(whichStudent).getClassPeriod3()+ " with?");
						System.out.println("1" + " " + inList.get(whichStudent).getClassPeriod1() );
						System.out.println("2" + " " + inList.get(whichStudent).getClassPeriod2() );
						break;
				}
					
				Scanner userInput3 = new Scanner(System.in);
				toClass = userInput3.nextInt();
				
				if (fromClass == 1 && toClass == 2)
				{
				tempClass = inList.get(whichStudent).getClassPeriod1();
				tempGrade = inList.get(whichStudent).getGrade1();
				
				inList.get(whichStudent).setGrade1(inList.get(whichStudent).getGrade2());
				inList.get(whichStudent).setClass1(inList.get(whichStudent).getClassPeriod2());
				
				inList.get(whichStudent).setGrade2(tempGrade);
				inList.get(whichStudent).setClass2(tempClass);
				
				}
				else if (fromClass == 1 && toClass == 3)
				{
					tempClass = inList.get(whichStudent).getClassPeriod1();
					tempGrade = inList.get(whichStudent).getGrade1();
					
					inList.get(whichStudent).setGrade1(inList.get(whichStudent).getGrade3());
					inList.get(whichStudent).setClass1(inList.get(whichStudent).getClassPeriod3());
					
					inList.get(whichStudent).setGrade3(tempGrade);
					inList.get(whichStudent).setClass3(tempClass);
				}
				else if(fromClass == 2 && toClass == 1)
				{
					tempClass = inList.get(whichStudent).getClassPeriod2();
					tempGrade = inList.get(whichStudent).getGrade2();
					
					inList.get(whichStudent).setGrade2(inList.get(whichStudent).getGrade1());
					inList.get(whichStudent).setClass2(inList.get(whichStudent).getClassPeriod1());
					
					inList.get(whichStudent).setGrade1(tempGrade);
					inList.get(whichStudent).setClass1(tempClass);
				}
				else if(fromClass == 2 && toClass == 3)
				{
					tempClass = inList.get(whichStudent).getClassPeriod2();
					tempGrade = inList.get(whichStudent).getGrade2();
					
					inList.get(whichStudent).setGrade2(inList.get(whichStudent).getGrade3());
					inList.get(whichStudent).setClass2(inList.get(whichStudent).getClassPeriod3());
					
					inList.get(whichStudent).setGrade3(tempGrade);
					inList.get(whichStudent).setClass3(tempClass);
				}
				else if(fromClass == 3 && toClass == 1)
				{
					tempClass = inList.get(whichStudent).getClassPeriod3();
					tempGrade = inList.get(whichStudent).getGrade3();
					
					inList.get(whichStudent).setGrade3(inList.get(whichStudent).getGrade1());
					inList.get(whichStudent).setClass3(inList.get(whichStudent).getClassPeriod1());
					
					inList.get(whichStudent).setGrade1(tempGrade);
					inList.get(whichStudent).setClass1(tempClass);
				}
				else if(fromClass == 3 && toClass == 2)
				{
					tempClass = inList.get(whichStudent).getClassPeriod3();
					tempGrade = inList.get(whichStudent).getGrade3();
					
					inList.get(whichStudent).setGrade3(inList.get(whichStudent).getGrade2());
					inList.get(whichStudent).setClass3(inList.get(whichStudent).getClassPeriod2());
					
					inList.get(whichStudent).setGrade2(tempGrade);
					inList.get(whichStudent).setClass2(tempClass);
				}
				else
				{
					System.out.println("Invalid input.");
					System.out.println();
				}
				
		return inList;
	}
}

