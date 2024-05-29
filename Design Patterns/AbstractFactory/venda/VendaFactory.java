package AbstractFactory.venda;

import AbstractFactory.boleto.Boleto;
import AbstractFactory.nfe.NFE;

public interface VendaFactory {

    public NFE criarNFE();
    public Boleto gerarBoleto();
}
