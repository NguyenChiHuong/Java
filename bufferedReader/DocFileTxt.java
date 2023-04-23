package bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class DocFileTxt {
	public static void main(String[] args) {
		File file = new File("D:\\Java\\OPP_java\\src\\bufferedReader\\GhiFile.txt");
		
		//Cách 1
		try {
			BufferedReader f = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			
			String line = null;
			while(true) {
				line = f.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Cách 2
		try {
			List<String> f = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			
			for (String line : f) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
