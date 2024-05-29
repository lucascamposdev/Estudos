# Abstract Factory (criação)

Permite a criação de famílias de objetos 
relacionados ou dependentes sem especificar suas classes concretas. 
Ele fornece uma interface para criar famílias de objetos relacionados, 
delegando a criação real das instâncias para subclasses específicas.
é especialmente útil em sistemas que necessitam de 
flexibilidade e independência na criação de objetos.

# Execução: 
1. Fábrica Abstrata: Interface que define os métodos principais da funcionalidade
2. Fábrica Concreta: Classes que implementam as funcionalidades da Factory
3. Produtos Abstratos: Interfaces que fazem parte do funcionamento da Factory 
4. Produtos Concretos: Implementações concretas dos produtos abstratos
5. Classe Cliente: Quem recebe a Implementação de uma Fábrica Abstrata junto com suas propriedades e realiza a funcionalidade

