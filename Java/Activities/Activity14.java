package hello;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
public static void main(String[] args) throws IOException {
	
	try {
	  File file = new File("C:\\Users\\MShanmugavel\\Documents\\eclipse\\FST Training\\fc.txt");
	 boolean fc = file.createNewFile(); System.out.println(fc);
	 
	
	File fileUtil = FileUtils.getFile("C:\\\\Users\\\\MShanmugavel\\\\Documents\\\\eclipse\\\\FST Training\\\\fc.txt");
	System.out.println("Inside the file created using createnewmethod : "+FileUtils.readFileToString(fileUtil, "UTF-8"));
	
	File destDir = new File("resources");
	FileUtils.copyFileToDirectory(file, destDir);
	
	
	File newFile = FileUtils.getFile(destDir, "fc.txt");
	String newFileData = FileUtils.readFileToString(newFile, "UTF8");
	System.out.println("Displayed from REsources dir: "+newFileData);
	}
	catch(IOException IO) {
	System.out.println(IO);
		
	}
}

}
