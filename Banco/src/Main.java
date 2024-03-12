public class Main {
    public static void main(String[] args)
    {
        Pessoa titular1 = new Pessoa();
        titular1.nome = "Fabio Santana";
        titular1.documentotitular ="12121212";

        Pessoa titular2 =new Pessoa();
        titular2.nome = "Rafael Santana";
        titular2.documentotitular ="23232323";

        Conta minhaConta = new Conta();
        minhaConta.titular = titular1;
        minhaConta.agencia = 8253-8;
        minhaConta.numero = 1696-0;
        minhaConta.saldo = 5500.05;

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 8253-8;
        suaConta.numero = 1696-0;
        suaConta.saldo = 5500.00;


        System.out.println("Titular :"+ titular2.nome);
        System.out.println("Agencia :" + minhaConta.agencia);
        System.out.println("Numero da Conta : " + minhaConta.numero);

        System.out.println("***************************************************");


        System.out.println("Titula da Conta : "+ titular1.nome);
        System.out.println("Agencia :" + suaConta.agencia);
        System.out.println("Numero da Conta :" + suaConta.numero);
        System.out.println("Seu Saldo :" + suaConta.saldo);

    }
}