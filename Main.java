import classes.Relatorio;
import classes.Vendavel;
import classes.Item;
import classes.Pessoa;
import classes.Catalogo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double saldo=250000;
        Scanner scanner=new Scanner(System.in);
        Catalogo<Item> produtos=new Catalogo();
        Catalogo<Pessoa> clientes=new Catalogo();
        while(true)
        {
            System.out.printf("(1) Cadastrar produto\n(2) Cadastrar cliente\n(3) Registrar compra\n(4) Registrar venda\n(5) Gerenciar estoque\n(6) Gerar relatório\n(0) Sair\n");
            int opcao=scanner.nextInt();
            if(opcao==0)
            {
                break;
            }
            if(opcao!=1&&opcao!=2&&opcao!=3&&opcao!=4&&opcao!=5&&opcao!=6)
            {
                System.out.printf("\nEscolha uma opção válida!\n");
                continue;
            }
            if(opcao==1)
            {
                Item produto=new Item();
                produtos.adicionar(produto);
            }
            if(opcao==2)
            {
                Pessoa cliente=new Pessoa();
                clientes.adicionar(cliente);
            }
            if(opcao==3)
            {
                System.out.printf("Digite o codigo do produto: ");
                int codigo=scanner.nextInt();
                System.out.println();
                System.out.printf("Digite a quantidade a ser comprada: ");
                int quantidade=scanner.nextInt();
                System.out.println();
                Item comprado=produtos.retornar(codigo);
                saldo-=comprado.comprar(quantidade);
            }
            if(opcao==4)
            {
                System.out.printf("Digite o codigo do produto: ");
                int codigo=scanner.nextInt();
                System.out.println();
                System.out.printf("Digite a quantidade a ser vendida: ");
                int quantidade=scanner.nextInt();
                System.out.println();
                Item vendido=produtos.retornar(codigo);
                saldo+=vendido.vender(quantidade);
            }
            if(opcao==5)
            {
                System.out.println(produtos.toString());
            }
            if(opcao==6)
            {
                System.out.println(saldo);
            }
        }
    }
}