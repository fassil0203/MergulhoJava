public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Fabio Silva");
        titular1.setDocumento("12121212");

        Pessoa titular2 =new Pessoa();
        titular2.nome = "Rafael Santana";
        titular2.documentotitular ="23232323";

        Conta minhaConta = new Conta(titular1,8253-8,1696-0);
        //minhaConta.titular = titular1;
        //minhaConta.agencia = 8253-8;
        //minhaConta.numero = 1696-0;
      //  minhaConta.saldo = 5500.00;
       // minhaConta.depositar(8000);
        //minhaConta.sacar(500,10);
        minhaConta.depositar(25000);
        minhaConta.sacar(5000,10);
        minhaConta.saldo = minhaConta.saldo - 45000;


        Conta suaConta = new Conta(titular2,312352-7,0036);
        //suaConta.titular = titular2;
       // suaConta.agencia = 8253-8;
        //suaConta.numero = 1696-0;
       // suaConta.saldo = 5500.00;
        suaConta.depositar(40000.00);
        minhaConta.sacar(42000);



        System.out.println("Titular :"+ titular2.nome);
        System.out.println("Agencia :" + minhaConta.agencia);
        System.out.println("Numero da Conta : " + minhaConta.numero);
        System.out.println("Saldo da Conta : " + minhaConta.saldo);

        System.out.println("***************************************************");
        System.out.println("***************************************************");


        System.out.println("Titula da Conta : "+ titular1.nome);
        System.out.println("Agencia :" + suaConta.agencia);
        System.out.println("Numero da Conta :" + suaConta.numero);
        System.out.println("Saldo da Conta :" + suaConta.saldo);

    }
}