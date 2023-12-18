package com.simplilearn.demo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

	String msg="";
	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		try {
			
			byte[] bytes=file.getBytes();
			Path path=Paths.get("D:\\Workspace-3\\FileHandling\\src\\main\\resources\\static\\files\\"+file.getOriginalFilename());
			Files.write(path, bytes);
			msg="File Uploaded Successfully";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg="Error While Uploading";
		}
		return msg;
		
	}
}
