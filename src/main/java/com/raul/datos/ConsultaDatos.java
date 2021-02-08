/**
 * 
 */
package com.raul.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author raul
 *
 */
public class ConsultaDatos {
	
	public Integer consultaPrecio(String nombre) throws IOException {
		File f = new File("C:\\Users\\201901\\Desktop\\examen.txt");
		BufferedReader lector = new BufferedReader(new FileReader(f));
		String linea;
		
		List<String> productos = new ArrayList<>();
		
		while((linea = lector.readLine()) != null) {
			String[] precio = linea.split("-");
			if (precio[0].equals(nombre)) {
				lector.close();
				return Integer.parseInt(precio[1]);
			}
			
		}
		lector.close();
		return null;
		
		
	}
	

	
}
