package classes;

public abstract class Vendavel implements Relatorio
{
    private int quantidade;
    public Vendavel()
    {
        quantidade=0;
    }
    //public abstract int getCodigo();
    public abstract double comprar(int quantidade);
    public abstract double vender(int quantidade);
}