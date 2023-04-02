package ea9;

import java.io.File;
import java.io.FilenameFilter;

public class Filtro implements FilenameFilter {
	String extension;

	public Filtro(String extension) {
		this.extension = extension;
		this.extension.matches("[a-zA-Z]+\\.[a-z]+");
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(name);
	}

}
