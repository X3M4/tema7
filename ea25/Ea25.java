package ea25;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Ea25 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ZipInputStream zis = new ZipInputStream(new FileInputStream(new File("/home/chema/Documentos/"
				+ "CFGS-DAM/PROGRAMACION/TEMA 7 - STREAMS Y FICHEROS/ENTREGAS/EJERCICIOS_TEMA7/"
				+ "Tema7_Streams_Ficheros/src/ea25/ea25.zip")));
		
		ZipEntry entrada;
		while(null != (entrada = zis.getNextEntry())){
			System.out.println(entrada.getName());
		}
	}
}