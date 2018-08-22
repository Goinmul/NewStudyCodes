package com.File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;

public class FileMoveAndRename {

	public void move_or_rename() throws IOException
	{
		// 1) basic usage of moving/renaming a file, using file.renameTo(renamed_file);

		// an existing file
		File file_1 = new File("d:/text1.txt");

		// moving or renaming a file (basically creating a file with different name)
		File file_1_moved = new File("d:/text1_moved.txt");

		// actually moving/renaming code
		boolean isMoved = file_1.renameTo(file_1_moved);
		// in Linux or Unix, you might need authority for this job.
		// so you must check if it is really moved by boolean 'isMoved'.

		/*
		// if you are moving a file to a different directory
		// and you want to delete the original file after moving,
		// use below lines : 
		
		if(isMoved == true)
		{
			if(file_1.delete())
				System.out.println("file is moved and original file is deleted.");
			//boolean reminiscence = file.exists(); // for check
		}
		*/


		
		
		// 2) using .NIO (Valid up on JDK7 or higher version)

		Path file_2 = Paths.get("d:/text2.txt");
		Path file_2_moved = Paths.get("d:/text2_moved.txt");

		// why not work?
		// Files.move(file_2, file_2_moved.resolve(file_2.getFileName()));


		
		
		
		// 3) using Apache Commons IO
		
		// add this in build.gradle dependency
		/*
		 
		// https://mvnrepository.com/artifact/commons-io/commons-io
		compile group: 'commons-io', name: 'commons-io', version: '2.6'
		
		 */
		File file_3 = new File("d:/text3.txt");
		File file_3_moved = new File("d:/text3_moved.txt");

		// depending on the last parameter of 'moveDirectoryToDirectory',
		// 1) true : it creates the destination directory if it is not existing.
		// 2) false : it returns a IOException for missing destination directory.
		
		// File file_3 = new File("d:/text3");
		// File file_3_moved = new File("d:/text3_moved");
		//FileUtils.moveDirectoryToDirectory(file_3, file_3_moved, true);
		FileUtils.moveFile(file_3, file_3_moved);

	}

}
