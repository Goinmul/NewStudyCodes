package com.File;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.*;// MUST IMPORT THIS, to validate 'CONTINUE'.

public class FileVisitor extends SimpleFileVisitor<Path>{
	
	// Visitor class has constructor, Files.walkFileTree(Path start, FileVisitor visitor);
	// parameter 'visitor' contains methods invoked when accessing files or directories.
	// There are 4 methods, 
	
	// 1) visitFile(Path, BasicFileAttributes)
	// 2) preVisitDirectory(Path, BasicFileAttributes)
	// 3) postVisitDirectory(Path, BasicFileAttributes)
	// 4) visitFileFailed(Path, BasicFileAttributes)
	
	// when accessing directory like A/B/C,
	// execution sequence goes like this.
	// preA -> preB -> preC -> postC -> postB -> postA
	
	// examples of these are coded below.
	
	// These 4 methods return 4 kind of values.
	
	// 1) CONTINUE : Indicates that the file walking should continue. If the preVisitDirectory method returns CONTINUE, the directory is visited.
	// 2) Terminate : Immediately aborts the file walking. No further file walking methods are invoked after this value is returned.
	// 3) SKIP_SUBTREE : When preVisitDirectory returns this value, the specified directory and its sub-directories are skipped. This branch is "pruned out" of the tree.
	// 4) SKIP_SIBLING : When preVisitDirectory returns this value, the specified directory is not visited, postVisitDirectory is not invoked, and no further unvisited siblings are visited. If returned from the postVisitDirectory method, no further siblings are visited. Essentially, nothing further happens in the specified directory.
	
	// preVisitDirectory method, not implemented.
	
	// visitFile - invoked on the file being visited.
	// in here you should put your logic for each file.
	@Override
	public FileVisitResult visitFile(Path file_path, BasicFileAttributes attrib)
	{
		// print information about each type of file.
		System.out.println("file name : " + file_path.getFileName());
		System.out.format("type : " + file_path);
		System.out.println("size : " + attrib.size());
		System.out.println("creation time : " + attrib.creationTime());
		System.out.println("last access time : " + attrib.lastAccessTime());
		System.out.println("last modified time : " + attrib.lastModifiedTime());
		
		return CONTINUE;
	}
	
	// invoked after all the entries in a directory are visited.
	// If any errors are encountered, the specific exception is passed to the method.
	@Override
	public FileVisitResult postVisitDirectory (Path dir, IOException exc)
	{
		// print each directory visited
		System.out.format("directory : %s%n", dir);
		return CONTINUE;
	}
	
	@Override
	public FileVisitResult preVisitDirectory (Path dir, BasicFileAttributes attrib)
	{
		// print each directory visited
		System.out.format("directory : %s%n", dir);
		return CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file_path, IOException exc)
	{
		System.err.println(exc);
		return CONTINUE;
	}
	
	
	
}
