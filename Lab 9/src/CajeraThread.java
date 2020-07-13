
public class CajeraThread extends Thread{

	private String nombre;
	private Cliente cliente;
	private long tiempoInicial;
	
	public CajeraThread(String nombre, Cliente cliente, long tiempoInicial) {
		super();
		this.nombre = nombre;
		this.cliente = cliente;
		this.tiempoInicial = tiempoInicial;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public void run() {
		
		long tiempo = (System.currentTimeMillis() - this.tiempoInicial) / 1000;
		System.out.println("La cajera "
				+ this.nombre
				+ " comienza a procesar la compra de "
				+ cliente.getNombre()
				+ " en el tiempo "
				+ tiempo 
				+ " seg");
		
		
		for(int i = 0; i < cliente.getCarroCompra().length; i++) {
			this.esperarXsegundos(1);
			tiempo = (System.currentTimeMillis() - this.tiempoInicial) / 1000;
			System.out.println(this.nombre
					+ "Procesando el producto " 
					+ i
					+ " código " 
					+ cliente.getCarroCompra()[i]
					+ " en el tiempo "
					+ tiempo + 
					" seg");
			tiempo = (System.currentTimeMillis() - tiempoInicial) / 1000;
			System.out.println("La cajera "
					+ this.nombre
					+ " terminó de procesar la compra de "
					+ cliente.getNombre()
					+ " en el tiempo "
					+ tiempo 
					+ " seg");
		}
	
	}
	
	
	private void esperarXsegundos(int segundos) {
		
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

