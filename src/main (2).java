import java.util.Scanner;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int size, option, temp, num=-1, option2;
		Student add;
		double marks;
		System.out.println("Enter the size of the classroom: ");
		size = in.nextInt();
		Classroom c = new Classroom (size);
		for (int i = 0; i<size;i++){
			System.out.println("Enter the Last name of student " + (i+1));
			c.getS(i).setLastname(in.next());
			do{
				System.out.println("Enter " + c.getS(i).getLastname() + "'s Age: ");
			}while (c.getS(i).setAge(in.nextInt())==false);
			
			do{
				System.out.println("Enter " + c.getS(i).getLastname() + "'s Student Number: ");
			}while (c.getS(i).setStudentnum(in.next())==false);
			
			for (int j = 0; j < 4; j++){
				do{
					System.out.println("Enter mark " + (j+1) + ": ");
					marks = in.nextDouble();
				}while (c.getS(i).setMarks(j,marks)==false);
			}
		}
		do{
			System.out.println("1. Edit Student data\n2. Add student\n3. Print Class Average\n4. Print List of Students\n5. Exit\nChoose an option: ");
			option = in.nextInt();
			if (option ==1){
				num = -1;
				do{
					System.out.println("Enter Student Number: ");
					temp = in.nextInt();
					for (int i = 0; i < size;i++){
						if (Integer.parseInt(c.getS(i).getStudentnum())==temp){
							num = i; //sets index
							i = size;
						}
					}
				}while (num ==-1);
				do{
					System.out.println("What would you like to change?\n1. Last name\n2. Age\n3. Student number\n4. Marks\n5. Exit");
					option2 = in.nextInt();
					if (option2 == 1){
						System.out.println("Enter new last name: ");
						c.getS(num).setLastname(in.next());
					}else if (option2 == 2){
						do{
							System.out.println("Enter " +c.getS(num).getLastname() + "'s new Age: ");
						}while (c.getS(num).setAge(in.nextInt())==false);
					}else if (option2 == 3){
						do{
							System.out.println("Enter " + c.getS(num).getLastname() + "'s new Student Number: ");
						}while (c.getS(num).setStudentnum(in.next())==false);
					}else if (option2 == 4){
						for (int j = 0; j < 4; j++){
							do{
								System.out.println("Enter mark " + (j+1) + ": ");
								marks = in.nextDouble();
							}while (c.getS(num).setMarks(j,marks)==false);
						}
					}
				}while (option2!=5);
				
			}
			else if (option == 2){
				add = new Student();
				System.out.println("Enter Last name");
				add.setLastname(in.next());
				do{
					System.out.println("Enter " + add.getLastname() + "'s Age: ");
				}while (add.setAge(in.nextInt())==false);
				do{
					System.out.println("Enter " + add.getLastname() + "'s Student Number: ");
				}while (add.setStudentnum(in.next())==false);
				for (int j = 0; j < 4; j++){
					do{
						System.out.println("Enter mark " + (j+1) + ": ");
						marks = in.nextDouble();
					}while (add.setMarks(j, marks)==false);
				}
				c.addStudent(add);
			}
			else if (option == 3){
				System.out.println("The average of the class is " + c.getAverage() + "%" );
			}
			else if (option == 4){
				c.sort();
				c.printStudent();
			}
		}while (option!=5);
		System.out.println("Fin");
	}
}