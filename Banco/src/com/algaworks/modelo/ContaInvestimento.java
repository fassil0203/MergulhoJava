package com.algaworks.modelo;

public class ContaInvestimento  extends Conta{     //Encapsulamento

    public ContaInvestimento(Pessoa titular, int agencia, int numero){  //Construtor
        super (titular,agencia,numero);
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros / 100 ;
        depositar(valorRendimentos);
    }

}
