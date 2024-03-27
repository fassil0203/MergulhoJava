package com.algaworks.modelo.pagamento;

public interface DocEstornavel extends DocumentoPagar{

    void estornarPagamento();

    double getvalorTotal();
}
