
public class E2Q5to8 {
	//5
	public static double sum (double [][] x){
		double sum=0;
		for(int i = 0; i <x.length; i++){
			for (int j = 0; j < x[i].length; j++){
				sum+=x[i][j];
			}
		}
		return sum;
	}
	//6
	public static int max (int [][] x){
		int max=0;
		for(int i = 0; i <x.length; i++){
			for (int j = 0; j < x[i].length; j++){
				if(x[i][j]>max){
					max = x[i][j];
				}
			}
		}
		return max;
	}
	//7
	public static void print (int [][] x){
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[0].length; j++){
				System.out.println(x[i][j]);
			}System.out.println();
		}
	}
	
	//8
	public static int num (int [][][] x){
		int n=0;
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[i].length; j++){
				for (int k=0; k < x[i][j].length; k++){
					n++;
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int a[][][] = {{{4,2,7},{3,9,1}, {3,2,7}, {5,2,3}}, {{4,2,7},{3,9,1}, {3,2,7}, {5,2,3}}, {{4,2,7},{3,9,1}, {3,2,7}, {5,2,3}}};
		System.out.println(num(a));

	}

}
