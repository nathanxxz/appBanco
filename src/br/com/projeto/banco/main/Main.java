package br.com.projeto.banco.main;

import br.com.projeto.banco.model.AppBanco;
import br.com.projeto.banco.model.Conta;
import br.com.projeto.banco.model.Data;

public class Main {
    public static void main(String[] args) {
        Conta conta=new Conta("Beru","66666666","18727",new Data(1,9,2025));
        AppBanco appBanco=new AppBanco(conta);
        appBanco.depositar(500.00);
        appBanco.sacar(12.35);
        appBanco.entrar("12727","123");
        appBanco.entrar("66666666","18727");
        appBanco.sacar(1000.00);
        appBanco.sacar(200.00);
        appBanco.consultarSaldo();
        appBanco.sair();
        appBanco.consultarSaldo();

    }
}
