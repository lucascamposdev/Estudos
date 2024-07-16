/* S - Open Closed Principle */

/* Entidades de software (classes, módulos, funções, etc.) devem estar abertas para extensão, 
mas fechadas para modificação. Isso permite adicionar novas funcionalidades sem alterar 
o código existente. */

// Errado
public class PaymentProcessor
{
    public void ProcessPayment(string paymentType)
    {
        if (paymentType == "CreditCard")
        {
            // Processar pagamento com cartão de crédito
        }
        else if (paymentType == "PayPal")
        {
            // Processar pagamento com PayPal
        }
        // Adicionar mais tipos de pagamento exigiria modificar este método
    }
}



// Correto
/* Explicação: 
    1) IPaymentProcessor : interface com um método execute()
    2) PaymentService: service que executa a ação

    3)CreditCardPaymentProcessor,
    PayPalPaymentProcessor, 
    PixPaymentProcessor:
    classes que implementam a interface em comum possibilitando
    o polimorfismo no service que a executa.

    Sendo Assim, sempre que uma nova forma de pagamento surgir
    não afetará nenhuma parte de outro código.
*/
public interface IPaymentProcessor
{
    void ProcessPayment();
}

public class CreditCardPaymentProcessor : IPaymentProcessor
{
    public void ProcessPayment()
    {
        // Processar pagamento com cartão de crédito
    }
}

public class PayPalPaymentProcessor : IPaymentProcessor
{
    public void ProcessPayment()
    {
        // Processar pagamento com PayPal
    }
}

public class PaymentService
{
    private readonly IPaymentProcessor _paymentProcessor;

    public PaymentService(IPaymentProcessor paymentProcessor)
    {
        _paymentProcessor = paymentProcessor;
    }

    public void ProcessPayment()
    {
        _paymentProcessor.ProcessPayment();
    }
}