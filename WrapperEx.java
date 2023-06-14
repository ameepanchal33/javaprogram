package basic;

public class WrapperEx {
	public static void main(String[] args) {
	//	int a=20;
	//	Integer i=Integer.valueOf(a);
	//	Integer j=a;
	//	System.out.println(a+""+i+""+j);
		
	//unboxing	Integer to int
	//	Integer a=new Integer(3);
	//	int i=a.intValue();//covert integer to int explisitly 
	//	int j=a;
	//	int h=a;
	//	int k=a;
	//	System.out.println(a+""+i+""+j+""+h+""+k);
		
	//autoboxing
		//int to Integer
		int i=10;
		short s=50;
		byte b=10;
		long l =50;
		float f=50.0F;
		double d=49.0D;
		char c='a'; 
		boolean b2=true;
	// autoboxing cobert primituve to obj
	Byte Byteobj=b;
	Integer inttibj=i;
	Short shortobj=s;
	Long longobj=l;
	Double doubleobj=d;
	Character  charobj=c;
	Boolean boolobj=b2;
	Float floatobj=f;
	
	//print
	System.out.println("int value"+Byteobj);
	System.out.println("byte"+inttibj);
	System.out.println("short"+shortobj);
	System.out.println("long"+longobj);
	System.out.println("double"+doubleobj);
	System.out.println("char"+charobj);
	System.out.println("bool"+boolobj);
	System.out.println("float"+floatobj);
	
	

				
	}
	

}
