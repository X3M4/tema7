package ea9;

import java.io.File;
import java.util.Scanner;

public class Ea9 {
	public static void main(String[] args) {
		String ruta = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la ruta de una carpeta");
		ruta = sc.nextLine();// /media/chema/32184EF6184EB89D
		String regexp = "[a-zA-z]+\\.[a-z]+";
		
		
		
		try {
			File f = new File(ruta);
			
			if(!f.exists() || !f.isDirectory()) {
				System.out.println("No es archivo ni directorio.\nSe usará el directorio actual");
				ruta = ".";
				f = new File(ruta);
			}
			
			File[] fl = f.listFiles(new Filtro(ruta));
			
			
			
			for(File archivo: fl) {
				if(archivo.getName().matches(regexp)) {
					System.out.println(archivo.getName());
				}
			}
		}catch(Exception e) {
			System.out.println("Error al buscar en la ruta");
		}
		
		
	}
}

