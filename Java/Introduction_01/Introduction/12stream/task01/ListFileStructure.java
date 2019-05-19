package saveobjecttofile.task01;
import java.io.File;
import java.util.Scanner;

public class ListFileStructure {

	public static void main(String[] args) {
		System.out.println("Enter directory like- C:\\Users\\jojo\\Desktop\\HomeWorkIt");
		Scanner sc=new Scanner(System.in);
		
		
		// read directory
		File file=new File(sc.nextLine());

		if(!file.isFile()){
			listFilesInDirecotry(file);
		}
	}
	
	private static void listFilesInDirecotry(File file){
		
		//get files in directory

		File[] files=file.listFiles();
		if(files==null){
			System.out.println("No such directory");
			return;
		}
		for (File f : files) {
			if(f.isFile()){// print file absolute path
					System.out.println(f.getAbsolutePath());
				
			}else{//we found new directory and we won't to get all files in her we invoke again the method to print his files in directory
				listFilesInDirecotry(f);
			}
		}
		
		
		
	}
}
