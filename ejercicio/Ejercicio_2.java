/*Crear una clase con el método main donde el desafío es buscar el número menor de
mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a
comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para
pedir el entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "EI número menor es menor que 10!" si no,
imprimir " el numero menor es igual o mayor que 10!" */
package ejercicio;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a comparar, este debe ser mínimo 10 números: ");
        int cantidad = sc.nextInt();
        if (cantidad < 10) {
            System.out.println("Usted debe ingresar mínimo 10 números.");
            return;
        }
        int menor = Integer.MAX_VALUE;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("El número menor es: " + menor);
        if (menor < 10) {
            System.out.println("¡El número " + menor + " es menor que 10!");
        } else if (menor <= 10) {
            System.out.println("¡El número " + menor + " es igual a 10!");
        } else {
            System.out.println("¡El número " + menor + " es mayor que 10!");
        }
    }
}
