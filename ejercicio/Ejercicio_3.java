/*Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas
(double). 
Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas
inferiores a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
para realizar los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es menor que 1.0 o mayor que 10.0 debe salirse del
ciclo for y mostrar un mensaje de error finalizando el programa.*/
package ejercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notasFinal = 20, ContadorNotasMayoresIguales_6 = 0, ContadorNotasMenores_6 = 0, contadorNotasIguales_1 = 0;
        double notas = 0, promedioTotal = 0, SumaNotasMayoresIguales_6 = 0, SumaNotasMenores_6 = 0;
        for (int i = 1; i <= notasFinal; i++) {
            System.out.print("Ingrese las notas número " + i + " en una escala de (1.0 a 10.0): ");
            notas = sc.nextDouble();
            if (notas < 1 || notas > 10) {
                System.out.println("Error finalizando el programa.");
                return;
            }
            promedioTotal += notas;
            if (notas >= 6) {
                SumaNotasMayoresIguales_6 += notas;
                ContadorNotasMayoresIguales_6++;
            } else {
                SumaNotasMenores_6 += notas;
                ContadorNotasMenores_6++;
            }
            if (notas == 1) {
                contadorNotasIguales_1++;
            }
        }
        System.out.printf("Promedio de notas >= 6: %.2f\n",
                (ContadorNotasMayoresIguales_6 > 0) ? (SumaNotasMayoresIguales_6 / ContadorNotasMayoresIguales_6) : 0);
        System.out.printf("Promedio de notas < 6: %.2f\n",
                (ContadorNotasMenores_6 > 0) ? (SumaNotasMenores_6 / ContadorNotasMenores_6) : 0);
        System.out.println("Cantidad de notas iguales a 1: " + contadorNotasIguales_1);
        System.out.printf("Promedio de notas: %.2f\n", promedioTotal / notasFinal);
    }
}
