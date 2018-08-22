package com.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {

	// read text file
	void read_text_file() throws IOException
	{
		// 1. Path
		//(read all data at once)
		
		String fileName = "c:/a_text_file.txt";
		Path file_path = Paths.get(fileName);
		
		// read lines from text file
		List<String> lines = Files.readAllLines(file_path);

		
		
		// 2. BufferedReader
		// (read data line by line)
		
		String fileName_2 = "d:/a_text_file.txt"; // file name
		
		// File -> FileReader -> BufferedReader
		File file = new File(fileName_2);
		FileReader file_reader = new FileReader(file);
		BufferedReader br = new BufferedReader (file_reader);
		
		// simple version
		BufferedReader qr = new BufferedReader(new FileReader(new File(fileName_2)));
		
		// read line by line
		String temp_line = null;
		while ((temp_line = br.readLine())!=null)
		{
			// process each line
			// System.out.println(temp_line);
		}
		// must free the resources.
		br.close();
		qr.close();
		
		
		
		// 3. Scanner
		Path file_path2 = Paths.get(fileName);
		Scanner scanner = new Scanner(file_path2);
		
		// read line by line
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			// process each line
			// System.out.println(line);
		}
		// must free the resources.
		scanner.close();
		
	}
	
}
