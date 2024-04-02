package com.algaworks.modelo.pagamento;

public interface DocumentoEstornavel extends DocumentoPagavel{

    void estornarPagamento();

    double getvalorTotal();
}
