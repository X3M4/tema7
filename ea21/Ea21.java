package ea21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

public class Ea21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		}catch(Exception e) {
			e.getMessage();
		}
		
		FileInputStream fis = new FileInputStream(new File(
				"/home/chema/Documentos/CFGS-DAM/PROGRAMACION/TEMA 7 - "
				+ "STREAMS Y FICHEROS/ENTREGAS/EJERCICIOS_TEMA7/"
				+ "Tema7_Streams_Ficheros/src/ea21/tema7.pdf"));
		byte[] buffer = new byte[1024];
		int contador;
		
		while((contador = fis.read(buffer)) > 0) {
			md.update(buffer, 0, 1024);
		}
		fis.close();
		buffer = md.digest();
		
		for(int i = 0; i < buffer.length; i++){
			sb.append(Integer.toHexString(buffer[i]));
		}
		System.out.println(sb.toString());
	}

}
