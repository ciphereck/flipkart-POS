package com.flipcard.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//http://zetcode.com/java/fileinputstream/#:~:text=Java%20FileInputStream%20with%20BufferedReader&text=BufferedReader%20reads%20text%20from%20a,the%20efficient%20reading%20of%20characters.&text=The%20example%20reads%20a%20big%20file%20using%20buffering%20technique%20for%20greater%20efficiency.&text=The%20readLine()%20method%20reads%20a%20line%20of%20text%20from%20a%20buffer.

public class CopyCharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        
//		FileReader inputStream = null;
//		FileWriter outputStream = null;
		
//		FileInputStream inputStream = null;
//      FileOutputStream outputStream = null;
		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream(fileName), StandardCharsets.UTF_8));) 
		
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;
		try {
//			inputStream = new FileReader("./input.txt");
//			outputStream = new FileWriter("./output.txt");
			
//			inputStream = new FileInputStream("./input.txt");
//			outputStream = new FileOutputStream("./out.txt");
			
			inputStream = new BufferedReader(new FileReader("./input.txt"));
			outputStream = new BufferedWriter(new FileWriter("./buffer.txt"));

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(inputStream + " " + outputStream);
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
