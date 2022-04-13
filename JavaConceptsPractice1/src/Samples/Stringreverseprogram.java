package Samples;

public class Stringreverseprogram {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b ="HAVE A NICE DAY";
          // System.out.println(b.length());
        String a[]= b.split (" ");
        //System.out.println(a[0]);
      for(int i=a.length-1;i>=0;i--) {
    	  System.out.print(a[i]  + " ");
      }
    }
  }
