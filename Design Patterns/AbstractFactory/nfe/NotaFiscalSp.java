package AbstractFactory.nfe;

import AbstractFactory.Produto;

import java.math.BigDecimal;

public class NotaFiscalSp implements NFE{
    @Override
    public double calcularImposto(Produto produto) {

        BigDecimal imposto = new BigDecimal("0.18");

        imposto = imposto.multiply(produto.getValue());

        return imposto.doubleValue();
    }
}
