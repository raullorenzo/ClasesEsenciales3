package edu.upc.eetac.dsa.rlorenzo.Enteros;

/**
 * 
 * @author raul
 * Ejercicio 3
 * Leer un archivo y sacar por pantalla la lista de numeros enteros con el finally
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class listaEnteros {
   public static void main(String[] args) {
       FileReader fr = null;
       try {
           fr = new FileReader("/home/raul/enteros.txt");
           BufferedReader entrada = new BufferedReader(fr);
           int car = entrada.read();
           while (car != -1) {
               System.out.print((char) car);
               car = entrada.read();
           }
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       } catch (IOException e) {
           System.out.println(e.getMessage());
       } finally {
           try {
               if (fr != null) {
                   fr.close();
               }
           } catch (IOException e) {
               System.out.println(e.getMessage());
           }
       }
   }
}