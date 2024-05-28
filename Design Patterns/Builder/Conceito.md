# Builder (criação)

O padrão Builder é útil quando a construção de um objeto é 
complexa e envolve muitas etapas. Ele separa a construção 
de um objeto da sua representação, permitindo criar diferentes 
tipos e representações de um objeto utilizando o mesmo processo de construção.

# Execução: 
1. Crie um Builder de uma classe
2. Com o seu Construtor iniciando uma nova instância dessa classe como atributo interno
3. Adicione métodos que definem as propriedades dessa classe, sempre retornando this (o próprio Builder) 
4. No final um método build() que retorna o objeto que está no atributo

