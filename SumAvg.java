package basic;
import java.util.Scanner;
public class SumAvg {
	public static void main(String[] args) {
		float sum=0,avg;
		for(float i=0;i<5;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter yhe number:");
		float no= sc.nextFloat();
		 sum+=no;
		
		}
		 System.out.println("sum"+sum);
		 avg=sum/5;
		 System.out.println("avg"+avg);
		
	}
     
}
