package AbstractFactory.boleto;

import AbstractFactory.Produto;

public interface Boleto {
    public void emitir(Produto produto, double imposto);
}
