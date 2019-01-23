import java.io.*;
class hitsat{

	public static void main(String[] args) throws IOException{


		String input = "", output = "";
		FileInputStream fis = new FileInputStream("input.txt");
		int i;
		while((i = fis.read()) != -1){
			input = input + (char)i;
		}

		FileOutputStream fos = new FileOutputStream("output.txt");
		PrintWriter pw = new PrintWriter(fos);
		pw.write(output);
		pw.close();
		fos.close();
	}
}