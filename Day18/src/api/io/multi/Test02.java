package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {

		File target = new File("files", "multi.txt");

		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);

		byte a = data.readByte();
		char b = data.readChar();
		int c = data.readInt();
		Double d = data.readDouble();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		data.close();
	}
}
