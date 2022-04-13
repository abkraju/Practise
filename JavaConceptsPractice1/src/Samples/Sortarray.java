package Samples;
import java.util.Arrays;
public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,5,4,8,9,7,6,2,0,3};
		Arrays.sort(array);
		for(int i=0;i<=array.length-1;i++) {
		   System.out.println(array[i]);	
		}
	}
}
