package classes;

import java.util.List;
import java.util.LinkedList;

public class Catalogo<T extends Relatorio>
{
    private List<T> lista;
    public Catalogo()
    {
        this.lista=new LinkedList<>();
    }
    public void adicionar(T nodulo)
    {
        lista.add(nodulo);
    }
    public void remover(T nodulo)
    {
        lista.remove(nodulo);
    }
    public List<T> getLista()
    {
        return lista;
    }
    public T retornar(int codigo)
    {
        for(T nodulo:lista)
        {
            if(nodulo.getCodigo()==codigo)
            {
                return nodulo;
            }
        }
        return null;
    }
    @Override
    public String toString()
    {
        String relatorio="";
        for(T nodulo:lista)
        {
            relatorio+=nodulo.relatarEstoque();
        }
        return relatorio;
    }
}