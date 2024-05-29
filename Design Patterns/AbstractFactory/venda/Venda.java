package AbstractFactory.venda;

import AbstractFactory.Produto;
import AbstractFactory.boleto.Boleto;
import AbstractFactory.nfe.NFE;

// Cliente
public class Venda {

    private NFE notaFiscal;
    private Boleto boleto;

    public Venda(VendaFactory factory){
        this.notaFiscal = factory.criarNFE();
        this.boleto = factory.gerarBoleto();
    }

    public void realizarVenda(Produto produto){
        var imposto = notaFiscal.calcularImposto(produto);

        boleto.emitir(produto, imposto);
    }
}
