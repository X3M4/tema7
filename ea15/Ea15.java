package ea15;

import java.io.File;
import java.io.IOException;

public class Ea15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = File.createTempFile("te", ".txt");
		System.out.println(f.getAbsolutePath());
	}

}
