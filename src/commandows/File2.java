package commandows;

import java.io.IOException;

import wandows.Main;

public class File2 {
	public File2(String[] args) throws IOException {
		int index;
		try {
			index = args[0].indexOf(".");
			Main.outln(args[0].substring(index + 1) + " file type");
		} catch (Exception e) {
			Main.out(e.getMessage());
		}
	}
}