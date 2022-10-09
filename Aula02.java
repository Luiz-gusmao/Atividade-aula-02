/*
    Aluno: Luiz Fernando Vidal Gusmão
 
    Matricula: 201902224558
 */

import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) throws Exception {

        atividade_2_1();
        atividade_2_2();
        atividade_2_3();

        
    }

    public static void atividade_2_1()
	{
        Scanner input = new Scanner(System.in);

        int a,b;

        System.out.println("Atividade 2.1\n");

        System.out.print("Digite o valor de A ");
        a = input.nextInt();

        System.out.print("Digite o valor de B ");
        b = input.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, (a+b));
        System.out.printf("%d X %d = %d\n", a, b, (a * b));
        System.out.printf("%d - %d = %d\n", a, b, (a - b));
        System.out.printf("%d / %d = %d\n", a, b, (a / b));
        System.out.println("\n \n\n");


        
    }

    public static void atividade_2_2()
	{
        System.out.println("Atividade 2.2\n");

        Scanner input = new Scanner(System.in);

        int a,b;

        System.out.print("Digite o valor de A ");
        a = input.nextInt();

        System.out.print("Digite o valor de B ");
        b = input.nextInt();

        if (a < b){
            System.out.printf("%d < %d\n", a, b);
        }

        if (a > b){
            System.out.printf("%d > %d\n", a, b);
        }

        if (a == b){
            System.out.printf("%d = %d\n", a, b);
        }

        System.out.println("\n \n\n");

    }

    public static void atividade_2_3()
	{
        System.out.println("Atividade 2.3\n");

        Scanner input = new Scanner(System.in);

        int a,b,c;

        int [] arr = new int []{0,0,0} ;     
        int sort = 0;    
    
        System.out.print("Digite o valor de A ");
        a = input.nextInt();
        arr[0]=a;

        System.out.print("Digite o valor de B ");
        b = input.nextInt();
        arr[1]=b;

        System.out.print("Digite o valor de C ");
        c = input.nextInt();
        arr[2]=c;


        System.out.printf("%d + %d + %d = %d\n", a, b, c, (a+b+c));
        System.out.printf("(%d + %d + %d)/3 = %d\n", a, b, c, (a+b+c)/3);
        System.out.printf("%d X %d X %d = %d\n", a, b, c, (a*b*c));

        
        for (int x = 0; x < arr.length; x++) {     
            for (int y = x+1; y < arr.length; y++) {     
               if(arr[x] < arr[y]) {    
                   sort = arr[x];    
                   arr[x] = arr[y];    
                   arr[y] = sort;    
               }     
            }     
        }   
        
        System.out.print("Os maiores numeros são em sequencia: ");   
        for (int i = 0; i < arr.length; i++) {    
  
            if(i<(arr.length-1))
            System.out.print(arr[i] + ",");

            if(i>=(arr.length-1))
            System.out.print(arr[i]);

        }    




    }
}
