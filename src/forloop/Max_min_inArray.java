package forloop;

public class Max_min_inArray {

	public static void main(String[] args) {
		int a[]= {0,1,6,9,7,4,11,65};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
      System.out.println("Max. largest value is "+max);
	
 for(int i=0;i<=a.length-1;i++) {
	 if(a[0]>a[i]) {
		 min=a[i];
	 }
 }
	System.out.println("min value is "+min); 
 }
}
