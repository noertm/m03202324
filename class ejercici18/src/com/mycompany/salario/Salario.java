

package com.mycompany.salario;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
      
       int tarifa = 20;
       int horasextra = 35; // fico it xq es un nombre ENTER
       double tarifanormal = 20; // fico double pq puede ser decimal
       double PRECIOS_EXTRA = 1.5; // fico double x el decimal
       double salario;
       
       
       
      Scanner scanner = new Scanner(System.in);
       System.out.println("cuantas horas has trabajado?");
        int horas = scanner.nextInt();
       
       double  salario;
               
       if (horas >= horasextra)
               { // tibnc q pagar hores extres
                  hextra = horas - horas normal
                  salario_extra = h_extra*t_normal*precios_extra*
                   int horasExtras = horasNormales - horasextra;
                   
                   salario = (horasNormales * tarifa)+(int)(horasExtras * tarifa * 1.5);
                   System.out.println("Tu salario es..."+ salario);
           
       }
   
   
    else {
           //tarifa normal
           //no definicio de variables
          double salario = horas * tarifanormal;
           System.out.println("Tu salario es ..." + salario);
       }
       
       System.out.println("Este es tu salario: " + salario + "euros");
    }
}


