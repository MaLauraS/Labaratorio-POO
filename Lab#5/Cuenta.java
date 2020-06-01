// María Laura Sáncehz Hernández
// 2019046864

/*"java.util.Date" es usado para capturar la fecha y hora actual en la computadora*/
import java.util.Date;


class Cuenta {
	private int id = 0;
	private double balance = 0;
	private double tasaDeInteresAnual = 0;
	private Date fechaDeCreacion = new Date();
	
	public Cuenta() {
		
	}
	
	public Cuenta(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
	    this.balance = balance;
	}
	
	public double getTasaDeInteresAnual(){
	    return tasaDeInteresAnual;
	}
	
	public void setTasaDeInteresAnual(double tasaDeInteresAnual){
	    this.tasaDeInteresAnual = tasaDeInteresAnual;
	}
	
	public Date getDate(){
	    return fechaDeCreacion;
	}

/*Toma la tasa de interes anual y la divide entre 12 meses.*/
	public double obtenerTasaDeInteresMensual(){
	    double tasaMensual;
	    tasaMensual = tasaDeInteresAnual/12;
	    return tasaMensual;
	}

/*Realiza la formula del interes mensual multiplicando la tasa de interes por el balance.*/
	public double calcularInteresesMensual(){
	    double interesMensual;
	    interesMensual = balance * obtenerTasaDeInteresMensual() ;
	    return interesMensual;
	}
	
	public void retirarDinero(double retiro){
	    balance = balance - retiro;
	}
	
	public void depositarDinero(double deposito){
	    balance = balance + deposito;
	}
}


