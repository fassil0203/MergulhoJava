package com.algaworks.modelo.pagamento;

import com.algaworks.modelo.Pessoa;

public class Boleto implements DocumentoPagar, DocEstornavel{

    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.pago = pago;
    }

    @Override
    public double getValortotal() {
        return valor;
    }

    @Override
    public double getvalorTotal() {
        return 0;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void estornarPagamento() {
        pago = false;

    }

    @Override
    public void quitarPgto() {
        pago = true;
    }
}
