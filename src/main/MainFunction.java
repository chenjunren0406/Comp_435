package main;

import org.cef.OS;

import test.simple.MainFrame;

public class MainFunction {
	public static void main(String[] args) {
		String s = "www.rice.edu";
	    MainFrame m = new MainFrame(s, OS.isLinux(), false);
	  }
}
