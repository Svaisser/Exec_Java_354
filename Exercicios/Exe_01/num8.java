//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package Exe_01;

import java.util.Scanner;

public class num8 {
    
public static void main(String[] args){ 
   
    Scanner input2 = new Scanner(System.in);
     Double vagua,vluz,vcomida,valuguel,vgas,vnet,vlazer,vinvest,vsalario;
     
     System.out.println("-Digite o valor de consumo mensal- " );
     System.out.println("Agua:");
     vagua = input2.nextDouble();
     System.out.println("Luz:");
     vluz = input2.nextDouble();
     System.out.println("Aluguel:");
     valuguel = input2.nextDouble();
     System.out.println("Comida:");
     vcomida = input2.nextDouble();
     System.out.println("Gas:");
     vgas = input2.nextDouble();
     System.out.println("Wifi:");
     vnet = input2.nextDouble();
     System.out.println("Lazer:");
     vlazer = input2.nextDouble();
     System.out.println("investimentos:");
     vinvest = input2.nextDouble();
      vsalario= vagua+valuguel+vluz+vcomida+vgas+vnet+vlazer+vinvest;
     System.out.println("O salario ideal é: " + vsalario);
    
  }  
}

