package com.algaworks.modelo.pagamento;

import com.algaworks.modelo.Pessoa;

import java.math.BigDecimal;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel {

    private Pessoa beneficiario;
    private BigDecimal valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, BigDecimal valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valor;
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
    public double getvalorTotal() {
        return 0;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
