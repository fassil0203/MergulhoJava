package com.algaworks.app;

import com.algaworks.modelo.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
            Pessoa titular1 = new Pessoa();
            titular1.setNome("Fabio Silva");
            titular1.setDocumento("12121212");

            CaixaEletronico caixaEletronico = new CaixaEletronico();

//            Pessoa titular2 = new Pessoa();
//            titular2.setNome("Rafael Santana");
//            titular2.setDocumento("12233445");

            ContaInvestimento minhaConta = new ContaInvestimento(titular1, 8253 - 8, 1696 - 0); //Utilizando o Construtor
            ContaEspecial suaConta = new ContaEspecial(titular1,333,1636-5,1500);
            minhaConta.depositar(5000);
//            minhaConta.sacar(15500);
            //minhaConta.creditarRendimentos(0.8);



            Conta conta = minhaConta;         //upcaastinh Polimorfismo
            minhaConta.depositar(520);
            minhaConta.debitarTarifaMensal();

//            ContaEspecial suaConta = new ContaEspecial(titular2, 312352 - 7, 0036,1000);
                    suaConta.depositar(15000.00);
                    suaConta.sacar(16500);

            caixaEletronico.imprimirSaldo(minhaConta);


    }
}