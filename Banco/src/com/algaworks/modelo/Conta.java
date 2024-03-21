package com.algaworks.modelo;

import java.util.Objects;

public abstract class Conta {
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
            public double getSaldoDisponivel(){
            return getSaldo();
        }

            public void depositar(double valor){      //metodo
                if (valor <=0){
                    throw new IllegalArgumentException("Valor deve ser maior que Zero");
                }
                saldo =saldo + valor;
            }
            public void sacar(double valor) throws IllegalAccessException {               //metodo
                if (valor <= 0){
                    throw new IllegalArgumentException("Valor deve ser maior que Zero");
                }
                if(getSaldoDisponivel() - valor < 0){
                    throw  new IllegalAccessException("Saldo Insuficiente");
                }
                saldo = saldo - valor;
            }

            public void sacar(double valor, double taxaSaque) throws IllegalAccessException {
               sacar(valor + taxaSaque);
            }


    public abstract void debitarTarifaMensal() throws IllegalAccessException;
}
