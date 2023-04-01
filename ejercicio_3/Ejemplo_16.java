package ejercicio_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ejemplo_16 {
	public static void main(String[] args) {
		// Serialización
		try {
			UnaClase ob1 = new UnaClase("Hola", -7, 2.7e10);
			System.out.println("ob1: " + ob1);
			FileOutputStream fos = new FileOutputStream("serial.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob1);
			oos.flush();
			oos.close();
			
			UnaClaseHija uch = new UnaClaseHija("Adios", "nos vemos", -7, 2.7e10);
			fos = new FileOutputStream("serial.bin");
			ObjectOutputStream oss = new ObjectOutputStream(fos);
			oss.writeObject(uch);
			oss.flush();
			oss.close();
			

			

		} catch (IOException e) {
			System.out.println("Fallo al serializar: " + e);
			System.exit(0);

		}

		// Deserializar
		try {
			UnaClaseHija ob2;
			FileInputStream fis = new FileInputStream("serial.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ob2 = (UnaClaseHija) ois.readObject();
			ois.close();
			System.out.println("ob2: " + ob2);
		} catch (Exception e) {
			System.out.println("Fallo al deserializar: " + e);
			System.exit(0);
		}
	}

}

class UnaClase implements Serializable {
	String s;
	int i;
	double d;

	public UnaClase(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}

	public String toString() {
		return String.format("UnaClase={s:%s, i:%d, d:%8.2g}", s, i, d);
	}
}

class UnaClaseHija extends UnaClase{
	String b;
	
	public UnaClaseHija(String a, String b, int i, double d) {
		super(a, i, d);
		this.b = b;
	}
	
	public String toString() {
		return String.format("UnaClaseHija={s:%s, b:%s, i:%d, d:%8.2g}", s, this.b, i, d);
	}
}
