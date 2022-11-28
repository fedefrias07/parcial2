package Interfaz;

import java.util.ArrayList;

import Datos.Cafe;
import Datos.Encargado;
import Datos.Venta;



public class Main {

	public static void main(String[] args) {
		
		
		Encargado encargado1 = new Encargado(001,"Jose");
		
		
		 final double latte = 1.50;
		 final double flat_white = 2.50;
		 final double lagrima = 1.30;
		 final double expresso = 1.00;
		

		ArrayList<Venta> ventas = new ArrayList<Venta>();
	
		
		
		ventas.add(new Venta(1,new Cafe("latte",latte), 2,true));
		ventas.add(new Venta(1,new Cafe("lagrima",lagrima), 2,true));
		ventas.add(new Venta(1,new Cafe("expresso",expresso), 2,true));
		ventas.add(new Venta(1,new Cafe("latte",latte), 2,true));
		ventas.add(new Venta(1,new Cafe("lagrima",lagrima), 2,true));
		ventas.add(new Venta(1,new Cafe("flat_white",flat_white), 2,true));
		

	
		
		for (int i = 0; i < ventas.size(); i++) {
			encargado1.cargarVentas(ventas.get(0).getCafe());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
