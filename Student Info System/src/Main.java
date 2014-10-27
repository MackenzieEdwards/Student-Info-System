import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {	
		
		ArrayList<Student> StudentList = new ArrayList<Student>();
		//load student into arraylist
		StudentList = AddDelete.loadStudents(StudentList);
		
		//calc student GPA
		StudentList = CalcGPA.calcSudentGPA(StudentList);
		
		//display Student Info System Menu
		displayMenu(StudentList);

	}


	public static void displayMenu(ArrayList<Student> StudentList) throws FileNotFoundException {
		int menuChoice = 0;
		
		ArrayList<Student> inList = new ArrayList<Student>();
		
		inList = StudentList;
		
	 do{	
		System.out.println("Main Menu");
		System.out.println("---------");
		System.out.println("What would you like to do?");
		System.out.println("  1) Add or delete a student");
		System.out.println("  2) Change student grades/schedule");
		System.out.println("  3) Sort students");
		System.out.println("  4) Exit program");
		
		Scanner menuInput = new Scanner(System.in);
		menuChoice = menuInput.nextInt(); 

		switch(menuChoice){
	    case 1:
	       //Statements
	    	inList = AddDelete.addDelMenu(inList);
	       break;
	    case 2:
	       //Statements
	    	inList = ChangeGrade.chgGradeMenu(inList);
	       break; //optional
	    //You can have any number of case statements.
	    case 3:
	    	inList = SortStudents.sortMenu(inList);
	    	//Statements
	    	break;
	    case 4:
	    	//statements
	    	System.out.println("Leaving Student Information System.");
	    	break;
	    default: 
	    	System.out.println("Invalid menu selection.");
	    	System.out.println();
	    	System.out.println("Please enter a valid input");
	    	System.out.println();
	    	System.out.println("Hit any key to display menu");
	    	Scanner errorInput = new Scanner(System.in);
			String errorChoice = errorInput.next();
			break;
		}
	 } while(menuChoice != 4);
	 
	}

}