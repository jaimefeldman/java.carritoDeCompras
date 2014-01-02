
package carritoDeCompras;


public class mainCajero {

	public static void main(String[] args) {
		
		//Creando los articulos.
		Articulo leche  = new Articulo("leche nido", 990, 3);
		Articulo pan    = new Articulo("maraqueta", 120, 6);
		Articulo jabon  = new Articulo("lesansi", 520, 5);
		Articulo bebida = new Articulo("Coca Cola", 1200, 6);
	
	
		bebida.setDescuento(0.20);
		
		double total_leche  = leche.getTotalAjustado();
		double total_pan    = pan.getTotalAjustado();
		double total_jabon  = jabon.getTotalAjustado();
		double total_bebida = bebida.getTotalAjustado();
		
		System.out.println("-= Total de compras =-\n");
		System.out.println(leche.getNombre()  +"\t $" + total_leche);
		System.out.println(pan.getNombre()    +"\t $" + total_pan);
		System.out.println(jabon.getNombre()  +"\t $" + total_jabon);
		System.out.println(bebida.getNombre() +"\t $" + total_bebida);
		
		double total = total_leche + total_pan + total_jabon + total_bebida;
		
		System.out.println("\nsu total es de $" + total);
	
	}

}
