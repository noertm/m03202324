/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdias.de.la.semna;

import java.util.Scanner;

/**
 *
 * @author noor5364
 */
public class SwitchdiasDeLaSemna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appication logic here
        int dia;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Pon un numero del 1 al 7");
        dia = sc.nextInt();
        
        switch (dia){
            case 1 : 
                //dia = 1000;( es un ejemplo)
                System.out.println("Lunes");
                System.out.println("Es el primer dia de la semana");
                break;
                
            case 2: 
                System.out.println("Martes");
                break;
                
            case 3 :
                System.out.println("Miercoles");
                break;
                
            case 4 : 
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6 :
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
                
                
                
                
            default:
                System.out.println("dia no valido");
        }
    }
    
}
