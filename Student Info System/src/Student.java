public class Student {
	private String firstName;
	private String lastName;
	private String classPeriod1;
	private String grade1;
	private String classPeriod2;
	private String grade2;
	private String classPeriod3;
	private String grade3;
	private double gpa;

	public Student(String fn, String ln, String c1, String g1, String c2,
			String g2, String c3, String g3, double gpa1) {
		firstName = fn;
		lastName = ln;
		classPeriod1 = c1;
		grade1 = g1;
		classPeriod2 = c2;
		grade2 = g2;
		classPeriod3 = c3;
		grade3 = g3;
		gpa = gpa1;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getClassPeriod1() {
		return classPeriod1;
	}

	public String getGrade1() {
		return grade1;
	}

	public String getClassPeriod2() {
		return classPeriod2;
	}

	public String getGrade2() {
		return grade2;
	}

	public String getClassPeriod3() {
		return classPeriod3;
	}

	public String getGrade3() {
		return grade3;
	}
	
	public double getGpa() {
	    return gpa;
	}
	
	public void setGrade1(String newGrade) {
	       this.grade1 = newGrade;
	}
	 
	public void setGrade2(String newGrade) {
	       this.grade2 = newGrade;
	} 
	
	public void setGrade3(String newGrade) {
	       this.grade3 = newGrade;
	}
	
	public void setClass1(String newGrade) {
	       this.classPeriod1 = newGrade;
	}
	
	public void setClass2(String newGrade) {
	       this.classPeriod2 = newGrade;
	}
	
	public void setClass3(String newGrade) {
	       this.classPeriod3 = newGrade;
	}
	
	public void setGpa (double inGpa) {
		   this.gpa = inGpa;
	}
}