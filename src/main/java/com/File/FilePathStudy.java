package com.File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathStudy {
	
	public void file_path_curiousity() throws IOException
	{
		File file1 = new File("d:/sample_file.txt");
		System.out.println("file1 is \"d:/sample_file.txt\".");
	
		Path file1_path = Paths.get("d:/sample_file.txt");

		System.out.println("(!)Path file1_path = Paths.get(\"d:/sample_file.txt\")	=	" + file1_path);
		System.out.println("(!)File file1 = new File(\"d:/sample_file.txt\");	=	" + file1);
		System.out.println("file1.isDirectory : " + file1.isDirectory());

		System.out.println("file1.getName() : " + file1.getName());
		System.out.println("file1.getPath() : " + file1.getPath());
		
		System.out.println("file1.getAbsolutePath() : " + file1.getAbsolutePath());
		System.out.println("file1.getAbsoluteFile() : " + file1.getAbsoluteFile());
		
		System.out.println("file1.getCanonicalPath() : " + file1.getCanonicalPath()); // throws IOException
		System.out.println("file1.getCanonicalFile() : " + file1.getCanonicalFile());
	
	}
	
	/* difference of canonical and absolute path
	 
	File file = new File("src", "test");
	
	getPath: src\test
	getAbsolutePath: D:\workspace\Test\src\test
	getCanonicalPath: D:\workspace\Test\src\test

	
	File file = new File("../../workspace");
	
	getPath: ..\..\workspace
	getAbsolutePath: D:\workspace\Test\..\..\workspace
	getCanonicalPath: D:\workspace
	
	*/
	
}
