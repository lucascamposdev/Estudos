# Abstract Factory (criação)

O padrão Builder é útil quando a construção de um objeto é 
complexa e envolve muitas etapas. Ele separa a construção 
de um objeto da sua representação, permitindo criar diferentes 
tipos e representações de um objeto utilizando o mesmo processo de construção.

# Execução: 
1. Fábrica Abstrata: Interface que define os métodos principais da funcionalidade
2. Fábrica Concreta: Classes que implementam as funcionalidades da Factory
3. Produtos Abstratos: Interfaces que fazem parte do funcionamento da Factory 
4. Produtos Concretos: Implementações concretas dos produtos abstratos
5. Classe Cliente: Quem recebe a Implementação de uma Fábrica Abstrata junto com suas propriedades e realiza a funcionalidade

