package assignment1;

public class chall {

	public static void main(String[] args) {
		 String A="010101";
	        String B="101101";
	        int count=0;
	       char[] aa=A.toCharArray();
	       char [] bb=B.toCharArray();
	       for(int i=0;i<aa.length;i++){
	               if(aa[i]==bb[i]){
	                   count++;
	                   
	               }

	           
	      

	}

System.out.println(count);
}
}