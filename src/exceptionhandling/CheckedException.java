package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class CheckedException {

	public static void main(String[] args) {
		File file = new File("not_existing_file.txt");
		FileInputStream stream = new FileInputStream(file);
	}
}
