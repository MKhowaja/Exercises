
public class Student extends Person{
	private String studentnum;
	double [] marks = new double [4];
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
		calcAverage();
		return average;
	}
	public void calcAverage(){
		average = 0;
		for (int i = 0; i < marks.length; i++){
			average+=marks[i];
		}
		average/=4;
	}
	/**
	 * @return the marks
	 */
	public double[] getMarks() {
		return marks;
	}


	public boolean setMarks(int i, double y) {
		boolean z = false;
		if (y>=0 && y<=100){
				z = true;
				marks[i] = y;
			}
		return z;
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
	public void print (){
		super.print();
		System.out.println("Student Number: " + studentnum);
		for (int i = 0; i < marks.length; i++){
			System.out.println("Course: " + (i+1) + ": " + marks[i]);
		}
		System.out.println("Average: " + getAverage() + "%");
		
	}
}
