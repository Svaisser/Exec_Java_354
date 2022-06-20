//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package Exe_01;


//import java.util.stream.DoubleStream;

public class num6 {
    
public static void main(String[] args){ 
   
    Scanner input2 = new Scanner(System.in);
     Double vjuro,vdeposi,vmontante;
     
     System.out.println("Digite o valor do deposito:" );
      vdeposi = input2.nextDouble();
      vjuro = vdeposi * 1.3;
      vmontante = vjuro + vdeposi;
     System.out.println("O resultado da soma de: " + vmontante);
    
  }  
}
