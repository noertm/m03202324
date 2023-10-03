/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasdelasemana;

/**
 *
 * @author noor5364
 */
public class Diasdelasemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int mes;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Escoge entre una de estos meses e,f,m,a");
        mes = sc.next().charAt(0);
        
        switch (mes){
            case 'e' : 
            case'E':
                 System.out.println("Enero");
                System.out.println("Es el primer mes del año");
                break;
                
            case 'f': 
            case 'F':
                System.out.println("Febrero");
                break;
                
            case 'm' :
            case 'M':
                
                System.out.println("Marzo");
                break;
                
            case 'a' : 
            case 'A':
                System.out.println("Abril");
                break;
                
                case 'd' : 
            case 'D':
                System.out.println("Diciembre");
                break;
                
                
            default:
                System.out.println("Letra no valida");
                break;
                
                
            
        } 
}
