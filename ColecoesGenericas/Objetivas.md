97. **[2023 - CS-UFG - IF Goiano - Técnico de Tecnologia da Informação]**  
Em um programa orientado a objetos foi implementada uma superclasse chamada `Pessoa` e duas subclasses de `Pessoa` chamadas `TecnicoDeTI` e `TecnicoDeLab`. Considerando que `listaDePessoas` se refere à lista de objetos do tipo `Pessoa`, qual dos seguintes trechos de código escritos em linguagem Java calcula e armazena corretamente, na variável `q`, a quantidade de objetos do tipo `TecnicoDeTI`?

**(A)**
```java
int q = 0;
Iterator i = listaDePessoas.iterator();
TecnicoDeTI t;
while (i.hasNext()) {
    t = (Pessoa) i.next();
    if (t instanceof i)
        q++;
}
```
**(B)**
```java
int q = 0;
Iterator i = listaDePessoas.iterator();
TecnicoDeTI t;
while (i.hasNext()) {
    t = (Pessoa) i.next();
    if (t instanceof TecnicoDeTI)
        q++;
}
```
**(C)**
```java
int q = 0;
Iterator i = listaDePessoas.iterator();
TecnicoDeTI t;
while (i.hasNext())
    if (i instanceof TecnicoDeTI) q++;
```
**(D)**
```java
int q = 0;
Iterator i = listaDePessoas.iterator();
TecnicoDeTI t;
while (i.hasNext())
    if (i instanceof t) q++;
```
*Resposta Letra c*
---

98. **[APICE - 2021 - DPE-PB - Analista de Desenvolvimento de Sistemas]**  
Em Programação Orientada a Objetos (POO), os tipos genéricos (Generics) têm o propósito de criar conjuntos com consistência entre os tipos. Nas linguagens de programação Java e C#, por exemplo, existem classes e/ou interfaces como a `List` que funcionam como uma espécie de matriz, com tamanho aumentado de maneira dinâmica, não havendo necessidade de definir quantos objetos serão inseridos. Com base neste assunto e supondo que todas as condições são satisfeitas para utilização de listas (jdk adequado, importação de bibliotecas e condições para compilação e execução), assinale a alternativa que contém **APENAS INFORMAÇÕES INCORRETAS**:

- (A) Uma maneira de remover todos elementos de uma lista em Java, por exemplo, é invocando o método `clear()` da interface `List`.
- **(B) O método público `remove()` da interface `List` em Java pode ser utilizado para remover elementos de uma lista. Esse é um método que aceita o índice do objeto a ser removido. Por exemplo, supondo que uma lista de nome `minhaLista` foi inicializada corretamente com cinco elementos, uma forma de remover o primeiro elemento desta lista é utilizar o comando `minhaLista.remove(1);`**
- (C) Normalmente, as linguagens de programação implementam métodos ou propriedades para obter a quantidade de objetos inseridos num objeto de lista. Por exemplo, o método `size()` da interface `List` em Java é usado para obter o número de elementos nesta lista.
- (D) Existem métodos públicos para manipulação de objetos dentro de uma lista. Por exemplo, o método `add()` da interface `List` em Java pode ser usado para adicionar um elemento numa lista.
- (E) É possível ordenar uma lista utilizando seus próprios métodos públicos. Por exemplo, o método `sort()` da interface `List` em Java pode ser usado para tal função.

---

99. **[FADE UFPE - 2023 - UFPE - Analista de Tecnologia da Informação - Área: Sistemas]**  
Suponha que, em Java, utilizamos a classe `LinkedList` para implementar uma estrutura de dados dinâmica. Vamos considerar duas possibilidades para inserção e remoção:  
i. usar apenas os métodos `addFirst()` e `removeFirst()`; ou  
ii. usar apenas os métodos `addLast()` e `removeLast()`.  
Podemos, então, afirmar que:

- (A) no primeiro caso, trata-se de uma pilha e, no segundo, de uma fila.
- (B) no primeiro caso, trata-se de uma fila e, no segundo, de uma pilha.
- (C) no primeiro caso, trata-se de uma lista encadeada e, no segundo, de uma fila.
- (D) em ambos os casos, trata-se de uma fila.
- **(E) em ambos os casos, trata-se de uma pilha.**

---

100. **[IBFC - 2024 - Correios - Analista de Sistemas – Desenvolvimento de Sistemas]**  
Dado o código abaixo na Linguagem Java:
```java
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(1);
        System.out.println(numbers);
    }
}
```
Assinale a alternativa que apresenta a sequência correta da saída do programa.

- (A) [1, 2, 3]
- (B) [2, 3]
- (C) **[1, 3]**
- (D) [1, 2]

---

101. **[FGV - 2024 - DATAPREV - ATI - Arquitetura, Engenharia e Sustentação Tecnológica]**  
Considere o seguinte trecho de código:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
Iterator<Integer> iterador = numeros.iterator();
while (iterador.hasNext()) {
    for(int i = 0; i < numeros.size(); i++) {
        if(i%2==0) {
            iterador.remove(i);
        }
    }
}
```
Esse código tem por objetivo remover as posições pares de uma lista `numeros`.  
Assinale a opção que identifica os problemas com esse código.

- (A) **A remoção de elementos dentro de um laço for deve ser feita usando os métodos `next()` e `remove()` do iterador.**
- (B) O laço for está mal posicionado, e deveria ser usado antes do laço while para iterar corretamente.
- (C) O método `remove` nunca pode ser chamado durante a iteração com um iterador, pois isso sempre resulta em uma exceção.
- (D) A variável `i` utilizada no laço for está causando um erro de indexação ao tentar acessar elementos que já foram removidos.
- (E) O laço while deve ser substituído por um laço for para evitar conflitos com o iterador.