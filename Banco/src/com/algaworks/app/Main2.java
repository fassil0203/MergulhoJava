package com.algaworks.app;

import com.algaworks.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao da Silva","12121212");
        Pessoa pessoa2 = new Pessoa("Maria Tapioca","23232323");

        List<Pessoa> pessoas =new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        Pessoa pessoa3 = pessoas.get(1);

//        System.out.println(pessoa3);

//        System.out.println(pessoas);

//        for (int i = 0; i <pessoas.size();i++){
//            System.out.println(pessoas.get(i).toString());
//        }
//        for (Pessoa pessoa : pessoas ){
//            System.out.println(pessoa.getNome());//
//        }

        Pessoa pessoa4 = new Pessoa("Joao da Silva","12121212");

//        boolean existe =pessoas.contains(pessoa4);
//        System.out.println(existe);

        System.out.println(pessoa1.equals(pessoa4));
    }
}
