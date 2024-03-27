package com.algaworks.modelo.pagamento;

public interface DocumentoPagar {

    double getValortotal();

    boolean estaPago();

    void quitarPgto();

    default void imprimirRecibo(){
        System.out.println("RECIBO");
        System.out.println("Valor total :" + getValortotal());
        System.out.println("Pago :" + estaPago());

    }


}
