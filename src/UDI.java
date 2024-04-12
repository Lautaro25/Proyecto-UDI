import java.util.Scanner;
public class UDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int opcion=0, num1, num2;
		String operacion;
		do {
		System.out.println("=======================");
		System.out.println("Menú Dinamico");
		System.out.println("");
		System.out.println("1.Calculadora");
		System.out.println("2.Mayor o Menor");
		System.out.println("3.Salir del Programa");
		System.out.println("=======================");
		System.out.println("");
		System.out.print("Opción: ");
		opcion = in.nextInt();
		do {
		switch (opcion) {
			case 1: System.out.println("Ingrese que tipo de operación desea realizar:(Suma/Resta/Multiplicación/División)");
			 operacion = in.nextLine();
			 operacion = in.nextLine();
				switch (operacion) {
				case "Suma":
					System.out.print("N°1:");
					num1 = in.nextInt();
					System.out.print("N°2:");
					num2 = in.nextInt();
					System.out.println("Su resultado es: "+ (num1+num2));
					
					break;
				case "Resta":
					System.out.print("N°1:");
					num1 = in.nextInt();
					System.out.print("N°2:");
					num2 = in.nextInt();
					System.out.println("Su resultado es: "+ (num1-num2));
					break;
				case "Multiplicación":
					System.out.print("N°1:");
					num1 = in.nextInt();
					System.out.print("N°2:");
					num2 = in.nextInt();
					System.out.println("Su resultado es: "+ (num1*num2));
					break;
				case "División":
					System.out.print("N°1:");
					num1 = in.nextInt();
					System.out.print("N°2:");
					num2 = in.nextInt();
					System.out.println("Su resultado es: "+ (num1/num2));
					break;

				default:
					break;
				}
				break;

		   case 2:
				System.out.print("N°1:");
				num1 = in.nextInt();
				System.out.print("N°2:");
				num2 = in.nextInt();
				if(num1>num2) {
					System.out.println("El número "+ num1+" es mayor que el número "+num2 );
				}else {
					System.out.println("El número "+ num2+" es mayor que el número "+num1 );
				}
				
				break;

		   case 3:
			   System.out.println("Ha Salido del Programa...");
			    System.exit(opcion);
				break;


		default:
			break;
		}
        if (opcion < 4)
        {
            System.out.println();
            System.out.println("1. Realizar otra operación");
            System.out.println("2. Volver al Menú");
            System.out.println("3. Salir del Programa");
            opcion = in.nextInt();
            if (opcion==3) {
            	opcion=5;
				System.out.println("Ha salido...");
			}else if(opcion==1) {
				opcion=1;
			}else if(opcion==1) {
				
			}
        }
        
        if (opcion>5) {
        	System.out.println("Su elección no se encuentra dentro de las opciones");
        	opcion=0;
        }
		}while(opcion<2);
		}while(opcion<3);
	}

}
