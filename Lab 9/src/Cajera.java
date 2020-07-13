
public class Cajera {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public Cajera(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void procesarCompra(Cliente cliente, long timeStamp) {
		long tiempo = (System.currentTimeMillis() - timeStamp) / 1000;
		System.out.println("La cajera "
				+ this.nombre
				+ " comienza a procesar la compra de "
				+ cliente.getNombre()
				+ " en el tiempo "
				+ tiempo 
				+ " seg");
		
		for(int i = 0; i < cliente.getCarroCompra().length; i++) {
			this.esperarXsegundos(1);
			tiempo = (System.currentTimeMillis() - timeStamp) / 1000;
			System.out.println("Procesando el producto " 
					+ i
					+ " código " 
					+ cliente.getCarroCompra()[i]
					+ " en el tiempo "
					+ tiempo + 
					" seg");
		}
		
		tiempo = (System.currentTimeMillis() - timeStamp) / 1000;
		System.out.println("La cajera "
				+ this.nombre
				+ " terminó de procesar la compra de "
				+ cliente.getNombre()
				+ " en el tiempo "
				+ tiempo 
				+ " seg");
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
