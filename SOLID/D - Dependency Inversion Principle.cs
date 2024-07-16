/* D - Dependency Inversion Principle */

/* Os módulos de alto nível não devem depender de módulos de baixo nível. 
Ambos devem depender de abstrações. Além disso, as abstrações não devem depender de detalhes. 
Os detalhes devem depender de abstrações. */

/*O princípio da inversão de dependência ajuda a criar sistemas desacoplados e flexíveis, 
permitindo que as dependências sejam injetadas e substituídas facilmente. 
Isso facilita a manutenção, testes e extensão do código. 
A aplicação desse princípio geralmente envolve o uso de interfaces ou classes abstratas 
para definir contratos e a injeção de dependências para fornecer implementações concretas 
desses contratos.*/

/* Explicação: 
   Na forma Errada: UserService é um módulo de alto nível que depende de EmailNotifier,
   um módulo de baixo nível.

   Na forma Correta: UserService depende de uma abstração e não mais de uma classe concreta, 
   podendo receber qualquer tipo de objeto que implementa a interface INotifier, o que 
   facilita a manuntenção/extensão de código sem modificá-la.
*/

// Errado
public class EmailNotifier
{
    public void SendEmail(string message)
    {
        // Enviar email
    }
}

public class UserService
{
    private EmailNotifier _notifier = new EmailNotifier();

    public void NotifyUser(string message)
    {
        _notifier.SendEmail(message);
    }
}



// Correto
public interface INotifier
{
    void Notify(string message);
}

public class EmailNotifier : INotifier
{
    public void Notify(string message)
    {
        // Enviar email
    }
}

public class SMSNotifier : INotifier
{
    public void Notify(string message)
    {
        // Enviar SMS
    }
}

public class UserService
{
    private readonly INotifier _notifier;

    public UserService(INotifier notifier)
    {
        _notifier = notifier;
    }

    public void NotifyUser(string message)
    {
        _notifier.Notify(message);
    }
}