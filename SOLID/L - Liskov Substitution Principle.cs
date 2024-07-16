/* L - Liskov Substitution Principle */

/* As subclasses devem ser substituíveis por suas classes base 
sem alterar o comportamento do programa. */

/* O princípio de substituição de Liskov é fundamental para garantir 
que um sistema de herança funcione corretamente. 
Classes derivadas devem ser verdadeiros substitutos para suas classes base, 
mantendo o comportamento esperado. Usar abstrações adequadas e garantir 
que as implementações concretas sigam as expectativas da abstração ajuda 
a manter um código flexível e robusto.
*/



// Errado
public class Ave
{
    public virtual void Voar()
    {
        // Lógica para voar
    }
}

public class Avestruz : Ave
{
    public override void Voar()
    {
        throw new InvalidOperationException("Avestruzes não voam.");
    }
}



// Correto
public abstract class Ave
{
    public abstract void Mover();
}

public class Pardal : Ave
{
    public override void Mover()
    {
        Voar();
    }

    private void Voar()
    {
        // Lógica para voar
    }
}

public class Avestruz : Ave
{
    public override void Mover()
    {
        Correr();
    }

    private void Correr()
    {
        // Lógica para ligar o motor elétrico
    }
}