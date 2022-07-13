package com.a.io_examples.ex_basicsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_Char_Vs_Byte {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader(new File("/home/raj/Desktop/photo/mg.jpg"));
			FileWriter fw= new FileWriter(new File("/home/raj/Desktop/photo/mg2.jpg"));
			
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
