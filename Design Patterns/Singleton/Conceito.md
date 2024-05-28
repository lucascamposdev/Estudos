# Singleton (criação)

O padrão Singleton é usado quando é necessário garantir que uma classe tenha apenas uma única instância e fornecer um ponto global de acesso a essa instância, economizando espaço na memória.

# Execução: 
1. Cria uma classe principal com um atributo contendo a própria classe
2. Construtor vazio privado
3. Método getInstance que checa: <br>
	se o atributo é null: retorna uma new instância da classe (a primeira e única) <br>
	se não: retorna o atributo já criado

# Exemplo de Aplicação: 
Um sistema de registro de eventos de aplicativos, onde uma única instância do logger é usada para registrar eventos em todo o sistema. Isso garante que os registros sejam consistentes e evita o consumo excessivo de recursos para criar várias instâncias do logger
