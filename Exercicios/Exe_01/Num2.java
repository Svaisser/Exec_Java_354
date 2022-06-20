//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package Exe_01;

import java.util.Scanner;

public class Num2 {
   Integer num;
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int numero1,numero2, soma, subtracao, multiplicacao, divisao;
    System.out.println("Digite o primeiro numero:" );
    numero1 = input.nextInt();
    System.out.println("Digite o segundo numero:" );
    numero2 = input.nextInt();
    soma = numero2 + numero1;
    subtracao = numero1 - numero2;
    multiplicacao = numero2 * numero1;
    divisao = numero1 / numero2;
    System.out.println("O resultado da soma: " + soma);
    System.out.println("O resultado da subtracao: " + subtracao);
    System.out.println("O resultado da multiplicacao: " + multiplicacao);
    System.out.println("O resultado da divisao: " + divisao);
    }
}