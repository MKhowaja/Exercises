
public class E2Q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][] = {{4,2,7},{3,9,1}};
		for (int i = a[0].length-1; i >=0; i--){
			for (int j = a.length-1; j>=0;j--){
				System.out.print(a[j][i]);
			}System.out.println();
		}

	}

}
