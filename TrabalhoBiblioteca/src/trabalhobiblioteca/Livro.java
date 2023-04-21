package trabalhobiblioteca;

/**
 *
 * @author geovane e kaique
 */
public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int ano;
    private int edicao;
    private String editora;
    private String ISBN;

    public Livro(){}
    
    public Livro(int codigo, String titulo, String autor, int ano, int edicao, String editora, String ISBN) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.edicao = edicao;
        this.editora = editora;
        this.ISBN = ISBN;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
    
}
