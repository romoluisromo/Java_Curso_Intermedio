

package inversionpalabra;

import java.util.Scanner;


public class InversionPalabra {

    public static void main(String[] args) {
        
        String palabra = "";
        int longitudPalabra = 0;
        String palabraInvertida = "";
        Scanner in = new Scanner(System.in);
        
        System.out.print("Por favor indica la palabra que quieras invertir: ");
        palabra = in.nextLine();
        longitudPalabra = palabra.length();
        
        while(longitudPalabra != 0){
          palabraInvertida += palabra.substring(longitudPalabra -1,longitudPalabra);
          longitudPalabra--;
        }
        
        System.out.print("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }
}
