/* I - Interface Segregation Principle */

/* Os clientes não devem ser forçados a depender de interfaces que eles não utilizam. 
É melhor ter várias interfaces específicas ao invés de uma única interface geral. */

/* Explicação: 
   Na forma Errada: Se um dispositivo não suportar a funcionalidade de fax, 
   ele ainda precisará implementar o método Fax, o que não é ideal..

   Na forma Correta: Se um dispositivo suportar apenas impressão e digitalização, 
   ele pode implementar apenas as interfaces IPrinter e IScanner.
*/

// Errado
public interface IPrinter
{
    void PrintDocument();
    void ScanDocument();
    void FaxDocument();
}



// Correto
public interface IPrinter
{
    void PrintDocument();
}

public interface IScanner
{
    void ScanDocument();
}

public interface IFax
{
    void FaxDocument();
}