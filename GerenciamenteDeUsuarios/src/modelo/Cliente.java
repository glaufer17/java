package modelo;

/**
 *
 * @author glaufer
 */
public class Cliente extends Pessoa {
    protected double limite_credito;

    public Cliente() {
    }

    public Cliente(double linite_credito, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.limite_credito = linite_credito;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

    public void exibirInformacoes() {
        System.out.println("nome: "+nome+ " CPF:" +cpf+" email:"+email+" login: "+login+" senha: "+"Limite de credito: "+limite_credito+
        "\nEndereco\n" +"Cidade: "+ endereco.getCidade()+" Rua: "+endereco.getRua()+" - "+endereco.getNumero()); 
    }
        
}
