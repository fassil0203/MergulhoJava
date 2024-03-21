package com.algaworks.modelo.atm;

import com.algaworks.modelo.Conta;
import com.algaworks.modelo.pagamento.DocumentoPagar;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta :" + conta.getAgencia()+"/" +conta.getNumero());
        System.out.println("Titular :" + conta.getTitular().getNome());
        System.out.println("Saldo :" + conta.getSaldo());

    }
    public void pagar(DocumentoPagar documento, Conta conta ) throws IllegalAccessException {
       if(documento.estaPago()){
           throw new IllegalStateException("Documento ja Pago !!");
       }
       conta.sacar(documento.getValortotal());
    documento.quitarPgto();

    }
}
