
public class Student extends Person{
	private String studentnum;
	private double average;
	
	public Student (){
		super();
		studentnum = "555555";
		average = 0.0;
	}
	
	/**
	 * @return the studentnum
	 */
	public String getStudentnum() {
		return studentnum;
	}
	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	/**
	 * @param x the studentnum to set
	 */
	public boolean setStudentnum(String x) {
		boolean temp = false;
		int counter;
		counter = x.length();
		if (counter==6){
			studentnum = x;
			temp = true;
		}
		return temp;
	}
	/**
	 * @param average the average to set
	 */
	public boolean setAverage(double average) {
		boolean temp = false;
		if (average >=0 && average <=100){
			this.average = average;
			temp = true;
		}
		return temp;
	}
	public void print (){
		super.print();
		System.out.println("Student Number: " + studentnum);
		System.out.println("Average: " + average + "%");
	}
}
