package classes;

import java.util.Scanner;
import java.time.LocalDate;

public class Pessoa implements Relatorio
{
    private int codigo;
    private String nome;
    private double saldo;
    private LocalDate data_nasc;
    private String CPF;
    private String RG;
    private String endereco;

    public Pessoa()
    {
        Scanner scanner=new Scanner(System.in);
        codigo=scanner.nextInt();
        nome=scanner.next();
        String data=scanner.next();
        data_nasc=LocalDate.parse(data);
        CPF=scanner.next();
        RG=scanner.next();
        endereco=scanner.next();
        saldo=0;
        
    }
    public Pessoa(int codigo,String nome,LocalDate data,String CPF,String RG,String endereco)
    {
        this.codigo=codigo;
        this.nome=nome;
        data_nasc=data;
        this.CPF=CPF;
        this.RG=RG;
        this.endereco=endereco;
        saldo=0;
    }
    @Override
    public int getCodigo()
    {
        return this.codigo;
    }
    @Override
    public String relatarEstoque()
    {return "";}
}