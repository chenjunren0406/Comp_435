package main;

import java.io.File;

import org.cef.OS;

import test.simple.MainFrame;

public class MainFunction {
	public static void main(String[] args) {
		SecurityManager sm = new SecurityManager();
		System.setSecurityManager(sm);
		try{
		String s = "www.rice.edu";
	    MainFrame m = new MainFrame(s, OS.isLinux(), false);
		}
		catch(Throwable e){
			e.printStackTrace();
		}
	  }
}
