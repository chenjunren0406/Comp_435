package org.lobobrowser.html.test;

import java.util.*;  
import java.io.*;  
  
public class StreamWatch extends Thread {  
	private InputStream is;  
	private String type;  
	private List<String> output = new ArrayList<String>();  
	private boolean debug = false;  
	  
	public StreamWatch(InputStream is, String type) {  
	   this(is, type, false);  
	}  
	  
	public StreamWatch(InputStream is, String type, boolean debug) {  
	   this.is = is;  
	   this.type = type;  
	   this.debug = debug;  
	}  
	  
	public void run() {  
	   try {  
	    PrintWriter pw = null;  
	    InputStreamReader isr = new InputStreamReader(is);  
	    BufferedReader br = new BufferedReader(isr);  
	    String line = null;  
	    while ((line = br.readLine()) != null) {  
	     output.add(line);  
	     if (debug)  
	      System.out.println(type + ">" + line);  
	    }  
	    if (pw != null)  
	     pw.flush();  
	   } catch (IOException ioe) {  
	    ioe.printStackTrace();  
	   }  
	}  
	  
	public List<String> getOutput() {  
	   return output;  
	}  
}  