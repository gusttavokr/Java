<div align="center">
  <img width="200"
    alt="Java Logo"
    src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"
    />
  <h1>LINGUAGEM DE PROGRAMAÇÃO JAVA</h1>
  Repositório de estudos para a Linguagem Java + Programação Orientada ao Objeto.
</div>

## Aula 01 - Conceitos:
**Resumindo:**
Programação Orientada a Objetos se trata da atribuição de características programadas para cada objeto a ser usado no código-fonte.

### 1. Classe
Classe é o que define os atributos e métodos comuns que serão compartilhados por um objeto.

### 2. Objeto
É a instância de uma classe. Quando criamos uma classe e instanciamos a classe para um novo objeto.

### 3. Abstração
Imagine um carro. No contexto de dirigir, o que importa são __*o volante, os pedais e o painel.*__ Detalhes como o motor e a transmissão são importantes, mas não precisam ser conhecidos para dirigir. Em POO, fazemos o mesmo: focamos nos métodos e atributos relevantes, escondendo a complexidade desnecessária.


## Aula 02 - Modificadores de Visibilidade:
### 1. "+" (Público) "Todos podem visualizar"
<p>A classe atual e todas as outras tem acesso aos atributos.</p>

### 2. "-" (Privado) "Somente eu posso visualizar"
<p>Somente a classe tem acesso aos atributos.</p>

### 3. "#" (Protegido)
<p>Somente a classe e suas subclasses tem acesso aos atributos.</p>

   
## Aula 03 - Métodos especiais
### 1. Método Acessores(Getters)
Método para acessar algo sem que modifique diretamente com a classe. "obj.get(Método())" Retornando apenas as informações.
Use-o quando precisar acessar o valor de um atributo privado fora da classe. É ideal para leitura de dados sem permitir a modificação.

Exemplo: Você quer saber o nome da pessoa.
```
String nome = pessoa.getNome();
```
```
public class Pessoa {
      private String nome;

      public String getNome() {
          return nome;
      }
}
```

### 2. Métodos Modificadores(Setters)
O método Setter, é usado para modificar o valor de uma variável de instância de um objeto "obj.set(Método())"
Use-o quando precisar modificar o valor de um atributo privado fora da classe. É ideal para atualizar dados mantendo o controle sobre as alterações.

Exemplo: Você quer mudar o nome da pessoa.
```
pessoa.setNome("Bob");
```

### 3. Método Construtor
Nesse método, você chama os atributos direto como parâmetros. O código principal fica mais simples ao criar objetos.
Sempre que você cria uma instância de uma classe e precisa que ela comece com determinados valores ou precise executar uma configuração inicial.
Exemplo: Criar um objeto Pessoa com um nome inicial.
```
Pessoa pessoa = new Pessoa("Alice");
```

Usando um código completo, ficaria assim em dois arquivos:
#### 1. Arquivo da Classe
```
public class Pessoa {
    // Atributos privados: só podem ser acessados dentro da própria classe.
    private String nome;
    private int idade;

    // Construtor: inicializa os objetos da classe Pessoa com valores para nome e idade.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para nome: permite acessar o valor do atributo nome fora da classe.
    public String getNome() {
        return nome;
    }

    // Setter para nome: permite modificar o valor do atributo nome fora da classe.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade: permite acessar o valor do atributo idade fora da classe.
    public int getIdade() {
        return idade;
    }

    // Setter para idade: permite modificar o valor do atributo idade fora da classe.
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```
#### 2. Arquivo principal
```
public class Main {
    public static void main(String[] args) {
        // Usando o construtor para criar uma nova Pessoa com nome "Alice" e idade 30.
        Pessoa pessoa = new Pessoa("Alice", 30);

        // Usando getters para acessar os valores dos atributos.
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Usando setters para alterar os valores dos atributos.
        pessoa.setNome("Bob");
        pessoa.setIdade(25);

        // Mostrando os valores atualizados usando getters.
        System.out.println("Nome atualizado: " + pessoa.getNome());
        System.out.println("Idade atualizada: " + pessoa.getIdade());
    }
}

```

#### 3. Usando um Scanner(Biblioteca de entrada no terminal)
```
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.

        // Coletando nome e idade do usuário
        System.out.print("Digite o nome: "); // Exibe uma mensagem pedindo ao usuário para digitar o nome.
        String nome = scanner.nextLine(); // Lê a linha digitada pelo usuário e armazena na variável nome.

        System.out.print("Digite a idade: "); // Exibe uma mensagem pedindo ao usuário para digitar a idade.
        int idade = scanner.nextInt(); // Lê o próximo inteiro digitado pelo usuário e armazena na variável idade.

        // Usando o construtor para criar uma nova Pessoa com os dados do usuário
        Pessoa pessoa = new Pessoa(nome, idade); // Cria um novo objeto Pessoa com o nome e idade fornecidos.

        // Exibindo os valores iniciais usando getters
        System.out.println("Nome: " + pessoa.getNome()); // Usa o getter para exibir o nome.
        System.out.println("Idade: " + pessoa.getIdade()); // Usa o getter para exibir a idade.

        // Modificando os valores usando setters
        System.out.print("Digite o novo nome: "); // Exibe uma mensagem pedindo ao usuário para digitar um novo nome.
        scanner.nextLine();  // Consumir a nova linha, evitando problemas de leitura de próxima entrada.
        String novoNome = scanner.nextLine(); // Lê a linha digitada pelo usuário e armazena na variável novoNome.
        pessoa.setNome(novoNome); // Usa o setter para atualizar o nome do objeto pessoa.

        System.out.print("Digite a nova idade: "); // Exibe uma mensagem pedindo ao usuário para digitar uma nova idade.
        int novaIdade = scanner.nextInt(); // Lê o próximo inteiro digitado pelo usuário e armazena na variável novaIdade.
        pessoa.setIdade(novaIdade); // Usa o setter para atualizar a idade do objeto pessoa.

        // Exibindo os valores atualizados usando getters
        System.out.println("Nome atualizado: " + pessoa.getNome()); // Usa o getter para exibir o novo nome.
        System.out.println("Idade atualizada: " + pessoa.getIdade()); // Usa o getter para exibir a nova idade.

        scanner.close(); // Fecha o objeto Scanner para liberar os recursos.
    }
}

```

## Aula 04 - Pilares da Programação Orientada ao Objeto

### 1. Encapsulamento
Encapsular é uma forma de manter o seu código mais seguro, proteger os dados e manter a integridade do objeto, evitando acesso ou modificação direta das propriedades.
1. Tornar mudanças invisíveis; "Trocar a pilha de um controle, o controle sempre terá energia e não perceberá"
2. Facilitar reutilização de código; "Reutilizar uma classe encapsulada"
3. Reduzir efeitos colaterais;

#### Interface
