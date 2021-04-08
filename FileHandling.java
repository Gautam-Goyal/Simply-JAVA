import java.io.*;
class FileHandling{
	public static void main(String args[]){
		try{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		File f =new File("Demo.txt");
		FileWriter fos=new FileWriter(f);
		fos.write(str);
		fos.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
