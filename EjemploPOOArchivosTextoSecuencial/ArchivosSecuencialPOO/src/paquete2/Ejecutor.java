    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Profesor;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "profesores2.txt";
        
        Profesor profesor1 = new Profesor("Tara Hernandez", "contratado");
        Profesor profesor2 = new Profesor("Gregory Walsh", "nombramiento");
        Profesor profesor3 = new Profesor("Kevin Page", "nombramiento");
        
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        // establecer el valor del atributo registro
        // Almacena datos de un objeto en un archivo de texto en el cual
        // lo concatena con un ';' y luego lo almacena en un archivo.txt
        // tomando todos los datos que se requiera almacenar
        archivo.establecerRegistro(profesor1);
        // establecer en el archivo el atributo del registro
        // Obtiene los valores de un archivo de texto.txt, y lo concatena en un
        // list para poder trabajar con los datos obtenidos 
        archivo.establecerSalida();
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor2);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
            
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor3);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
