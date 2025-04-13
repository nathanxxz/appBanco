package br.com.projeto.banco.model;

public class Conta {
    public String nome;
    public String cpf;
    public String senha;
    public double saldo=0;
    public boolean autenticado=false;
    public Data CriadoEm;

    public Conta(String nome,String cpf, String senha, Data CriadoEm){
        this.nome=nome;
        this.cpf=cpf;
        this.senha=senha;
        this.CriadoEm=CriadoEm;
    }
    public boolean entrar(String cpf, String senha){
        if (cpf.equals(this.cpf) && senha.equals(this.senha)){
            return this.autenticado= true;
        }
        else{
            this.autenticado=false;
            return false;
        }
    }
    public boolean sair(){
        if (this.autenticado==true){
            System.out.println("Saindo");
        }
        else {
            System.out.println("Ja esta fora da plataforma, nao precisa sair");
            return this.autenticado;
        }
        return false;
    }
    public double depositar( double valor){
        if (valor<=0){
            System.out.println("Erro");
        }
        this.saldo += valor;
        System.out.println("Depositando " + valor);
        return this.saldo;
    }
    public  boolean sacar(double valor){
        if (!this.autenticado){
            return false;
        }
        if (valor<=0) {
            System.out.println("Infelizmente voce nao pode sacar");
        }
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente.");
            return false;
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
        return true;
    }
    public double consultarSaldo(){
        if (this.autenticado==true){
           System.out.println("Exibindo valor");
            return this.saldo;
        }
        else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "<Conta: nome=" + nome + ", criadoEm=" + CriadoEm.toString() + ">";
    }
}
