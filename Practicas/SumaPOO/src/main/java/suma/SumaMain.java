package suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Por favor indica el primer valor a sumar: ");
        int valorUno = in.nextInt();

        System.out.print("Por favor indica el segundo valor a sumar: ");
        int valorDos = in.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos);
        
        valores.Imprimir();
    }
}
