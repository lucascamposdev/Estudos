package AbstractFactory.lojas;

import AbstractFactory.boleto.Boleto;
import AbstractFactory.boleto.BoletoBradesco;
import AbstractFactory.nfe.NFE;
import AbstractFactory.nfe.NotaFiscalSp;
import AbstractFactory.venda.VendaFactory;

public class LojaInformatica implements VendaFactory {
    @Override
    public NFE criarNFE() {
        NFE notaFiscal = new NotaFiscalSp();

        return notaFiscal;
    }

    @Override
    public Boleto gerarBoleto() {
        Boleto boleto = new BoletoBradesco();

        return boleto;
    }
}
