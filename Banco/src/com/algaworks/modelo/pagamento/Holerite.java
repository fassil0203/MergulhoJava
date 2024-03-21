package com.algaworks.modelo.pagamento;
import com.algaworks.modelo.Pessoa;

public class Holerite implements DocumentoPagar {
    private Pessoa funcionario;
    private double valorHora;
    private int quantidadeHoras;
    private boolean pago;

    public Holerite(Pessoa funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValortotal() {
        return valorHora * quantidadeHoras;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPgto() {
        pago = true;
    }
}
