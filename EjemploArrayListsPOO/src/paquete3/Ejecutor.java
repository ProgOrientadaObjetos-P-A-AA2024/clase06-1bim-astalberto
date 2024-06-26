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
        String marca, marcaPc;
        double costo;
        ArrayList<Computador> computadoresTotales = new ArrayList<>();
        int numeroVentas;

        // Numero ventas
        System.out.println("Ingrese el número de computadores a Comprar");
        numeroVentas = entrada.nextInt();

        entrada.nextLine();

        for (int i = 0; i < numeroVentas; i++) {
            System.out.printf("Ingrese la marca del computador %d\n", i + 1);
            marcaPc = entrada.nextLine();
            // Memoria
            System.out.println("Memoria");
            System.out.printf("Ingrese marca de la memoria\n");
            marca = entrada.nextLine();
            System.out.printf("Ingrese costo de la memoria\n");
            costo = entrada.nextDouble();
            entrada.nextLine();
            Memoria m1 = new Memoria(marca, costo);
            // Procesador
            System.out.printf("Procesador");
            System.out.printf("Ingrese marca del procesador");
            marca = entrada.nextLine();
            System.out.printf("Ingrese costo del procesador%d\n", i + 1);
            costo = entrada.nextDouble();
            entrada.nextLine();

            Procesador cpu1 = new Procesador(marca, costo);

            Computador pc1 = new Computador(marcaPc, cpu1, m1);

            pc1.calcularCostoComputador();
            computadoresTotales.add(pc1);
        }

        Venta venta1 = new Venta(computadoresTotales);
        venta1.calcularValorVenta();
        System.out.printf("\n%s\n", venta1);
    }
}
