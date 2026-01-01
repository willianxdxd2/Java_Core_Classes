# Java - Core - Classes

Esse repositório é para fins didáticos contendo práticas sólidas com exceções e tratamento de erros, afim de proporcionar clareza mental na hora de resolver problemas.

#Tecnologias 

-Eclipse
-Java SE
-SQL
-FileReader

#Meu aprendizado
-aprendi a me ambientar melhor no tratamento de erros e entender mais tecnicamente como as exceções acontecem
-uso intensivo de try catch me fez entender melhor sua posição no codigo juntamente com o try with resources
-Aprendi a conectar minha IDE com banco de dados SQL e tratar exceções relacionadas
-Aprendi a usar FileReader e BufferedReader como leitor de arquivos e achei interessante como eles podem interagir com a minha máquina


Exercicios:
1️⃣ IOException / FileNotFoundException

Ler um arquivo chamado dados.txt e imprimir cada linha.(feito)

Criar um arquivo saida.txt e escrever uma lista de nomes.(feito)

Copiar conteúdo de um arquivo para outro usando BufferedReader e BufferedWriter.(feito)

Abrir um arquivo inexistente e tratar a exceção para exibir "Arquivo não encontrado".(feito)

Ler um arquivo linha a linha e contar quantas linhas possuem mais de 10 caracteres.(feito)

2️⃣ ClassNotFoundException

Usar Class.forName("java.util.ArrayList") e tratar a exceção.(feito)

Criar um programa que carrega dinamicamente uma classe chamada Teste que não existe.(feito)

Criar um pequeno programa que carrega um driver JDBC usando Class.forName e trata a exceção.(feito)

Tentar instanciar uma classe pelo nome usando reflexão e capturar a exceção.(feito)

Criar uma função que recebe o nome de uma classe como String e imprime "Classe encontrada" ou "Classe não encontrada".(feito)

3️⃣ SQLException

Conectar a um banco de dados e executar uma query, tratando SQLException.(feito)

Criar tabela e inserir dados no banco, com tratamento de erros.(feito)

Ler dados de uma tabela inexistente e capturar a exceção.(feito)

Atualizar um registro com dados inválidos e tratar a exceção.(feito)

Simular um acesso a banco de dados sem conexão e capturar o erro.(feito)

4️⃣ ParseException

Transformar uma String "31/02/2025" em Date usando SimpleDateFormat.(feito)

Ler datas de um arquivo e imprimir só as válidas, ignorando inválidas.(feito)

Criar uma função que recebe uma data como String e retorna o dia da semana.(feito)

Ler uma data de um formulário em formato "dd-MM-yyyy" e tratar parsing inválido.(feito)

Converter uma lista de strings para datas, contando quantas foram inválidas.(feito)

5️⃣ InterruptedException

Criar uma Thread que dorme 5 segundos e capturar InterruptedException.(feit0)

Criar duas threads e interromper uma delas, tratando a exceção.(feit0)

Usar Thread.sleep() dentro de um loop e capturar interrupções.(feit0)

Simular um download com delay, interrompendo a thread e tratando o erro.(feit0)

Criar uma função que pausa execução de várias threads e imprime "interrompida" se houver exceção.(feito)

B. Unchecked Exceptions (RuntimeException)
1️⃣ NullPointerException

Acessar um método de uma String que está null.(feit0)

Percorrer uma lista que ainda não foi inicializada.(feit0)

Criar uma função que retorna null e tentar acessar um atributo.(feit0)

Passar null como argumento de um método que espera String.(feit0)

Criar um array de objetos null e tentar chamar um método de cada elemento.(feit0)

2️⃣ ArrayIndexOutOfBoundsException

Acessar índice 10 de um array de tamanho 5.(feit0)

Criar um loop que percorre um array de tamanho N e acessar N.(feit0)

Remover elemento de um array fora do tamanho.(feit0)

Criar uma matriz 3x3 e tentar acessar [3][0].(feit0)

Ler números de um arquivo e armazenar em array com tamanho fixo, ultrapassando o limite.(feit0)

3️⃣ ArithmeticException

Dividir um número por zero.(feit0)

Criar uma função de média que divide por zero se o array estiver vazio.(feit0)

Calcular módulo com divisor zero.(feit0)

Criar calculadora que lança exceção ao dividir por zero.(feit0)

Simular juros: dividir valor por diferença de dias que pode ser zero.(feit0)

4️⃣ NumberFormatException

Converter "abc" em inteiro usando Integer.parseInt.(feit0)

Ler números de um arquivo e tratar strings inválidas.(feit0)

Criar uma função que transforma uma lista de strings em doubles.(feit0)

Ler input do usuário e tratar caso não seja número.(feit0)

Transformar "12.34.56" em double e capturar a exceção.(feito)

5️⃣ ClassCastException

Criar Object o = "teste" e fazer (Integer)o.(feit0)

Colocar uma String em ArrayList<Object> e tentar cast para Integer.(feit0)

Criar array de Number e tentar cast para Integer[].(feit0)

Passar objeto de classe filha e tentar cast para classe não relacionada.(feito)

Criar Object o = new Object() e tentar cast para String.(feito)
(feito)Exercício 1 – Criar e escrever em um arquivo

Crie um programa em Java que:

Crie um arquivo chamado saida.txt.

Escreva a frase "Olá, mundo!" no arquivo usando FileWriter.

Feche o arquivo corretamente.

Objetivo: Familiarizar-se com a criação de arquivos e escrita básica.
(feito)
-------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
Exercício 2 – Escrever múltiplas linhas com BufferedWriter

Crie um programa que:

Abra o arquivo linhas.txt para escrita usando BufferedWriter.

Escreva as 5 linhas abaixo no arquivo, cada uma em uma linha separada:

Linha 1
Linha 2
Linha 3
Linha 4
Linha 5


Feche o arquivo corretamente.

Objetivo: Praticar o uso de BufferedWriter e newLine().
(feito)
-------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
Exercício 3 – Copiar conteúdo de um array para um arquivo

Crie um array de Strings com nomes de frutas, por exemplo: "Maçã", "Banana", "Laranja".

Use BufferedWriter para escrever cada fruta em uma linha do arquivo frutas.txt.

Verifique se cada linha termina corretamente no arquivo.

Objetivo: Treinar loops e escrita de múltiplos dados em arquivo.
(feito)
-------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
Exercício 4 – Criar log com timestamp

Crie um arquivo log.txt.

Use BufferedWriter para adicionar 10 linhas, cada uma com a frase "Evento X ocorreu em " seguida da data e hora atual (LocalDateTime).

Cada execução do programa deve adicionar ao final do arquivo (append), sem sobrescrever.

Objetivo: Aprender a usar FileWriter com append e trabalhar com datas.
(feito)
-------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
Exercício 5 – Salvar números e calcular total

Crie um array de inteiros, por exemplo {10, 20, 30, 40, 50}.

Use BufferedWriter para escrever cada número em uma linha no arquivo numeros.txt.

Após escrever, adicione uma linha final com o total da soma dos números, no formato:

Total: 150
(feito)
------------------------------------------------------------------------------------------------
🧬 5 Exercícios de Herança e Polimorfismo

Crie a classe Animal com o método fazerSom(). Derive Cachorro e Gato.

Classe Funcionario com calcularSalario(). Crie Gerente e Vendedor.

Crie uma classe Veiculo com acelerar(). Derive Carro e Moto.

Crie uma classe Mensagem com enviar(). Crie Email e SMS.

Crie Pessoa e derive Aluno e Professor. Implemente um método apresentar() polimórfico.
