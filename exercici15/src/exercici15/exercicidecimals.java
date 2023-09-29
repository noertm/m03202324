/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici15;

/**
 *
 * @author noor5364
 */
public class exercicidecimals {
    
    //Dibuja un ordinograma que lea una calificación numérica entre 0 y 10 y la transforma en
//calificación alfabética, escribiendo el resultado.
// de 0 a &lt;3 Muy Deficiente.
// de 3 a &lt;5 Insuficiente.
// de 5 a &lt;6 Bien.
// de 6 a &lt;9 Notable
// de 9 a 10 Sobresaliente
}
    
    public static void main(String[] args) {
    double nota;
Scanner sc = new Scanner(System.in);
System.out.print("Que nota has sacado...");
nota = sc.nextDouble();

if (nota<0 ||  nota<10 )
{ 
System.out.println("Nota no valida")
}
if(nota<=0 && nota<3) 
{
System.out.println("Muy deficiente");
}

else if (nota>=3 && nota<5)
{
  System.out.println("Deficiente");
}
    
else if (nota<=5 && nota <6);
{
System.out.println("Bien");
}
else if (nota<=6 && nota<9);
{
System.out.println("Notable");
}




