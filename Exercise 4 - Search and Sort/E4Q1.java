
public class E4Q1 {

	public static int largest (int[]x){
		int largest = 0;
		for (int i = 0; i<x.length; i++){
			if (x[i]>largest){
				largest = x[i];
			}
		}
		return largest;
	}
	
	public static int smallest (int[]x){
		int smallest = largest(x);
		for (int i = 0; i<x.length; i++){
			if (x[i]<smallest){
				smallest = x[i];
			}
		}
		return smallest;
	}
	public static int[] copylarger (int []x, int y){
		int [] temp = new int [x.length + 1];
		for (int i = 0; i < x.length; i++){
			temp[i] = x[i];
		}
		temp[temp.length-1]=y;
		return temp;
	}
	
	public static void output(int[]x){
		for (int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
	public static int[] ascending (int[]x){
		boolean temp = false;
		int num;
		do{
			temp = false;
			for (int i = 0; i<x.length-1;i++){
				if (x[i]>x[i+1]){
					temp = true;
					num = x[i];
					x[i] = x[i+1];
					x[i+1] = num;
				}
			}
		}while (temp == true);
		return x;
	}
	public static int[] descending (int[]x){
		boolean temp = false;
		int num;
		do{
			temp = false;
			for (int i = 0; i<x.length-1;i++){
				if (x[i]<x[i+1]){
					temp = true;
					num = x[i];
					x[i] = x[i+1];
					x[i+1] = num;
				}
			}
		}while (temp == true);
		return x;
	}
	public static int mode (int[]x){
		int mode=0, temp1,temp2=1,temp3=0;
		for (int i = 0;i<x.length;i++){
			temp1 = x[i];
			for (int j = i+1;j<x.length-1;j++){
				if (x[j+1]==temp1){
					temp2++;
				}
			}
			if (temp2>temp3){
				mode = temp1;
				temp3 = temp2;
			}
			temp2 = 1;
		}
		return mode;
	}
	public static int median (int [] x){
		x = ascending(x);
		int median=0;
		if (x.length%2==0){
			median = (x[x.length/2 +1] + x[x.length/2])/2;
		}else{
			median = x[x.length/2 +1];
		}
		return median;
	}
	public static void main(String[] args) {
		int[] marks = {60, 78, 74, 80, 74, 78, 88, 90, 74, 68};
		//System.out.println(largest(marks));
		//System.out.println(smallest(marks));
		marks = copylarger(marks,80);
		//output(marks);
		output(ascending(marks));
		System.out.println(median(marks));
	}

}
