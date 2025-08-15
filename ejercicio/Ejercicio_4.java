/*
Un restaurante necesita un programa que permita al cajero:
Mostrar un menú de opciones:
1. Registrar un pedido.
2. Mostrar el total de ventas.
3. Salir del sistema.
Cada pedido se registra ingresando el precio.
El programa debe seguir mostrando el menú hasta que el cajero elija Salir.
Validar que el precio sea positivo antes de sumarlo a las ventas.
 */
package ejercicio;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double corteCaja = 0.0;
        int opc = 0;
        while (opc != 3) {
            System.out.print(" <--> Menú de opciones <-->\n 1. Registrar un pedido.\n 2. Mostrar el total de ventas.\n 3. Salir del sistema.\n Elige una opción: ");
            String num = sc.nextLine();
            try {
                opc = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("Opción no valida\n ");
            }
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el precio del pedido: ");
                    String precioTxt = sc.nextLine();
                    try {
                        double precio = Double.parseDouble(precioTxt);
                        if (precio > 0) {
                            corteCaja += precio;
                            System.out.println("Pedido registrado");
                        } else {
                            System.out.println("El precio no es un número positivo, no se guardo en el sistema, intentelo de nuevo");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ingrese un precio valido");
                    }
                    break;
                case 2:
                    System.out.printf("El total de ventas es: %.2f\n", corteCaja);
                    break;
                case 3:
                    System.out.println("Finalizo el programa.");
                    break;
                default:
                    System.out.println("Intente de nuevo con las opciones [1] [2] [3] \n ");
            }
        }
    }
}