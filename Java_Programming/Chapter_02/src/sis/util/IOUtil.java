package sis.util;

import java.io.*;

public class IOUtil {
	public static boolean delete(String... filenames){
		boolean deleteAll = true;
		for(String filename:filenames){
			if(!new File(filename).delete()){
				deleteAll = false;
			}
		}
		return deleteAll;
	}
	

}
