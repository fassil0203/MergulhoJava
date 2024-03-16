package com.algaworks.app;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
   private  double saldo;

    Conta(){        //Construtor sem argumentos
    }

    public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular) ;               //tem que ter a classe titular  boa pratica
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

       public int getAgencia() {
        return agencia;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar (double valor){      //metodo
        if (valor <=0){
            throw new IllegalArgumentException("Valor deve ser maior que Zero");
        }
        saldo =saldo + valor;
    }
    void sacar (double valor) throws IllegalAccessException {               //metodo
        if (valor <=0){
            throw new IllegalArgumentException("Valor deve ser maior que Zero");
        }
        if(saldo - valor<0){
            throw  new IllegalAccessException("Saldo Insuficiente");
        }
        saldo = saldo - valor;
    }
    void sacar (double valor, double taxaSaque) throws IllegalAccessException {
       sacar(valor + taxaSaque);
    }

}
