
public class Classroom {
	private String code;
	private Student [] s;
	private double average;
	
	public Classroom (int y){
		code = "ICS4U0";
		s = new Student [y];
		for (int i = 0; i< s.length; i++){
			s[i] = new Student();
		}
		average = 0;
	}
	public void calcAverage(){
		double sum = 0;
		for (int i = 0; i<s.length;i++){
			sum+= s[i].getAverage();
		}
		average = sum/s.length;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the s
	 */
	public Student getS(int i) {
		return s[i];
	}
	/**
	 * @return the average
	 */
	public double getAverage() {
		calcAverage();
		return average;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	public void setS(Student t, int i) {
		s[i] = t;
	}
	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}
	public void addStudent (Student student){
		Student [] temp = new Student[s.length+1];
		for (int i = 0; i<s.length; i++){
			temp[i] = s[i];
		}
		temp[s.length] = student;
		s = temp;
	}
	
	public void printStudent(){
		for (int i = 0; i<s.length; i++){
			System.out.println("Student " + (i+1));
			s[i].print();
		}
	}
	public void sort(){
		boolean swap;
		Student temp;
		do{
			swap = false;
			for (int i = 0; i < s.length - 1; i++){
				if (s[i].getAverage() < s[i+1].getAverage()){
					temp = s[i];
					s[i] = s[i+1];
					s[i + 1] = temp;
					swap = true;
				}
			}
		}while (swap == true);
	}
}
