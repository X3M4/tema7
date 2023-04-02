package ea11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ea11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream entrada = new FileInputStream(new File("./src/ea11/test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(entrada));
		StringBuilder sb = new StringBuilder();
		String linea;
		
		while((linea = br.readLine()) != null) {
			sb.append(linea);
		}
		br.close();
		System.out.println(sb.toString());
		
	}

}
