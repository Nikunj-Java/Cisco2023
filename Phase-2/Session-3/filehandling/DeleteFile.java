package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		
		try {
			Path path= Paths.get("D:\\Github\\Cisco 2023\\Session-3\\filehandling\\testFile.txt");
			
			if(Files.deleteIfExists(path))
				System.out.println("File Deleted");
			else
				System.out.println("Filr not Deleted");
		} catch (DirectoryNotEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Directory is Not Empty");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid Permission");
		}
	}

}
