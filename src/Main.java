import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num, option=0, temp=0, tempAge, option2;
		String tempName, tempID;
		double tempAvg, average=0;
		System.out.println("Enter the number of students in the class: ");
		num = in.nextInt();
		Person[] p = new Student [num];
		for (int i = 0; i<p.length;i++){
			p[i] = new Student();
			System.out.println("Enter the Last name of student " + (i+1));
			p[i].setLastname(in.next());
			do{
				System.out.println("Enter " + p[i].getLastname() + "'s Age: ");
			}while (p[i].setAge(in.nextInt())==false);
			
			do{
				System.out.println("Enter " + p[i].getLastname() + "'s Student Number: ");
			}while (((Student)p[i]).setStudentnum(in.next())==false);
			
			do{
				System.out.println("Enter " + p[i].getLastname() + "'s Average: ");
			}while (((Student)p[i]).setAverage(in.nextDouble())==false);
		}
		do{
			System.out.println("1. Edit Student data\n2. Output class average\n3. Output list of students\n4. Exit\nChoose an option: ");
			option = in.nextInt();
			if (option ==1){
				System.out.println("Enter Student Number: ");
				temp = in.nextInt();
				for (int i = 0; i < p.length;i++){
					if (Integer.parseInt(((Student) p[i]).getStudentnum())==temp){
						num = i;
						i = p.length;
					}
				}
				System.out.println("What would you like to change?\n1. Last name\n2. Age\n3. Student number\n4. Average\n5. Exit");
				option2 = in.nextInt();
				do{
					if (option2 == 1){
						System.out.println("Enter new last name: ");
						p[num].setLastname(in.next());
					}else if (option2 == 2){
						do{
							System.out.println("Enter " + p[num].getLastname() + "'s new Age: ");
						}while (p[num].setAge(in.nextInt())==false);
					}else if (option2 == 3){
						do{
							System.out.println("Enter " + p[num].getLastname() + "'s new Student Number: ");
						}while (((Student)p[num]).setStudentnum(in.next())==false);
					}else if (option2 == 4){
						do{
							System.out.println("Enter " + p[num].getLastname() + "'s new Average: ");
						}while (((Student)p[num]).setAverage(in.nextDouble())==false);
					}
				}while (option2<1 && option2>4);
				
			}
			else if (option == 2){
				for (int i = 0; i < p.length;i++){
					average+=((Student) p[i]).getAverage();
				}
				average/=p.length;
				System.out.println("The average of the class is " + average + "%" );
			}
			else if (option == 3){
				for (int i = 0; i < p.length;i++){
					System.out.println("Student # " + (i+1));
					p[i].print();
				}
			}
		}while (option!=4);
		System.out.println("Fin");
	}

}
