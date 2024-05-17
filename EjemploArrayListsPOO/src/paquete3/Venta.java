/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta(ArrayList<Computador> c) {
        computadoras = c;
    }

    public void establecerComputadoras(ArrayList<Computador> c) {
        computadoras = c;
    }

    public void calcularValorVenta() {
        double suma = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            suma = suma + computadoras.get(i).obtenerCostoComputador();
        }
        valorVenta = suma;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    @Override
    public String toString() {
        String cadena = "Ventas\n";

        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("%s------------------------\n", cadena);
            cadena = String.format("%sComputadora %d\n", cadena, (i + 1));
            cadena = String.format("%sMarca: %s\n",
                    cadena,
                    computadoras.get(i).obtenerMarca());
            cadena = String.format("%sMemoria\nMarca: %s\nCosto: %.2f\n",
                    cadena,
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerCosto());
            cadena = String.format("%sProcesador\nMarca: %s\nCosto: %.2f\n",
                    cadena,
                    computadoras.get(i).obtenerProcesador().obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerCosto());
            cadena = String.format("%s\n------------------------\n",
                    cadena);
        }
        cadena = String.format("%sValor total de la Venta: %.2f\n",
                cadena, valorVenta);
        return cadena;
    }

}
