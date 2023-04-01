package ea6;

import java.io.*;

public class Ea6 {
	
	public static void main(String[] args) {
		String ruta = "/home/chema/Documentos/CFGS-DAM/PROGRAMACION";
		String ext = "pdf";
		muestraFicheros(ruta, ext);
		
	}
	
	public static void muestraFicheros(String ruta, String ext) {
		File dir = new File(ruta);
		if(dir.isDirectory()) {
			System.out.println("El directorio existe");
		}else if(dir.isFile()) {
			System.out.println("Es un archivo");
		}
		
		FileFilter busca = new FileFilter() {
			@Override
			public boolean accept(File dir) {
				if(dir.getName().endsWith(ext)) {
					return true;
				}else return false;
			}
		};
		
		File[] archivos = dir.listFiles(busca);
		for(File archivo: archivos){
			System.out.println(archivo.getName());
		}

	}
}
