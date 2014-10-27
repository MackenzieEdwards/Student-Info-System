import java.util.Comparator;


public class SortByClass implements Comparator<Student> {
	public int compare(Student s1, Student s2, Student s3) {

		if (s1.getClassPeriod1().compareTo(s2.getClassPeriod1()) < 0) {
			if (s2.getClassPeriod2().compareTo(s3.getClassPeriod3()) < 0) {
				return s1.getClassPeriod1().compareTo(s3.getClassPeriod3());
			} else {
				return s2.getClassPeriod2().compareTo(s3.getClassPeriod3());
			}
		} else {
			return s1.getClassPeriod1().compareTo(s3.getClassPeriod3());
		}
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}