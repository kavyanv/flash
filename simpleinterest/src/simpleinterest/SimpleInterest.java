package simpleinterest;

import java.util.Scanner;

public class SimpleInterest {
	double simpleInterest(int p,double r,double t){
		double si=(p*t*r)/100;
		return si;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleInterest ms= new SimpleInterest();
		System.out.println("Enter the principle amount");
		int p= sc.nextInt();
		System.out.println("enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("enter time interms of year");
		double t=sc.nextDouble();
	double siamount=ms.simpleInterest(p, r, t);
	System.out.println("simple interest is"+siamount);
	 System.out.println("total amount:"+(siamount+p));
		
		
		
	}	

}
