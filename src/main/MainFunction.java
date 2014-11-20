package main;

import org.cef.OS;

import test.simple.MainFrame;

public class MainFunction {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager());
		try{
		String s = "www.rice.edu";
	    MainFrame m = new MainFrame(s, OS.isLinux(), false);
		}
		catch(Throwable e){
			System.out.println(e.toString());
		}
	  }
}
