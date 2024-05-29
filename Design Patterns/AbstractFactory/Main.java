package AbstractFactory;

import AbstractFactory.lojas.LojaInformatica;
import AbstractFactory.venda.Venda;
import AbstractFactory.venda.VendaFactory;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

            Produto produto = new Produto("Iphone XR", new BigDecimal("3000.00"));

        VendaFactory factory = new LojaInformatica();

        Venda venda = new Venda(factory);
        venda.realizarVenda(produto);
    }
}
