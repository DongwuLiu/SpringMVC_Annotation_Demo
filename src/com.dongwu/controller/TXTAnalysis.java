package com.dongwu.controller;

import java.io.*;
import java.util.*;

public class TXTAnalysis {
	public static String txtString(String filePath) {
		File file = new File(filePath);
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
			while ((s = br.readLine()) != null) {
				String[] contents = s.split(":");
				result.append(contents[0] +"的值为：" + contents[1] + System.lineSeparator());
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	public static void readTxtFile (String filePath) {
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					System.out.println(lineTxt);
				}
				read.close();
			} else {
				System.out.println("file not found");
			}
		} catch (Exception e) {
			System.out.println("file content error");
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		System.out.println(txtString("C:/Users/Lenovo/Desktop/1.txt"));
		readTxtFile("C:/Users/Lenovo/Desktop/1.txt");
	}
}