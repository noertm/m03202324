/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg2;

/**
 *
 * @author noor5364
 */
public class exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1,valor2;
        Scanner sc = new Scanner (source:System.in);
        System.out.print(s: "Pon valor l...");
        valor1 = sc.nextIn();
        System.out.println(s:"Pon valor 2...");
        valor2 = sc.nextInt();
        
        suma = valor1+ valor2;
        resta = valor1 - valor2;
        
        System.out.println(valor1 + "+" + valor2 +" = " + suma);
        
        // voy a poner lo q falta porque voy muy perdida
                // FALTA INFORMACIÓN!!!!
                
                if (valor2 !=0) // diferent de 0 CONDICIONAL!!! IF  CONDICIONAL ROMBO TRUE OR FALSE
                    { // si esto es true
                    division = (double) valor1/valor2;//double casteja el resultat la tipus doble
                    System.out.println ( valor1+ " / " + valor2 + " = " + division);
                }
                else
                {// FALSE
                    System.out.println(x: "No puedo dividir por 0...");
                }
                
                
    suma = valor1 + valor2;
    resta= valor1 - valor2;
    multi = valor1 * valor2;
    // division = valor1/valor2; // La divisió (/) ho retorna com int
    division = (double) valor1/valor2; //double casteja el resultat la tipus doble
    
}
