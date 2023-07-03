package basic;
class ToPrint{
	public void printIntChar(int a,char c){
		System.out.println("Int And Char");
	}
	public void printIntChar(char c,int a){
		System.out.println("Char And Int");
	}
}

public class Assign22 {
	public static void main(String[] args) {
		 ToPrint to =new ToPrint();
		   to.printIntChar(12,'A');
	}
 
 
}
