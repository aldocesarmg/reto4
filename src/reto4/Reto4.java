
package reto4;

import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        double costo_boleto;
        
        do{
            System.out.println("Indique el tipo de boleto");
            opcion = sc.next().charAt(0);
            switch (opcion){
                case 'A':
                    costo_boleto = 100.00;
                    break;
                case 'B':
                    costo_boleto = 70.00;
                    break;
                case 'I':
                    costo_boleto = 50.00;
                    break;
                case 'N':
                    costo_boleto = 70.00;
                    break;
                default:
                    System.out.println("Opción no disponible");
            }
            System.out.println("Costo del boleto es "+costo_boleto);
            System.out.println("Otro boleto (s/n)?");
            opcion = sc.next().charAt(0);
        }while(opcion != 'n');
    }
    
}
