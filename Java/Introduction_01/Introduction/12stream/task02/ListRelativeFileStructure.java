package saveobjecttofile.task02;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRelativeFileStructure {

	public static void main(String[] args) {
		System.out.println("Enter directory like- C:\\Users\\jojo\\Desktop\\HomeWorkIt");

		File directory = new File(new Scanner(System.in).nextLine());

		 relativePath(directory);

	}

	private static void relativePath(File file) {

			
		File[] files=file.listFiles();
		if(files==null){
			System.out.println("No such directory");
			return;
		}
		for (File f : files) {
			if(f.isFile()){// print file absolute path
					System.out.println(f.getName());
				
			}else{//we found new directory and we won't to get all files in her we invoke again the method to print his files in directory
				relativePath(f);
			}
		}
		
	}
}		
