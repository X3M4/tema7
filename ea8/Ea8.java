package ea8;

import java.io.*;

public class Ea8 {
	
	public static void main(String[] args) {
		String ruta = "/home/chema/Escritorio/PRUEBAS";
		String ext = "pdf";
		
		
		try {
			File f = new File(ruta);
			File[] fl = f.listFiles(new Filtro(ext));
			
			for(File archivo: fl) {
				System.out.println("Archivo borrado: " + archivo.getName());
				archivo.delete();
			}
		}catch(Exception e) {
			System.out.println("Error al buscar en la ruta");
		}
		
		
	}
}
