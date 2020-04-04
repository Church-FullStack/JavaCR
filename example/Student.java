package example;

public class Student extends User{
	public int cohortNum;
	
	public Student(String name,int age,int cohortNum) {
		super(name, age);
		this.cohortNum=cohortNum;
	}
	
	public void printStudent() {
		System.out.println("----------");
		System.out.println("Student Information");
		System.out.println("Cohort:" + cohortNum);
		printUser();
	}
}