
public class Main {

	public static void main(String[] args) {
		
		/*Cliente cliente = new Cliente("Laura");
		Cajera cajera = new Cajera("Samanta");
		long tiempoInicial = System.currentTimeMillis();
		cajera.procesarCompra(cliente, tiempoInicial);
		
		Cliente cliente2 = new Cliente("Andrea");
		Cajera cajero = new Cajera("Ricardo");
		cajera.procesarCompra(cliente2, tiempoInicial);
		*/	
		
		Cliente cliente = new Cliente("Laura");
		Cliente cliente2 = new Cliente("Andrea");
		long tiempoInicial = System.currentTimeMillis();
		
		CajeraThread cajera = new CajeraThread("Samanta", cliente, tiempoInicial);
		CajeraThread cajero = new CajeraThread("Ricardo", cliente2, tiempoInicial);
	}
	
	
}
