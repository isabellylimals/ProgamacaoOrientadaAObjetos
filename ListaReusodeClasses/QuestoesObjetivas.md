## Questões sobre Programação Orientada a Objetos - Java

### 66. [FGV - 2024 - INPE - Tecnologista Júnior I]
Uma linguagem de programação orientada a objetos deve prover suporte aos principais fundamentos do desenvolvimento orientado a objetos. Entretanto, cada linguagem apresenta as suas especificidades e formas de implementar esses fundamentos.

Sobre a linguagem Java, analise as afirmativas a seguir:

I. A palavra-chave `this` em Java é uma referência ao próprio objeto da classe e pode ser usada para acessar atributos e métodos da instância atual.  
II. Quando uma classe `ClasseB` estende `ClasseA` com `extends`, significa que `ClasseB` pode acessar membros privados e protegidos de `ClasseA`.  
III. A linguagem Java permite herança múltipla de classes.

**Alternativas:**
- (A) I, II e III.  
- (B) II e III, apenas.  
- (C) I e III, apenas.  
- (D) I e II, apenas.  
- (E) I, apenas.

**Gabarito: (E)**  
> Justificativa:
> - I: Verdadeiro.  
> - II: Falso (membros `private` não são acessíveis pela subclasse).  
> - III: Falso (Java não permite herança múltipla de classes, apenas de interfaces).

---

### 67. [FAB - EEAR - 2023 - Sargento da Aeronáutica]
Herança é um dos conceitos fundamentais da Programação Orientada a Objetos. Analise as afirmativas abaixo:

I. As classes inferiores da hierarquia **não** herdam automaticamente todas as propriedades e os métodos das classes superiores.  
II. A herança permite basear uma nova classe na definição de uma classe previamente existente.  
III. A classe filha é conhecida como **superclasse** e a classe progenitora como **subclasse**.  
IV. A herança permite o agrupamento de classes relacionadas.

**Alternativas:**
- (A) I e II  
- (B) II e IV  
- (C) I e IV  
- (D) II e III

**Gabarito: (B)**  
> Justificativa:
> - I: Falso (as propriedades/métodos não privados são herdados automaticamente).  
> - II: Verdadeiro.  
> - III: Falso (a classe filha é a subclasse, a progenitora é a superclasse).  
> - IV: Verdadeiro.

---

### 68. [CESGRANRIO - 2024 - Banco da Amazônia]
No contexto de orientação a objeto, para as classes P, Q, R, S, T, U, sendo Q uma classe declarada como abstrata, considere a hierarquia:

- U e R herdam diretamente de S  
- S e T herdam diretamente de Q  
- P herda de T

Nesse contexto, é possível criar uma instância de:

**Alternativas:**
- (A) P e associar a uma variável da classe S  
- (B) Q e associar a uma variável da classe Q  
- (C) Q e associar a uma variável da classe P  
- (D) S e associar a uma variável da classe U  
- (E) U e associar a uma variável da classe Q

**Gabarito: (A)**  
> Justificativa:
> - Q é abstrata → não pode ser instanciada.  
> - P herda de T → que herda de Q → P é concreta.  
> - Pode-se instanciar `P` e associar a uma variável de tipo ancestral (`S`) se for compatível na hierarquia (via polimorfismo).

---

### 69. [FGV - 2024 - CGM de Belo Horizonte - Auditor Interno]
Código:

```java
public class Veiculo {
 private String marca;
 private String modelo;
 public Veiculo(String marca, String modelo) {
   this.marca = marca;
   this.modelo = modelo;
 }
 public String getMarca() {
   return marca;
 }
 public String getModelo() {
   return modelo;
 }
}

public class Mobi extends Veiculo {
 private int portas;
 public Mobi(String marca, String modelo, int portas) {
   super(marca, modelo);
   this.portas = portas;
 }
 public int getPortas() {
   return portas;
 }
}
```
---


### 70. [UFG - 2024 - Prefeitura de Rio Branco - AC - Analista de Sistemas - Especialização em Desenvolvimento Front-End]  
Desenvolver aplicações eficientes requer reutilizar e estender o comportamento de classes existentes. No contexto da programação orientada a objetos, qual conceito permite que uma classe adquira as propriedades e métodos de outra classe?

**Alternativas:**
- (A) Encapsulamento  
- (B) Abstração  
- (C) Composição  
- (D) Herança

**Gabarito: (D)**  
> Justificativa:
> - A **herança** é o mecanismo que permite a uma classe (subclasse) reutilizar atributos e comportamentos (métodos) de outra classe (superclasse).
