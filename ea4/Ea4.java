package ea4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ea4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream entrada = null;
		FileOutputStream salida = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el nombre del archivo con su ruta: ");
		String archivo = sc.nextLine().trim();
		long tiempo_1 = 0;
		long tiempo_2 = 0;
		
		sc.close();		
		File b = new File(archivo);
		
		if(b.isDirectory()) System.out.println("Es diectorio");
		else if(b.isFile()) {
			System.out.println("El archivo existe");
			String[] ruta = archivo.split("/");
			String nuevo = ruta[ruta.length -1];
			String[] ext = nuevo.split("\\.");
			
			ruta[ruta.length-1] = ext[0];
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < ruta.length-1; i++) {
				sb.append(ruta[i] + "/");
			}
			sb.append(ruta[ruta.length -1] + "_copia" + "." + ext[1]);
			tiempo_1 = System.currentTimeMillis();
			
			try {
				entrada = new BufferedInputStream(new FileInputStream(archivo), 1024);
				salida = new FileOutputStream(sb.toString());
				
				while(true) {
					int datos = entrada.read();
					if(datos < 0) {
						break;
					}
					salida.write(datos);
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				entrada.close();
				salida.close();
			}
			tiempo_2 = System.currentTimeMillis();
			
		}
		else System.out.println("El archivo no existe");
		System.out.printf("Tiempo: %d milisegundos", (tiempo_2 - tiempo_1));
	}
	///home/chema/Documentos/CFGS-DAM/PROGRAMACION/Deitel.pdf
}
