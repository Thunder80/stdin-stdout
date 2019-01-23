import java.io.*;
class hitsat{

	public static void main(String[] args) throws IOException{


		String s = "";
		FileInputStream fis = new FileInputStream("input.txt");
		int i;
		while((i = fis.read()) != -1){
			s = s + (char)i;
		}

		FileOutputStream fos = new FileOutputStream("output.txt");
		PrintWriter pw = new PrintWriter(fos);
		pw.write(s);
		pw.close();
		fos.close();

		System.out.println(s);

	}
}