package com.Main;

import java.io.IOException;

import com.ArrayList.ArrayListCode;
import com.Exception.ExceptionCode;
import com.File.FileCreateAndDelete;
import com.File.FileMoveAndRename;
import com.File.FilePathStudy;
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
(you might need to change the origin, then use : $ git remote set-url origin https://github.com/Goinmul/RepoName.git)
$ git push -u origin master
 * 
 * 
 * @author HyunWoo Kwon
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		ArrayListCode arrayList = new ArrayListCode();
		ExceptionCode exception = new ExceptionCode();
		FileCreateAndDelete file = new FileCreateAndDelete();
		FileMoveAndRename moveOrRename = new FileMoveAndRename();
		FilePathStudy pathStudy = new FilePathStudy();
		
		// run

		//arrayList.arrayListExample1();
		//exception.try_catch_example1();
		//exception.throw_catch_example1();
		//file.file_create();
		//file.file_delete();
		//moveOrRename.move_or_rename();
		pathStudy.file_path_curiousity();

	}

}
