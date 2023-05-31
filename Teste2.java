import java.util.Scanner;
import java.util.Random;

class Teste2
{ public static void main(String[] args)
{
    int n_usuario;
    int flag=0;
    do
    {
    Random gerador=new Random();
    int n_aleatorio= gerador.nextInt(100);
    System.out.printf("%d",(n_aleatorio));

    Scanner recebe = new Scanner(System.in); 
    
    
    System.out.printf("\n"+"Adivinhe o número:"+"\n");
    n_usuario=recebe.nextInt();

    if (n_usuario==n_aleatorio)
    {
        System.out.printf("Você acertou!");
        flag=1;
    }
    else
    {
        System.out.printf("Você errou!");
        flag=0;
    }
    
    }
    while (flag==0);
}
}