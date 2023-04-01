package ejemplos;

import java.io.Console;
import java.io.IOException;

public class ejemplo1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Console c = System.console();
		if (c == null) {
			throw new RuntimeException("No hay Consola");
		} else {
			c.writer().println("Bienvenido al Zoo!");
			c.format("Nuestro zoo tiene 491 animales y 25 empleados.");
			c.writer().println();
			c.printf("Tiene una extensión de %d Km2 y %$1 es mucho", 10);
		}
	}

}
