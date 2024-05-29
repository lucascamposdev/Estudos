package AbstractFactory.boleto;

import AbstractFactory.Produto;

public class BoletoBradesco implements Boleto{
    @Override
    public void emitir(Produto produto, double imposto) {
        System.out.println("Boleto Bradesco");
        System.out.println(produto.getName());
        System.out.println("Imposto: " + imposto);
    }
}
