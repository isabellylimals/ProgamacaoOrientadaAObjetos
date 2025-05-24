23. **[UFPR- 2023- IF-PR- Informática]**  
Assinale a alternativa correspondente à saída que será apresentada na tela ao executar o código abaixo, inserindo como entrada o valor 5 para a média e 0,75 para frequência.

```java
import java.util.Scanner;
public class LogicaCondicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a media, de 0 a 10: ");
        float media_aluno = input.nextFloat();
        System.out.println("Entre com a frequencia de 0 a 1 (indicando 100%): ");
        float frequencia = input.nextFloat();
        float media = 7;
        float frequencia_minima = 0.75f;
        if (media_aluno >= media && frequencia >= frequencia_minima) {
            System.out.println("Voce foi aprovado!");
        } else if (media_aluno >= media) {
            System.out.println("Solicite aprovacao mediante justificativa de faltas.");
        } else if (frequencia >= frequencia_minima) {
            float recuperar = media * 2 - media_aluno;
            if (recuperar <= 10)
                System.out.println("Esta em recuperacao, tirar no minimo " + recuperar);
            else
                System.out.println("Nao esta apto para recuperacao.");
        } else {
            System.out.println("Voce esta reprovado.");
        }
    }
}
```

- (A) Você foi aprovado!
- (B) Solicite aprovação mediante justificativa de faltas.
- **(C) Está em recuperação, tirar no mínimo 9.0 correta**
- (D) Não está apto para recuperação.
- (E) Você está reprovado.

---

24. **[IDECAN- 2023- Técnico em Tecnologia da Informação]**  
Considere o seguinte trecho de código escrito na Linguagem Java, considerando a openJDK 17.0.3.

```java
public class Main {
    public static void main (String[] args) {
        int x, y;
        y = 1;
        x = 1 + ++y;
        System.out.println(x--);
    }
}
```

Ao executar este trecho de código qual o resultado mostrado na tela?

- (A) 0
- (B) 1
- (C) 2
- **(D) 3**
- (E) error in line 5: invalid operation

---

25. **[FADE- UFPE- 2023- UFPE- Analista de Tecnologia da Informação- Área: Sistemas]**  
Considere o seguinte código em Java:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(proc(5));
    }
    public static int proc(int k) {
        if (k > 0) return proc(k - 2) + proc(k - 1);
        return 1;
    }
}
```

A execução desse código resulta na impressão do seguinte valor:

- **(A) 13**
- (B) 8
- (C) 10
- (D) 9
- (E) 12

---

26. **[FGV- 2023- AL-MA- Programador- Superior]**  
Analise o código Java a seguir.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            } else if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

A quantidade de valores que são exibidos na execução desse código é igual a

- (a) 0
- **(b) 2**
- (c) 3
- (d) 5
- (e) 9

---

27. **[IFRN- 2009- Professor- Sistemas de Informação]**  
Analise criteriosamente o código a seguir e marque a alternativa que corresponde ao respectivo conteúdo de saída após a execução do programa.

```java
public class Operador {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        double c = 10.5;
        a = b = (int) c;
        System.out.print(" | " + a++ + " | ");
        if (a++ < 12 || ++b > 5) {
            System.out.print(b + " | ");
        } else {
            System.out.println(c + " | ");
        }
    }
}
```

- (A) | 10 | 9 |

- **(B) | 10 | 10 |**
- (C) | 10 | 10.5 |
- (D) | 11 | 9 |

---

28. **[UFC- 2013- Analista de Tecnologia da Informação / Engenharia de Software]**  
Considere o seguinte programa na linguagem Java:

```java
public class Loop {
    public static void main(String[] args) {
        int a, b;
        a = 1; b = 2;
        while (a < 7) {
            a = b + a;
            do {
                b = a + b;
                a = a + 1;
            } while (b < 9);
        }
        System.out.println(a + " e " + b);
    }
}
```

Qual o resultado exibido da execução do programa acima?

- (A) 0 e 18
- (B) 1 e 19
- (C) 6 e 24
- (D) 9 e 17
- **(E) 15 e 23**

---

29. **[VUNESP- 2023- EsFCEx- Oficial do Quadro Complementar]**  
A seguir é apresentado um trecho de código escrito na linguagem Java.

```java
class Main {
    public static void main(String[] args) {
        int x;
        x = 10 * 2 % 3 + 5;
        System.out.println("Valor: " + x++);
    }
}
```

É correto afirmar que o valor impresso será

- (A) 25
- (B) 8
- (C) 4
- **(D) 7**
- (E) 26

33. **[FAB - EEAR - 2023 - Sargento da Aeronáutica - Informática]**  
Relacione as colunas quanto aos conceitos de POO. Em seguida, assinale a alternativa com a sequência correta.

1 – Classe  
2 – Objeto  
3 – Construtor  

( ) É uma estrutura dinâmica que encapsula estado e comportamento.  
( ) É executado automaticamente quando um objeto é instanciado utilizando o operador “new”.  
( ) Trata-se de modelo ou template que permite a criação de idênticas estruturas dinâmicas.

- (A) 1 - 2 - 3  
- **(B) 2 - 3 - 1**
- (C) 3 - 1 - 2  
- (D) 3 - 2 - 1  

---

34. **[UFES - 2023 - Técnico de Tecnologia da Informação]**  
Considere o seguinte programa escrito em Java:

```java
class Conta {
    double saldo;
    void sacar(double qtd) { saldo -= qtd; }
    void depositar(double qtd) { saldo += qtd; }
}
public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(1000);
        Conta c2 = c1;
        c1.sacar(500);
        System.out.println(c1.saldo);
    }
}
```

Ao compilar e executar esse programa, o valor impresso na tela é:

- (A) 1000.0  
- **(B) 500.0**  
- (C) 500  
- (D) 1000  
- (E) Indeterminado, pois o saldo não foi inicializado.  

---

35. **[Instituto Consulplan - 2023 - Técnico de Informática]**  
Programação orientada a objetos é um paradigma de programação baseado no conceito de objetos. Considerando as estruturas utilizadas na programação orientada a objetos, relacione adequadamente as colunas a seguir.

1. Classe  
2. Objeto  
3. Método  
4. Atributo  

( ) Define-se dentro de uma classe para descrever o comportamento de um objeto. Programadores podem reutilizar ou manter a funcionalidade encapsulada dentro de um objeto.  
( ) Tipo de dados definido pelo usuário que atua como um modelo para objetos, atributos e métodos individuais.  
( ) Define-se na classe e representa o estado de um objeto; pertence à própria classe.  
( ) Instância de uma classe criada com dados definidos; pode corresponder a objetos do mundo real ou a uma entidade abstrata.

A sequência está correta em

- (A) 1, 3, 2, 4  
- (B) 4, 2, 1, 3  
- (C) 2, 4, 3, 1  
- **(D) 3, 1, 4, 2**  
- (E) 4, 1, 2, 3  
