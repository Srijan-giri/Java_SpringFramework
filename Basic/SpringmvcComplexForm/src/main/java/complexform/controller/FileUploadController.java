package complexform.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController{
	
	@RequestMapping(path="/fileform",method=RequestMethod.GET)
	public String showUploadForm()
	{
		return "FileForm";
	}
	
	@RequestMapping(path="/uploadImage", method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m)
	{
		System.out.println("File upload handler");
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getFileItem());
		System.out.println(file.getStorageDescription());
//		System.out.println(file.get);
		
		byte[] data = file.getBytes();
		
		// we have to save this file into server....
		
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"pages"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		
		try {
		FileOutputStream fis = new FileOutputStream(path);
		fis.write(data);
		fis.close();
		
		// model
		
		m.addAttribute("msg","Upload Successfully");
		m.addAttribute("filename", file.getOriginalFilename());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Uploading error");
			m.addAttribute("msg", "uploading error");
		}
		
		
		System.out.println("File Uploaded");
		
		
		
		
		
		
		
		
		
		
		
		
		
		return "filesuccess";
	}

}
