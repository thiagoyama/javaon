package br.com.fiap.loja.model;

public class Vendedor extends Funcionario {
    @Override
    public String getSaudacao() {
        return "Vendemos mais, vendemos tudo!";
    }
}

