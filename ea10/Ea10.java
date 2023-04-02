package ea10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ea10 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("./src/ea10/animales.csv"));
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			String[] sa = s.split(":");
			
			for(int i = 0; i < sa.length; i++) {
				sb.append(sa[i] + "|");
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
	}

}