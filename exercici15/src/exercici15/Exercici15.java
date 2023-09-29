/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.io.InputStream;

/**
 *
 * @author noor5364
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicio
        int x, y, zScanner sc = new Scanner(System.in);
        
        //leer x,y,z
        System.out.print("Introduce x");
        x = sc.nextInt();
        System.out.print("Introduce y");
        y = sc.nextInt();
         System.out.println("Introduce z");
        z = sc.nextInt();
        
        if (x>=y && x>=z)
        {
          System.out.println("Mostrar X es mayor que y z... " + x);  
        }
        // poner ahora el resultado del true de if
        
        else if(y>=x && y>=z)
        {
             System.out.println("Mostrar y mayor" + y );
        }
         else
        {
        System.out.println("Mostrar z es más grande " + z);
                }        
    }
    }
        
        
       
      

