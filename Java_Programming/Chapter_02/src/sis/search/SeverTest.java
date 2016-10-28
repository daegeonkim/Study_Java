package sis.search;

import sis.util.*;
import java.util.*;

import junit.framework.TestCase;

public class SeverTest extends TestCase{
	private int numberOfResults = 0;
	private Server server;
	private static final long TIMEOUT = 3000L;
	private static final String [] URL= {
			SearchTest.URL, SearchTest.URL, SearchTest.URL};									//1
	

	protected void setUp() throws Exception{
		TestUtil.delete(SearchTest.FILE);
		LineWriter.write(SearchTest.FILE, SearchTest.TEST_HTML);
	
	
	ResultsListener listener = new ResultsListener(){
		public void executed(Search search){
			numberOfResults++;
		}};		
		server = new Server(listener);
	}
	
	protected void tearDown() throws Exception{
		assertTrue(server.isAlive());
		server.shutDown();
		server.join(3000);
		assertFalse(server.isAlive());
		TestUtil.delete(SearchTest.FILE);
	}
	
	public void testSearch ()throws Exception{
		long start = System.currentTimeMillis();
		executeSearches();
		long elapsed = System.currentTimeMillis() - start ;
		assertTrue(elapsed < 20);
		waitForResults();
	
	}		
	
	private void executeSearches() throws Exception{
		for(String url : URL)
			server.add(new Search(url, "xxx"));
		
	}

	public void testLogs() throws Exception{
		executeSearches();
		waitForResults();
		verifyLogs();
	}
	
	
	
	
	private void waitForResults() {
		long start = System.currentTimeMillis();
		while(numberOfResults < URL.length){
			try{ Thread.sleep(1);}
			catch( InterruptedException e){}
			if (System.currentTimeMillis() - start > TIMEOUT)
				fail("timeout");
		}
		
	}

	private void verifyLogs() {
		List<String> list = server.getLog();
		assertEquals(URL.length * 2, list.size());
		for(int i =0; i < URL.length; i+=2)
			verifySameSearch(list.get(i), list.get(i+1));
	}
	
	
	private void verifySameSearch(String startSearchMsg, String endSearchMsg){
		String startSearch = substring (startSearchMsg, Server.START_MSG);
		String endSearch = substring(endSearchMsg, Server.END_MSG);
		assertEquals(startSearch, endSearch);
	}
	
	private String substring(String string, String upTo){
		int endIndex = string.indexOf(upTo);
		assertTrue("didn't find" + upTo + " in "+ string, endIndex != -1);
		return string.substring(0, endIndex);
	}
	
	
}
