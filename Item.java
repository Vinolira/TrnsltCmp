package classes;

import java.util.Scanner;

public class Item extends Vendavel
{
    private int codigo;
    private String nome;
    private double valor;
    private double valorPromocional;
    private int quantidade;
    
    public Item()
    {
    Scanner scanner=new Scanner(System.in);
    codigo=scanner.nextInt();
    nome=scanner.next();
    valor=scanner.nextDouble();
    quantidade=0;
    }
    public Item(int codigo,String nome,double valor)
    {
        super();
        this.codigo=codigo;
        this.nome=nome;
        this.valor=valor;
        valorPromocional=valor;
    }
    public void setValorPromocional(double valorPromocional)
    {
        this.valorPromocional=valorPromocional;
    }
    public void setQuantidade(int quantidade)
    {
        this.quantidade=quantidade;
    }
    @Override
    public int getCodigo()
    {
        return this.codigo;
    }
    @Override
    public double comprar(int quantidade)
    {
        this.setQuantidade(this.quantidade+quantidade);
        return valorPromocional*quantidade;
    }
    @Override
    public double vender(int quantidade)
    {
        this.setQuantidade(this.quantidade-quantidade);
        return valorPromocional*quantidade;
    }
    @Override
    public String relatarEstoque()
    {
        return nome+": "+quantidade+";\n";
    }
}