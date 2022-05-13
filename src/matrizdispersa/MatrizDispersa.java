/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizdispersa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sala306
 */
public class MatrizDispersa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        //int Mat[][] = new int [3][3];
        /*int [][] Mat = {{2,4,4},{6,6,9},{8,10,12}};
        
        for(int i = 0; i < Mat.length ; i++ )
        {
            for( int j = 0 ; i < Mat[i].length; j++)
            { 
                    
            }
        }
         */
        Tripleta T1 = new Tripleta(10);
        //T1.crear(5, 3, 10, matriz);
        T1.mostrar();
        leerArchivo();
    }

    public static void leerArchivo() {
        int[][] matriz;
        try {
            BufferedReader br = new BufferedReader(new FileReader("matriz.txt"));
            //Primera linea nos dice longitud de la matriz
            String linea = br.readLine();
            int longitud = Integer.parseInt(linea);
            matriz = new int[longitud][longitud];
            //Las siguientes lineas son filas de la matriz
            linea = br.readLine();
            int fila = 0; //Para recorrer las filas de la matriz
            while (linea != null) {
                /*
				 * Tenemos todos los enteros JUNTOS en el String linea.
				 * Con split() los SEPARAMOS en un array donde cada entero
				 * es un String individual. Con un bucle, los parseamos a Integer
				 * para guardarlos en la matriz
                 */
                String[] enteros = linea.split(" ");
                for (int i = 0; i < enteros.length; i++) {
                    matriz[fila][i] = Integer.parseInt(enteros[i]);
                }

                fila++; //Incrementamos fila para la próxima línea de enteros
                linea = br.readLine(); //Leemos siguiente línea
            }
            br.close(); //Cerramos el lector de ficheros

            //Mostramos la matriz leída
            for (int i = 0; i < longitud; i++) {
                for (int j = 0; j < longitud; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra archivo");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("No se pudo convertir a entero");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error accediendo al archivo.");
            e.printStackTrace();
        }
    }
}
