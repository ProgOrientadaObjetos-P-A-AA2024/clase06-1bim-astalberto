/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca;
        double costo;
        ArrayList<Computador> computadoresTotales = new ArrayList<>();
        int numeroVentas;

        // Numero ventas
        System.out.println("Ingrese el número de computadores a Comprar");
        numeroVentas = entrada.nextInt();

        entrada.nextLine();

        for (int i = 0; i < numeroVentas; i++) {
            // Memoria
            System.out.printf("Ingrese marca de la memoria %d\n", i + 1);
            marca = entrada.nextLine();
            System.out.printf("Ingrese costo de la memoria %d\n", i + 1);
            costo = entrada.nextDouble();
            entrada.nextLine();
            Memoria m1 = new Memoria(marca, costo);
            // Procesador
            System.out.printf("Ingrese marca del procesador %d\n", i + 1);
            marca = entrada.nextLine();
            System.out.printf("Ingrese costo del procesador%d\n", i + 1);
            costo = entrada.nextDouble();
            entrada.nextLine();

            Procesador cpu1 = new Procesador(marca, costo);
            // con las variables nota y nombreEstudiante se procede
            // a crear un objeto de tipo Calificacion
            //
            System.out.println("Ingrese la marca del computador");
            marca = entrada.nextLine();

            Computador pc1 = new Computador(marca, cpu1, m1);
  
            pc1.calcularCostoComputador();
            computadoresTotales.add(pc1);
        }

        Venta venta1 = new Venta(computadoresTotales);
        venta1.calcularValorVenta();
        System.out.printf("\n%s\n", venta1);
    }
}
