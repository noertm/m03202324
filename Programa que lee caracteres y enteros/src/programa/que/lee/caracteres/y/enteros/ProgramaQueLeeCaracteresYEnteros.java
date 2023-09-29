/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.que.lee.caracteres.y.enteros;

/**
 *
 * @author noor5364
 */
public class ProgramaQueLeeCaracteresYEnteros {

    /**
     * @param args the command line arguments
     */
    //te va a pedir a que clase vas (A/B/C)
    //y te va a pedir una edad
    // a la clase A van los adultos
    // a lña clase B o C van los mayores de edad 
    // el programa tiene que comprobar que estas en la clase correcta.
    
    public static void main(String[] args) {
        int edad;
        char clase; //Character(letras)
        Scanner sc = new Scanner (System.in);
        System.out.println("A que clase vas?  ");
        clase = sc.next().charAt (0);
        System.out.println("Vas al grupo " + clase);
        System.out.print("Que edad tienes?");
        edad = sc.nextInt();
        System.out.println("Tienes" + edad + "años" );
        
        if (clase== 'A' && edad>= 18)
        {
            System.out.println("vas a la clase correcte");
        }
        
        else if (clase== 'B' && edad <18)
        {
            System.out.println("Vas a la clase correcte" + clase);
        }
        
        else if (clase == 'C' && edad  <18)
        {
            System.out.println("vas a la clase correcte" + clase);
        }
        
        else 
        { 
            System.out.println("");
        }
    }
    
}
