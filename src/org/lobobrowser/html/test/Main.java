package org.lobobrowser.html.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args){
		  try {  
			    List<String> list = new ArrayList<String>();  
			    ProcessBuilder pb = null;  
			    Process p = null;  
			     
			    String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";  
			    String classpath = System.getProperty("java.class.path");  
			    // list the files and directorys under C:\  
			    list.add(java);  
			    list.add("-classpath");  
			    list.add(classpath);  
			    list.add(TestEntry.class.getName()); 
			    //add you html file address here
			    list.add("C:" + File.separator + "Users\\chen junren\\Desktop\\comp435\\test1.html");   
			     
			    pb = new ProcessBuilder(list);  
			    p = pb.start();  
			     
			    System.out.println(pb.command());  
			    // process error and output message  
			    StreamWatch errorWatch = new StreamWatch(p.getErrorStream(),  
			      "ERROR");  
			    StreamWatch outputWatch = new StreamWatch(p.getInputStream(),  
			      "OUTPUT");  
			    // start to watch  
			    errorWatch.start();  
			    outputWatch.start();  
			    //wait for exit  
			    int exitVal = p.waitFor();  
			    //print the content from ERROR and OUTPUT  
			    System.out.println("ERROR: " + errorWatch.getOutput());  
			    System.out.println("OUTPUT: " + outputWatch.getOutput());  
			    System.out.println("the return code is " + exitVal);  
			   } catch (Throwable t) {  
			    t.printStackTrace();  
		}  
	}
}
