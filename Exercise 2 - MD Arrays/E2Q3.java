
public class E2Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][] = {{4,2,7},{3,9,1}};
		int i, j;
		System.out.println(a.length);
		System.out.println("a");
		for (i = 0; i < a.length; i++)
		{
			for (j = 0; j < a[0].length; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
		System.out.println("b");
		for (i = 0; i < a[0].length; i++)
		{
			for (j = 0; j < a.length; j++)
				System.out.print(a[j][i]);
			System.out.println();
		}
		System.out.println("c");
		for (i = a.length - 1; i  >= 0; i--)
		{
			for (j = 0; j < a[0].length; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}



	}

}
