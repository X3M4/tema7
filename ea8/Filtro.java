package ea8;

import java.io.File;
import java.io.FilenameFilter;

public class Filtro implements FilenameFilter {
	String extension;

	public Filtro(String extension) {
		this.extension = extension;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(name);
	}

}
