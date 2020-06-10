// María Laura Sáncehz Hernández
// 2019046864

/*"java.io.PrintStream" es usado para sustituir el uso de "System.out.println()", 
 * y "java.util.Scanner" es usado para capturar las entradas de usuario.*/
import java.io.PrintStream;
import java.util.Scanner;

class ATM {
  public static void main(String[] args){
    
    PrintStream print = System.out;
    
/* Se crea un arreglo de cuentas, este se recorre con el "for" que genera nuevas cuentas en el arreglo, 
 * posteriormente se asignan Ids y balaces mediante el "while. */
    Cuenta[] account;
    account = new Cuenta[10];
    for (int i=0;i<10;i++){
      account[i]= new Cuenta();
    }
    
    int i = 0;
    while(i < 10){
      account[i].setId(i);
      account[i].setBalance(100000);
      i++;
    }
/* Se revisa el ID, el "do-while" solo permite avanzar cuando se confirma que el Id es correcto.*/  
    int inputId = 0;
    Scanner ID = new Scanner(System.in);
    boolean flag = false;  


    do{
      print.println("Ingrese su ID: ");
      try{
        inputId = ID.nextInt();
        if(inputId > account.length-1 || inputId < 0){
          print.println("ID no existe");
        } 
        else {
          flag = true;
          break;
        }
      } catch (Exception e){
        print.println("Digite solo Numeros");
        print.println("Saliendo...");
        break;
      }
    } 
    while(true);

/* Se ejecuta el menu principal, cuando el usario seleciona una opcion esta es revisada por un switch, 
 * el cual da acceso a la operacion deseada o permite salir del programa*/ 
    while (flag == true){
            print.println("");
            print.println("Menu Principal");
            print.println("1: Ver el balance actual");
            print.println("2: Retirar dinero");
            print.println("3: Depositar dinero");
            print.println("4: Salir");
            print.println("Ingrese su selección: ");

            int InputMenu = ID.nextInt();
            double InputMonto = 0;

            switch(InputMenu){
              case 1:
                print.println("");
                print.println("Su balance actual es: "+account[inputId].getBalance());
                print.println("");
                break;
              case 2:
                print.println("");
                print.println("¿Cuanto dinero quiere retirar?");
                InputMonto = ID.nextDouble();
                account[inputId].retirarDinero(InputMonto);
                print.println("Su balance actual es: "+account[inputId].getBalance());
                print.println("");
                break;
              case 3:
                print.println("");
                print.println("¿Cuanto dinero quiere depositar?");
                InputMonto = ID.nextDouble();
                account[inputId].depositarDinero(InputMonto);
                print.println("Su balance actual es: "+account[inputId].getBalance());
                print.println("");
                break;
              case 4:
                print.println("");
                print.println("Saliendo...");
                flag = false;
                print.println("");
                break;
              default:
                print.println("");
                print.println("Seleccion Incorrecta: Digite una Opcion valida");
                print.println("");
                break;
            }
          }
  }

}

