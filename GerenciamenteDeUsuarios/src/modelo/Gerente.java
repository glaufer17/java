package modelo;

import java.util.Date;

/**
 *
 * @author glaufer
 */
public class Gerente extends Pessoa{
    
    private int ctps;
    private Date data_adimissao;
    private String departamento;
    private double salario;
    private double bonus;

    public Gerente() {
    }

    public Gerente(int ctps, Date data_adimissao, String departamento, double salsario, double bonus, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.ctps = ctps;
        this.data_adimissao = data_adimissao;
        this.departamento = departamento;
        this.salario = salsario;
        this.bonus = bonus;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public Date getData_adimissao() {
        return data_adimissao;
    }

    public void setData_adimissao(Date data_adimissao) {
        this.data_adimissao = data_adimissao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salsario) {
        this.salario = salsario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
        System.out.println("nome: "+nome+ " CPF:" +cpf+" CPTS"+ctps+" email:"+email+" login: "+login+" senha: "+senha+
        "Data de adimissao"+data_adimissao+" Departamento"+departamento+ "Salario:"+salario+" Bonus"+bonus+ 
        "\nEndereco\n" +"Cidade: "+ endereco.getCidade()+" Rua: "+endereco.getRua()+" - "+endereco.getNumero());  
    }
     
}
