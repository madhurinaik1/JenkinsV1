package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;
import com.listners.MyListner;

public class DriverUtils extends BaseClass{
	
	public static String captureScreenshot(String name) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		 String tempFolderPath = System.getProperty("java.io.tmpdir"); 

		    System.out.println("Temp folder path: " + tempFolderPath); 
		
		System.out.println("SS path"+System.getProperty("user.dir")+"/screenshotss");
		String path=System.getProperty("user.dir")+"/screenshotss/"+name+".jpg";
//		String path="D:\\MyNwWorkspace\\com.Hybrid228\\screenshotss\\"+name+".jpg";
//	wrong  String path="C:\\Users\\Lenovo\\AppData\\Local\\Temp\\screenshot\\"+name+".jpg";
		File dest=new File(path);
		
//		if(!dest.isDirectory()) {
//			dest.mkdir();
//		}
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return path;
	}

}
