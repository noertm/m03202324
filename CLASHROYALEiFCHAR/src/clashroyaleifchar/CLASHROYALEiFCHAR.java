/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleifchar;

import java.util.Scanner;

/**
 *
 * @author noor5364
 */
public class CLASHROYALEiFCHAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void main(String[] args) {
        int copas;
       char eleccio;
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("pon letra?");
        System.out.println("¿Cuántas copas tienes?");
        copas = scanner.nextInt();
       
        if (copas < 2000) {
            System.out.println("Elige una carta:");
            System.out.println("0 - Mago Eléctrico");
            System.out.println("1 - Mega Esbirro");
           
            int eleccion = scanner.nextInt();
           
            if (eleccion == 0) {
                System.out.println("Has elegido Mago Eléctrico.");
            } else if (eleccion == 1) {
                System.out.println("Has elegido Mega Esbirro.");
            } else {
                System.out.println("Opción no válida. Por favor, elige 0 o 1.");
            }
        } else if (copas >= 2000 && copas < 3000) {
            System.out.println("Elige una carta:");
            System.out.println("0 - Caballero");
            System.out.println("1 - Bandida");
           
            int eleccion = scanner.nextInt();
           
            if (eleccion == 0) {
                System.out.println("Has elegido Caballero.");
            } else if (eleccion == 1) {
                System.out.println("Has elegido Bandida.");
            } else {
                System.out.println("Opción no válida. Por favor, elige 0 o 1.");
            }
        } else if (copas >= 3000) {
            System.out.println("Elige una carta:");
            System.out.println("0 - Gigante");
            System.out.println("1 - Ejército de Esqueletos");
           
            int eleccion = scanner.nextInt();
           
            if (eleccion == 0) {
                System.out.println("Has elegido Gigante.");
            } else if (eleccion == 1) {
                System.out.println("Has elegido Ejército de Esqueletos.");
            } else {
                System.out.println("Opción no válida. Por favor, elige 0 o 1.");
            }
        } else {
            System.out.println("Opción no válida. Por favor, ingresa una cantidad de copas válida.");
        }
        System.out.println("Opcion?");
        eleccio = sc.next.()charAt(0); // aixo es per reollir un caracter ( no posar un 0 posar un A,B,C... ) 
        System.out.println("eleccio--<" + eleccion);
        
        if (eleccio=="s" || eleccio=="S")
           {
            System.out.println("has escogido esqueletos");
            }
        
            else if  (eleccio == g)
            {System.out.println("has escogido g");
            }
        
}

}
