package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = in.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
		  System.out.println(folder);
		}
		
		System.out.println("FILES: ");
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			  System.out.println(file);
			}
		
		boolean sucess = new File(strPath + "\\teste").mkdir();
		System.out.println(sucess);
		
		in.close();
	}
}
