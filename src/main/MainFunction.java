package main;

import java.io.File;

import org.cef.OS;

import test.simple.MainFrame;

public class MainFunction {
	public static void main(String[] args) {
		try{
		String s = "www.google.com";
	    MainFrame m = new MainFrame(s, OS.isLinux(), false);
		}
		catch(Throwable e){
			System.out.println(e.getMessage());
		}
	  }
}
