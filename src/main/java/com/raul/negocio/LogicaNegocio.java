/**
 * 
 */
package com.raul.negocio;

import java.io.IOException;
import java.util.List;

import com.raul.datos.ConsultaDatos;

/**
 * @author raul
 *
 */
public class LogicaNegocio {
	
	public  double calculaDescuento(String nombre, String edad) throws IOException {
		//Usar clase datos
		ConsultaDatos c = new ConsultaDatos();
		double precio;
		double descuento;
		int anos = Integer.parseInt(edad);
		if (anos<20) {
			descuento = (double) (c.consultaPrecio(nombre)* 0.2);
			precio=c.consultaPrecio(nombre)-descuento;
		}else if((anos>=20) && (anos <=30)){
			descuento = (double) (c.consultaPrecio(nombre)* 0.1);
			precio=c.consultaPrecio(nombre)-descuento;
		}else {
			descuento =(double) (c.consultaPrecio(nombre)* 0.05);
			precio = c.consultaPrecio(nombre)-descuento;
		}
		
		
		return precio;
	}

}
