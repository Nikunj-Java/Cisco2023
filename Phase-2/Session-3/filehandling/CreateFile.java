package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	
	public static void createFileUsingFileClass() throws IOException {
		
		//create file
		File file= new File("D:\\Github\\Cisco 2023\\Session-3\\filehandling\\testFile1.txt");;
		if(file.createNewFile()) {
			System.out.println("File prepared Successfully");
		}
		else {
			System.out.println("File already Exist");
		}
		
		//write data to file
		FileWriter writer= new FileWriter(file,false);// overWrites file
		//FileWriter writer= new FileWriter(file,true);// append file
		writer.write("Welcome to JAVA FSD at Simplilearn....!");
		
		writer.close();
		
	}

	public static void main(String[] args) {
		
		try {
			createFileUsingFileClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
