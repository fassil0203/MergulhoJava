package com.algaworks.modelo.pagamento;

public interface DocumentoPagar {

    double getValortotal();

    boolean estaPago();

    void quitarPgto();
}
