package basic;
abstract class Marks{
	abstract  void getpercentage();
	
}
class Aa extends Marks{
	
	
private int guj;
private int hindi;
private int eng;
private int maths;
   Aa(int guj,int hindi,int eng,int maths){
	  this.guj=guj;
	  this.hindi=hindi;
	  this.eng=eng;
	  this.maths=maths;
	  System.out.println("marks of four subject");
	  int total=guj+hindi+eng+maths;
		
	 
  }
	@Override
	void getpercentage() {
		 int total=guj+hindi+eng+maths;
		 int  percentage=total/4;
		 System.out.println("marks of four subject"+guj+hindi+eng+maths);
		 System.out.println("percentage A: "+percentage);
	}
	
}
class  Bb extends Marks{
	private int guj;
	private int hindi;
	private int eng;
	private int maths;
 Bb(int guj,int hindi,int eng,int maths){
	 System.out.println("marks of four subject"+guj+hindi+eng+maths);
	 this.guj=guj;
	  this.hindi=hindi;
	  this.eng=eng;
	  this.maths=maths;
	  
	 
 }
	@Override
	void getpercentage() {
		int total=guj+hindi+eng+maths;
		 int  percentage=total/4;
	
		 System.out.println("percentage B:"+percentage);
		
	}
	
}
public class Assign31 {
public static void main(String[] args) {
	Aa x =new Aa(45,25,65,45);
	x.getpercentage();
	Bb y=new Bb(80,80,80,80);
	y.getpercentage();
	
}
}
