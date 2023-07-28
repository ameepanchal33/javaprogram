package basic;

public class VovelCount {
	private void mian() {
		int vcount = 0;
		String str="this is really simple sentences";
		str=str.toLowerCase();
		for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
		}
		System.out.println(+vcount);
	}

}
