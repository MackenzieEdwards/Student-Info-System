import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortStudents
	{

	public static ArrayList<Student> sortMenu(ArrayList<Student> inList){
		
		int choice = 0;
        
		do {
			System.out.println("What would you like to do: \n 1) Sort by Last Name \n 2) Sort by GPA \n 3) Sort BY Class \n 4) Return to main menu");
			Scanner userinput = new Scanner(System.in);
			choice = userinput.nextInt();
			
			if(choice ==1)
			{
				Collections.sort(inList, new SortByLastName());
				AddDelete.printList(inList);
			}
			else if(choice == 2)
			{
				Collections.sort(inList, new SortByGPA());
				CalcGPA.printClassGpa(inList);
			}
			else if (choice == 3)
		    {
				Collections.sort(inList, new SortByClass());
				ChangeGrade.printClassList(inList);
			}
			else if(choice == 4)
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
	
}