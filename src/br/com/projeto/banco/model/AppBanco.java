package br.com.projeto.banco.model;

public class AppBanco   {
    public Conta conta;

    public AppBanco(Conta conta){
        this.conta=conta;
    }
    public void entrar(String cpf, String senha){
        boolean verificacao= conta.entrar(cpf,senha);
        if (verificacao){
            System.out.println("Login realizado!");
        }
        else {
            System.out.println("Credenciais Inválidas!");
        }

    }
    public void sair(){
        boolean sair= conta.sair();
        if (!sair){
            System.out.println("Saiu da conta!");
        }
        else {
            System.out.println("Erro ao sair!");
        }
    }
    public void depositar(Double valor){
        conta.depositar(valor);
        System.out.println("Deposito realizado!");
    }
    public void sacar(double valor){
        boolean logado = conta.sacar(valor);
        if (logado){
            System.out.println("O valor foi sacado!");
        }else {
            System.out.println("Sem permissão para sacar!");
        }
    }

    public void consultarSaldo() {
        double saldo = conta.consultarSaldo();
        if (saldo > -1) {
            System.out.printf("Saldo atual: %.2f\n", saldo);
        } else {
            System.out.println("Sem permissão para visualizar!");
        }
}
    public  String toString(){
        return conta.toString();
    }
}
