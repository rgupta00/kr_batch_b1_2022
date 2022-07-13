package com.a.ex_handling_revision;

import java.util.*;
import java.io.*;

public class D_FileHandling_ARM {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")))) {

			String line = null;

			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					System.out.println(token.toLowerCase());
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
