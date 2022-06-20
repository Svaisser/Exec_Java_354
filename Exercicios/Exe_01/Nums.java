//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package Exe_01;

import java.util.Scanner;

public class Nums {
   Integer num;
public static void main(String[] args){
    
    Scanner input2 = new Scanner(System.in);
    int numero1,numero2, soma;
    
    System.out.println("Digite o primeiro numero:" );
    numero1 = input2.nextInt();
    System.out.println("Digite o segundo numero:" );
    numero2 = input2.nextInt();
    soma = numero2 + numero1;
    System.out.println("O resultado da soma de: " + soma);
    }
}