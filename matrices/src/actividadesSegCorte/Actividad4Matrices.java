package actividadesSegCorte;

import java.util.Scanner;

/*
1. Crear una matriz y llenarla con valores de prueba.
2. Imprimir los valores de la matriz en las dos diagonales.
3. Subir el codigo a github y compartir la URL en la entrega.
 */
public class Actividad4Matrices {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // CARGANDO DATOS MANUALMENTE SIN USAR CICLOS
        int[][] matriz = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 100, 110, 120},
            {130, 140, 150, 160}
        };

        // Imprimir la matriz completa (solo para referencia)
        System.out.println("Matriz completa:");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }

        // Imprimir los valores de la diagonal principal
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println(); // Salto de línea

        // Imprimir los valores de la diagonal secundaria
        System.out.println("\nDiagonal secundaria:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][3 - i] + " ");
        }
    }
}