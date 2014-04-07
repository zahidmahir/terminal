package commandows;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tail {

	public Tail(String[] args) {
		String filename;
		BufferedReader in;
		filename = args[0];
		try {
			in = new BufferedReader(new FileReader(filename));
			String line;
			int i = 0;
			String content = null;
		    while((line = in.readLine()) != null && i < 10){
		        content += line + "\n";
		    }
		    String[] lines = content.split("\n");
		    if(lines.length < 10) {
		    	i = 0;
		    } else {
		    	i = lines.length - 10;
		    }
		    while(i < lines.length) {
		    	System.out.println(lines[i]);
		    	i++;
		    }
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
