package com.File;

import java.io.File;
import java.io.IOException;

public class FileCreateAndDelete {
	
	// instantiate File class
	File file = new File("d:/data.txt");
	
	public void file_create()
	{
		//File file = new File("d:/data.txt"); // instantiated in class level
		try {
			// actually creating file.
			boolean createNewFile = file.createNewFile();
			
			System.out.println("File Created : " + createNewFile);
		
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public void file_delete()
	{
		//File file = new File("d:/data.txt"); // instantiated in class level
		boolean delete = file.delete();

		System.out.println("File deleted : " + delete);
	}

}
