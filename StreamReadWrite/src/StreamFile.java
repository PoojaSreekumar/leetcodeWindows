import java.io.*;
import java.util.Scanner;

public class StreamFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StreamFile().find();
		try {
			FileInputStream fileIS=new FileInputStream("C:\\Users\\nandu\\eclipse-workspace\\file1.txt");
			/*
			 * Scanner sc=new Scanner(fileIS); int newbit=0; while(sc.hasNext()) {
			 * newbit=sc.nextInt(); System.out.println(newbit); }
			 */
			DataInputStream sat=new DataInputStream(fileIS);
			int newbit=0;
			while(sat.available()>0) {
				//newbit=sat.readInt();
				System.out.println(sat.readInt());
			}
			sat.close();
			fileIS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(EOFException e) {
			System.out.print("end of file");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
		}
		
	}

	public void find() {
		int[] buf = { 191, 225, 480, 763, 500 }; 
		  
        // Create file output stream 
        FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream("C:\\Users\\nandu\\eclipse-workspace\\demo.txt");
		
        // Create data output stream 
        DataOutputStream dataOutputStr 
            = new DataOutputStream(outputStream); 
  
        for (int b : buf) { 
            // Write integer value to 
            // the dataOutputStream 
            dataOutputStr.writeInt(b); 
        } 
  
        dataOutputStr.flush(); 
        
  
        // Create file input stream 
        FileInputStream inputStream 
            = new FileInputStream("C:\\Users\\nandu\\eclipse-workspace\\demo.txt"); 
  
        // Create data input stream 
        DataInputStream dataInputStr 
            = new DataInputStream(inputStream); 
  
        while (dataInputStr.available() > 0) { 
            // Print integer values 
            System.out.println( 
                dataInputStr.readInt()); 
        } 
        inputStream.close();
        dataInputStr.close();
		}
		 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		catch(EOFException e) {
			System.out.print("end of file");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
	  
	}
}
