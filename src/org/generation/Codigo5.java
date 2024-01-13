package org.generation;
import java.util.Scanner; // Se importó clase Scanner para leer la entrada del usuario

/* 
 * En resumen, la función del código posterior consiste en solicitar al usuario, mediante una entrada en la consola,
 * un número entero. Si este contiene en su mayoría los dígitos: 3, 7, 8 ó 9, el programa determinará que es un número
 * afortunado y lo desplegará en la consola. Si el número ingresado por el usuario contiene la misma cantidad de "dígitos 
 * afortunados" que de "no afortunados" como el "3232", determinará que es un número no afortrunado.
 */

public class Codigo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se corrigió la creación de la instancia de Scanner 
        // para leer la entrada del usuario y se cambió el nombre a la variable de asignación para mejorar entendimiento.
        System.out.print("Introduzca un número entero: "); // Se corrigió la comilla simple para definir la cadena de texto
        // y se especificó en la misma que la entrada debe ser un número entero.
        String numeroInput = scanner.nextLine(); // Esta línea lee la entrada del usuario como una cadena.
        scanner.close(); // Se agrega este método para detener el proceso del Scanner.
        int numero = Integer.parseInt(numeroInput); // Esta línea convierte la cadena a un entero
        // para evitar hacer la conversión en el ciclo, como estaba anteriormente.

        int contadorAfortunado = 0; // Se inicializa un contador para los dígitos afortunados.
        int contadorNoAfortunado = 0; // Se inicializa un contador para los dígitos no afortunados.

        while (numero > 0) { // Este ciclo solo se inicia y mantiene mientras el valor de numero sea mayor a 0.
            int digito = numero % 10; // La variable dígito almacena el último dígito de la variable número
            // mientras digito se mantiene como entero.
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                contadorAfortunado++; // El valor del contador afortunado sólo aumenta en uno cuando el valor
                // de digito es: 3, 7, 8 ó 9.
            } else {
                contadorNoAfortunado++; // En caso contrario aumnenta el contador no afortunado.
            }
            numero /= 10; // Esta línea elimina el último dígito del valor de numero.
        }

        if (contadorAfortunado > contadorNoAfortunado) { // Esta línea evalúa las iteraciones del ciclo anterior
        	// y los aumentos de cada contador
            System.out.println("El " + numeroInput + " es un número afortunado."); // Determinará que un número es afortunado
            // si el valor de contadorAfortunado es mayor que el de contadorNoAfortunado
        } else {
            System.out.println("El " + numeroInput + " no es un número afortunado.");
        }
    }
}