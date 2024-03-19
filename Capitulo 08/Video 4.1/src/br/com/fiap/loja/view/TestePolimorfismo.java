package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Funcionario;
import br.com.fiap.loja.model.Vendedor;

public class TestePolimorfismo {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        System.out.println(funcionario.getSaudacao()); //Executa o método do funcionario

        Vendedor vendedor = new Vendedor();
        System.out.println(vendedor.getSaudacao()); //Executa o método do vendedor

        Funcionario teste = new Vendedor();
        System.out.println(teste.getSaudacao()); //Executa qual método?
    }

}
