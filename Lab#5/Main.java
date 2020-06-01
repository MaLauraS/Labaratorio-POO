// María Laura Sáncehz Hernández
// 2019046864

/*"java.io.PrintStream" es usado para sustituir el uso de "System.out.println()"*/
import java.io.PrintStream;

class Main {
	public static void main(String[] args){
		PrintStream print = System.out;
	
/*Se crean las cuentas con un constructor con los parametros especificados e indica la tasa de interes.*/
		Cuenta acc = new Cuenta(1122, 500000);
	    acc.setTasaDeInteresAnual(4.5);
	    acc.depositarDinero(150000);
	    acc.retirarDinero(200000);
	    print.println("Balance: "+acc.getBalance()+", Interes Mensual: "+acc.obtenerTasaDeInteresMensual()+", Fecha de Creacion: "+ acc.getDate());

	    Cuenta acc2 = new Cuenta(2505, 250000);
	    acc2.setTasaDeInteresAnual(3.2);
	    acc2.depositarDinero(22000);
	    acc2.retirarDinero(164000);
	    print.println("Balance: "+acc2.getBalance()+", Interes Mensual: "+acc2.obtenerTasaDeInteresMensual()+", Fecha de Creacion: "+ acc2.getDate());
	}

}
