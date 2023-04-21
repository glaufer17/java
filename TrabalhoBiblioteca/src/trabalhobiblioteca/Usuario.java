package trabalhobiblioteca;
    import java.util.Scanner;
/**
 *
 * @author geovane e kaique
 */
public class Usuario {

    private String nome;
    private int cpf;
    private String telefone;
    private String matricula;

    public Usuario(String nome, int cpf, String telefone, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    Usuario() {}

   

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    Scanner sc = new Scanner(System.in);
    
    
    void cadastrarAluno(String nome, int cpf, String telefone, String matricula){
        Usuario aluno = new Usuario(nome, cpf, telefone, matricula);
        alunos.add(aluno);
        
    }
    
    /*void editarAluno(String nome, int cpf, String telefone, String matricula){
        
    }
    
    void pesquisarAluno(String nome, int cpf, String telefone, String matricula){
        
    }*/
    
    
}
