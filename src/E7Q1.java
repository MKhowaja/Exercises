import java.util.Stack;
import java.util.Scanner;
public class E7Q1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int option, num, den, count;
		Fraction f, temp=new Fraction();
		Stack<Fraction> s = new Stack<Fraction>();
		do{
			System.out.println("Enter Option\n1. New Fraction\n2. Exit");
			option = in.nextInt();
			if (option ==1){
				System.out.println("Enter numerator: ");
				num = in.nextInt();
				System.out.println("Enter denominator: ");
				den = in.nextInt();
				f = new Fraction (num, den);
				s.push(f);
			}
		}while(option!=2);
		count = s.size();
		for (int i = 0; i < count; i++){
			temp = (Fraction)s.get(i);
			System.out.println(temp.num);
			System.out.println(temp.den);
		}
		
	}

}
