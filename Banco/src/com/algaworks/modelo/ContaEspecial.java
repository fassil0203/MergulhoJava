package com.algaworks.modelo;

public class ContaEspecial extends Conta{
    private double valorLimite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;
    }

    @Override       //Anotacao
    public double getSaldoDisponivel() {
        return getSaldo() + getValorLimite();
    }

    @Override
    public void debitarTarifaMensal() throws IllegalAccessException {
        sacar(25);
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
}
