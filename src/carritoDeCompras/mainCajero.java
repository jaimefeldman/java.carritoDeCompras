
package carritoDeCompras;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;


public class mainCajero {

	public static void main(String[] args) {
		
		//Creando los articulos.
		Articulo leche  = new Articulo("leche nido", 990, 3);
		Articulo pan    = new Articulo("maraqueta", 120, 6);
		Articulo jabon  = new Articulo("lesansi", 520, 5);
		Articulo bebida = new Articulo("Coca Cola", 1200, 6);
		
		//Creando un arreglo mutable para almacerar 10 Objetos articulos.
		//Articulo ListaArticulos[] = new Articulo[10];
		
		//Creando un arreglo dinamico (NO thread safe).
		ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
		listaArticulos.add(leche);
		listaArticulos.add(pan);
		listaArticulos.add(jabon);
		listaArticulos.add(bebida);
		
		System.out.println("cantidad de articulos en la lista : " + listaArticulos.size());
		
	
		bebida.setDescuento(0.20);
		
		double total_leche  = leche.getTotalAjustado();
		double total_pan    = pan.getTotalAjustado();
		double total_jabon  = jabon.getTotalAjustado();
		double total_bebida = bebida.getTotalAjustado();
		
		DecimalFormat df = new DecimalFormat("###,###,###");
		
		/*
		System.out.println("-= Total de compras =-\n");
		System.out.printf("%-15s%-10s\n", leche.getNombre(), leche.getTotalString());
		System.out.printf("%-15s%-10s\n", pan.getNombre(), pan.getTotalString());
		System.out.printf("%-15s%-10s\n", jabon.getNombre(), jabon.getTotalString());
		System.out.printf("%-15s%-10s\n", bebida.getNombre(), bebida.getTotalString());
		*/
		
		//Aplicando metodo dos para imprimir por pantalla, usando un bulce. for each.
		for(Articulo algunArticulo : listaArticulos) {
			System.out.printf("%-15s%-10s\n", algunArticulo.getNombre(), algunArticulo.getTotalString());
		}
		
		
		double total = total_leche + total_pan + total_jabon + total_bebida;
		
		System.out.println("\nsu total es de: $" + df.format(total));
	
	}

}
