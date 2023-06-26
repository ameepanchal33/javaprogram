package basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
 public static void main(String[] args) throws IOException {
	String s= "hello file writerr reader";
//	FileWriter fr= new FileWriter("t2.txt");
	//fr.write(s);
//	fr.flush();
//	fr.close();
//	System.out.println("done");
	FileReader re =new FileReader("t2.txt");
	int i;
	while((i = re.read())!=-1) {
		System.out.print((char)i);
	}
	
}

}
