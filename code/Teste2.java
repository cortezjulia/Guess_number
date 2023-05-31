import java.util.Scanner;
import java.util.Random;

class Teste2
{ public static void main(String[] args)
{
    int n_usuario;
    int flag=0;
    int range=0;
    while (true)
    {
    System.out.println("Selecione o Nível de Dificuldade:");
    System.out.println("Fácil (1)     Moderado (2)     Difícil (3)");
    Scanner recebe_opcao= new Scanner(System.in);
    System.out.println("Digite o número correspondente: ");
    int op_usuario=recebe_opcao.nextInt();

    if (op_usuario==1)
    {
    range=10;
    }
    else if (op_usuario==2)
    {
        range=50;
    }
    else if (op_usuario==3)
    {
        range=100;
    }
    



    do
    {
    Random gerador=new Random();
    int n_aleatorio= gerador.nextInt(range);
    System.out.printf("%d",(n_aleatorio));

    Scanner recebe_numero = new Scanner(System.in); 
    





    System.out.printf("\n"+"Adivinhe o número:"+"\n");
    n_usuario=recebe_numero.nextInt();

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
}