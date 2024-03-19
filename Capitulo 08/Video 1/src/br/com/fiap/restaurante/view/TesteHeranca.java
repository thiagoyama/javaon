package br.com.fiap.restaurante.view;

import br.com.fiap.restaurante.model.Bebida;

public class TesteHeranca {

    public static void main(String[] args) {
//        Bebida bebida = new Bebida("Suco de Laranja", "Água, laranja, açucar, gelo", 7.85, 500);
//        System.out.print("A bebida informada foi " + bebida.getNome());
//        System.out.print(", é composta por " + bebida.getIngredientes());
//        System.out.print(", custa R$" + bebida.getPreco());
//        System.out.print(" e a sua quantidade é de " + bebida.getQuantidade() + "ml");


        Bebida bebida = new Bebida();
        bebida.setNome("Suco de laranja");
        bebida.setIngredientes("Água, laranja, açúcar e gelo");
        bebida.setPreco(7.85);
        bebida.setQuantidade(500);
        System.out.print("A bebida informada foi " + bebida.getNome());
        System.out.print(", é composta por " + bebida.getIngredientes());
        System.out.print(", custa R$" + bebida.getPreco());
        System.out.print(" e a sua quantidade é de " + bebida.getQuantidade() + "ml");

    }

}

