package javapoo;

/**
 *
 * @author GLAUFER
 */
public class Contador {
    
    private int valor;

    public Contador() {
        this.valor = 0;
    }
    
    public void zerar() {
        this.valor = 0;
    }
    
    public void incrementar() {
        this.valor++;
    }
    
    public int obterValor() {
        return this.valor;
    }
}
