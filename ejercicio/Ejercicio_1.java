/*Mediante el teclado pedir dos números enteros positivos o negativos 
y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
Puede utilizar una sentencia for para realizar la multiplicación y 
tener en cuenta los unarios, donde menos por menos es positivo. */
package ejercicio;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, unitario = 1, resultado = 0, positivo1 = 0,positivo2 = 0 ;
        System.out.print("Ingrese el primer número entero: ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        numero2 = sc.nextInt();
        if ((numero1 < 0 && numero2 > 0) || (numero1 > 0 && numero2 < 0)) {
            unitario = -1;
        }
        positivo1 = (numero1 < 0 ) ? -numero1 : numero1;
        positivo2 = (numero2 < 0 ) ? -numero2 : numero2;
        for(int i = 0 ; i < positivo2 ;i++ ) {
            resultado += positivo1;
        }
        resultado *=unitario;
        System.out.println("Resultado de: " + numero1 + " por " + numero2 + " = " + resultado);
    }
}