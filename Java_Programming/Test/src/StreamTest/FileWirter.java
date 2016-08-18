package StreamTest;

import junit.framework.TestCase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

abstract public class FileWirter{
	
	public void writeSome(String filename) throws IOException{
		Writer BufferedWirter1 = new BufferedWriter(new FileWriter(filename));
	}

	
}
