package com.algaworks.app;

import com.algaworks.modelo.Conta;
import com.algaworks.modelo.Pessoa;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Fabio Silva");
        titular1.setDocumento("12121212");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Rafael Santana");
        titular2.setDocumento("12233445");

        Conta minhaConta = new Conta(titular1, 8253 - 8, 1696 - 0); //Utilizando o Construtor

        minhaConta.depositar(25000);
        minhaConta.sacar(5000, 10);



        Conta suaConta = new Conta(titular2, 312352 - 7, 0036);
        suaConta.depositar(40000.00);
        minhaConta.sacar(2000);


        System.out.println("Titular :" + minhaConta.getTitular().getNome());
        System.out.println("Agencia :" + minhaConta.getAgencia());
        System.out.println("Numero da com.algaworks.modelo.Conta : " + minhaConta.getNumero());
        System.out.println("Saldo da com.algaworks.modelo.Conta : " + minhaConta.getSaldo());

        System.out.println("***************************************************");
        System.out.println("***************************************************");


        System.out.println("Titula da com.algaworks.modelo.Conta : " + titular1.getNome());
        System.out.println("Agencia :" + suaConta.getAgencia());
        System.out.println("Numero da com.algaworks.modelo.Conta :" + suaConta.getNumero());
        System.out.println("Saldo da com.algaworks.modelo.Conta :" + suaConta.getSaldo());

    }
}