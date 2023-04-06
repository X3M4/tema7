package ea26;

import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ea26 {
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser(".");
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes", "jpg",
				"jpeg", "png", "gif", "bmp");
		
		
	}
}
