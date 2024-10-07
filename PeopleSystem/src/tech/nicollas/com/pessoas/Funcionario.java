package tech.nicollas.com.pessoas;

public class Funcionario extends Pessoa {

    private String nome;
    private Cargo cargo;
    private float salario;
    private String dataAdmissao;
    private int matricula;

    public enum Cargo {
        DiretorDePesquisaEDesenvolvimentoDeProfissões,
        GerenteDeAnáliseDeMercadoDeProfissões,
        CoordenadorDeCuradoriaDeProfissõesExóticas,
        AnalistaDeProfissõesEmergentes;
    }

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    //METODO PARA REAJUSTAR O SALARIO
    public void reajustarSalario(float percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        } else {
            System.out.println("O percentual de reajuste deve ser positivo.");
        }
    }

    //METODO PARA PROMOVER O FUNCIONARIO
    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
        System.out.println("Funcionário promovido para o cargo de " + novoCargo);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", matricula=" + matricula +
                '}';
    }

}
