package saveobjecttofile.task00;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDEserialize {

	public static void main(String[] args) {

		Movie terminator=new Movie("Terminator", "James Cameron", new String[]{"Arnold Schwarzenegger","Linda Hamilton", "Michael Biehn"});
		
		
		// try serialize object and store in file
		
		// 1) create output stream to write in file
			
			try {
				FileOutputStream fileOut=new FileOutputStream("Serialize.txt");
				ObjectOutputStream ous=new ObjectOutputStream(fileOut);
				
				// method for serialize of object
				ous.writeObject(terminator);
				System.out.println("Serialize is successed");
				
				//close streams 
				fileOut.close();
				ous.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
			// deserialize
			
			
			try{
				Movie fileWillBeBack=null;
				
				// open byte stream to read from file
				FileInputStream fis=new FileInputStream("Serialize.txt");
				// open object read stream
				ObjectInputStream ois=new ObjectInputStream(fis);
				
				fileWillBeBack=(Movie) ois.readObject();
				
				fis.close();
				ois.close();
				System.out.println("I'll be back back!");
			
				System.out.println("Name of film:"+fileWillBeBack.getTitle());
				System.out.println("Director  of film:"+fileWillBeBack.getDirector());
				fis.close();
				ois.close();
				
			} catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
			
			
	}

}
