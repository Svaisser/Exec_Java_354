//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package Exe_01;

import java.util.Scanner;

public class num7 
{
    public static void main(String[] args){ 
     Scanner input2 = new Scanner(System.in);
      Double vprecusto,vacrecimo, vvalorvenda;
        
     System.out.println("Digite o valor do deposito:" );
     vprecusto = input2.nextDouble();
     vvalorvenda = vprecusto * 0.02 + vprecusto;
    System.out.println("O resultado da soma de: " + vvalorvenda);
   
 }  
}