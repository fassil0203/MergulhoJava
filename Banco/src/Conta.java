public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    void depositar (double valor){      //metodo
        if (valor <=0){
            throw new IllegalArgumentException("Valor deve ser maior que Zero");
        }
        saldo =saldo + valor;
    }
    void sacar (double valor) throws IllegalAccessException {
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
