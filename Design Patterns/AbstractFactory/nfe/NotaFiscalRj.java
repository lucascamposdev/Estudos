package AbstractFactory.nfe;

import AbstractFactory.Produto;

import java.math.BigDecimal;

public class NotaFiscalRj implements NFE{
    @Override
    public double calcularImposto(Produto produto) {

        BigDecimal imposto = new BigDecimal("0.10");

        imposto = imposto.multiply(produto.getValue());

        return imposto.doubleValue();
    }
}
