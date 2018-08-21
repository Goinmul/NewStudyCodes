package com.Main;

import java.io.File;

import com.ArrayList.ArrayListCode;
import com.Exception.ExceptionCode;
/**
 * <starting a project connected to github>

1] From baseline, make an empty repository in github and start coding there

0. in github, create a new repository
- open git bash (cmd)
1. by using command 'cd' in git bash, move to a local directory that you want to download(clone) the remote git repository
2. at the directory you chose, git clone the remote repository(in github)
3. cd into the downloaded(cloned) local directory
4. gradle init--type java-library
- open eclipse
5. import in eclipse - exisitng gradle project - import

2] already have a working project in eclipse - connecting it on remote repository in git

0. in github, create a new repository. Make sure not to create ANY FILES in the repository. Leave it empty.
- open git bash (cmd)
1. by using command 'cd' in git bash, move to a local directory where your working project is.
2. at the directory you chose, git clone the remote repository(in github)
3. on git bash, type belows :
$ git remote add origin https://github.com/Goinmul/NewCodes.git
$ git push -u origin master
 * 
 * 
 * @author HyunWoo Kwon
 *
 */
public class Main {

	public static void main(String[] args) {

		ArrayListCode arrayList = new ArrayListCode();
		ExceptionCode exception = new ExceptionCode();

		// run

		//arrayList.arrayListExample1();
		//exception.try_catch_example1();
		//exception.throw_catch_example1();
		
		File file = new File("d:/my_file_test.csv");
		if(file.exists())
		{
			System.out.println("path exists.");
		}
		else
			System.out.println("path doesn't exist.");
	}
	
}
