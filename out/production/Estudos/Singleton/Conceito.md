# Singleton (criação)

O padrão Singleton é usado quando é necessário garantir que uma classe tenha apenas uma única instância e fornecer um ponto global de acesso a essa instância, economizando espaço na memória.

# Execução: 
1. Cria uma classe principal com um atributo contendo a própria classe
2. Construtor vazio privado
3. Método getInstance que checa: <br>
	se o atributo está null: cria uma nova instância da classe (a primeira e única) e retorna <br>
	se não: retorna o atributo já criado

