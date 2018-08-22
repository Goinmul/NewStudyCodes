package com.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttribute {
	
	//shows file attributes that you want to know
	void file_attribute()
	{
		BasicFileAttributes attrib = null;
		
		// more :
		// DosFileAttributeView 
		// PosixFileAttributeView
		// FileOwnerFileAttributeView
		// AclFileAttributeView
		// UserDefinedFileAttributeView
		
		Path file_path = Paths.get("c:/jackrabbit.csv");
		
		try {
			attrib = Files.readAttributes(file_path, BasicFileAttributes.class);
			
			System.out.println("file name : " + file_path.getFileName());
			System.out.println("size : " + attrib.size());
			System.out.println("last access time : " + attrib.lastAccessTime());
			System.out.println("last modified time : " + attrib.lastModifiedTime());
			System.out.println("creation time : " + attrib.creationTime());
			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
