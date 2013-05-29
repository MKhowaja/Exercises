
public class E2Q9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] names = {"Mario", "Luigi", "Toadstool", "Bowser", "Yoshi"};
		int [][] marks={{78, 80, 81},{68, 75, 73},{76, 75, 79},{80, 70, 88},{54, 64, 74}};
		double average=0;
		System.out.println("Averages: ");
		for (int i = 0; i<marks.length;i++){
			average = 0;
			average += marks[i][0]*0.55;
			average += marks[i][1]*0.25;
			average += marks[i][2]*0.20;
			System.out.println(names[i] + ": " + average);
			
		}
		average = 0;
		System.out.print("Test Average: ");
		for (int i = 0; i<marks.length;i++){
			average+= marks[i][0];				
		}System.out.println(average/marks.length);
		average = 0;
		
		System.out.print("Quiz Average: ");
		for (int i = 0; i<marks.length;i++){
				average+= marks[i][1];				
		}System.out.println(average/marks.length);
		average = 0;
		
		System.out.print("Homework Average: ");
		for (int i = 0; i<marks.length;i++){
			average+= marks[i][2];				
		}System.out.println(average/marks.length);
	}

}
