package assignment1;

public class calc {

	public static void main(String[] args) {
		int count=200;
		double res=0;
		while (count<1001){
			res=Math.pow((Math.cos(Math.PI*count)),2);
			System.out.println(count+" "+res);
			count++;
		}

	}

}
