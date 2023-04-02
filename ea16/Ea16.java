package ea16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ea16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path p = Files.createTempFile("maniobra", ".txt");
			System.out.println("Ruta: " + p);
			p.toFile().deleteOnExit();
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
