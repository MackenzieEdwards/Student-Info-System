import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Object;
import java.util.ArrayList;

public class AddDelete {

	
	public static ArrayList<Student> loadStudents(ArrayList<Student> inList) throws FileNotFoundException
	{
		//ArrayList<Student> StudentList = new ArrayList<Student>();
		
		String firstName = null;
		String lastName = null;
		String class1 = null;
		String class2 = null;
		String class3 = null;
		String grade1 = null;
		String grade2 = null;
		String grade3 = null;
		double gpa = 0.0;
		
		Scanner file = new Scanner( new File("studentlist.txt"));
		
	    while (file.hasNextLine()) {
			firstName = file.next();
			lastName = file.next();
			class1 = file.next();
			grade1 = file.next();
			class2 = file.next();
			grade2 = file.next();
			class3 = file.next();
			grade3 = file.next();
			
			inList.add(new Student(firstName, lastName, class1, grade1, class2, grade2, class3, grade3, gpa));
			
		}
		return inList;
	    
	}
	public static void printList(ArrayList<Student> inList)
	{
		for(int i = 0; i < inList.size(); i++)   // for i goes from 0 to grades.length
		    System.out.println(i + " " + inList.get(i).getFirstName() + " " + inList.get(i).getLastName());
		
		System.out.println();
	}
	
	public static ArrayList<Student> addDelMenu(ArrayList<Student> inList) throws FileNotFoundException
	{
		int choice = 0;
		
		do {
			System.out.println("What would you like to do: \n 1) add a student \n 2) delete a student \n 3) return to main menu");
			Scanner userinput = new Scanner(System.in);
			choice = userinput.nextInt();
			
			if(choice ==1)
			{
				addStudent(inList);
			}
			else if(choice == 2)
			{
				delStudent(inList);
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
		
	
	public static  ArrayList<Student> addStudent(ArrayList<Student> inList) throws FileNotFoundException {
		String firstName = null, lastName = null, class1 = null, class2 = null, class3 = null, grade1 = null, grade2 = null, grade3 = null;
		
			// ask user to input name and score
			System.out.println("What is the students first name?");
			Scanner userinput1 = new Scanner(System.in);
			firstName = userinput1.next();
			System.out.println("What is the students last name?");
			lastName = userinput1.next();
			System.out.println("What is the students first class?");
			class1 = userinput1.next();
			System.out.println("What is the students second class?");
			class2 = userinput1.next();
			System.out.println("What is the students third class?");
			class3 = userinput1.next();
			
			inList.add(new Student(firstName, lastName, class1, "N/A", class2, "N/A", class3, "N/A", 0.0));
			
			System.out.println("Here is the new list of students");
			System.out.println("--------------------------------");
			printList(inList);
			System.out.println();
			
			return inList;
			}

	public static  ArrayList<Student> delStudent(ArrayList<Student> inList){
		
		// let us print all the values available in list
		printList(inList);
		
		System.out.println("Enter the number of the student to delete.");
		Scanner userinput = new Scanner(System.in);
		int choice = userinput.nextInt();
	  
		inList.remove(choice);
		
		System.out.println("Here is the revised list of students");
		System.out.println("------------------------------------");
		printList(inList);
		System.out.println();
		
		return(inList);
	}
}