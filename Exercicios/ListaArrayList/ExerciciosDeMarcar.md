53. **[FCC- 2022- Analista Judiciário- Tecnologia da Informação]**  
Considere o código Java abaixo:
```java
public class Main {
    public static void main(String args[]) {
        int dados[][] = new int[5][];
        for(int i = 0; i < 5; i++) {
            dados[i] = new int[5];
            for(int j = 0; j < 5; j++) {
                dados[i][j] = i + j;
                System.out.println(dados[i][j]);
            }
        }
    }
}
```
Sobre o código:
- (A) Ocorrerá uma exceção do tipo NullPointerException, pois na terceira linha não foi definido o número de linhas da array dados.
- (B) Ao tirar o comando `dados[i] = new int[5];` o programa executará normalmente.
- (C) O comando `int[][] dados = new int[5][];` precisa obrigatoriamente ser substituído por `int[][] dados = new int[5][5];`.
- **(D) `i < 5` na quarta linha pode ser substituído por `i < dados.length` sem afetar a lógica de execução.**
- (E) Ocorrerá uma exceção do tipo NullPointerException no comando `dados[i][j] = i + j;`.

---

54. **[UFMA- 2023- Analista de Tecnologia da Informação]**  
Na linguagem de programação JAVA, qual das seguintes alternativas representa uma declaração válida?
- **(A) `char[ ] ch = new char[5]`**
- (B) `char[ ] ch = new char(5)`
- (C) `char[ ] ch = new char( )`
- (D) `char[ ] ch = new char[ ]`
- (E) `char[] ch = new [5]`

---

55. **[CONSULPLAN- 2017- TRF- 2ª REGIÃO- Analista Judiciário- Informática Desenvolvimento]**  
“Um array em Java é uma coleção ordenada que ocupa uma porção fixa e sequencial da memória. Além disso, é definido como uma estrutura homogênea, pois armazena um determinado tipo de dado. Esse, por sua vez, faz referências para objetos, valores de um tipo primitivo ou para outros arrays.”  
Considere que o usuário digitou os valores: 14, 40, 16, 22 e 60 para o array.  
Assinale a alternativa que contém o valor que será exibido quando executado o código Java a seguir:
```java
for (i = 0; i < 5; i++) {
    for (j = 0; j < 4; j++) {
        if (vetor[j] < vetor[j + 1]) {
            aux = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = aux;
        }
    }
}
```
- **(A) 14, 16, 22, 40 e 60.**
- (B) 28, 32, 44, 80 e 120.
- (C) 60, 40, 22, 16 e 14.
- (D) 120, 80, 44, 32 e 28.

---

56. **[CS-UFG- 2024- Câmara de Anápolis- GO- Analista Administrativo- Analista de Sistemas]**  
Considere o trecho abaixo de código escrito na linguagem Java:
```java
int index, aux, i, j;
for (i = 0; i <= 3; i++) {
    index = i;
    for (j = i + 1; j <= 4; j++) {
        if (v[j] < v[index]) {
            index = j;
        }
    }
    if (index != i) {
        aux = v[index];
        v[index] = v[i];
        v[i] = aux;
    }
}
```
Suponha um vetor inteiro `v` de tamanho 5. Ao entrar com valores `v = [3, 7, 2, 3, 10]` a saída deste vetor após passar pelo código será:
- (A) v = [10, 7, 3, 3, 2].
- (B) v = [2, 3, 10, 3, 7].
- (C) v = [3, 3, 2, 10, 7].
- **(D) v = [2, 3, 3, 7, 10].**

---

57. **[FADE- UFPE- 2023- UFPE- Analista de Tecnologia da Informação- Área: Sistemas]**  
Considere o seguinte código em Java:
```java
public class Main {
    public static void main(String[] args) {
        Integer[] A = new Integer[3];
        A[0] = 2;
        A[1] = 3;
        A[2] = 9;
        proc(A, A[2]);
        System.out.println(A[0] + A[1] + A[2]);
    }
    private static void proc(Integer[] B, Integer c) {
        B[0] = c;
        B[2] = B[0] + B[1];
    }
}
```
A execução desse código resulta na impressão do seguinte valor:
- (A) 14
- (B) 17
- **(C) 24**
- (D) 11
- (E) 21

---

58. **[FADE- UFPE- 2023- UFPE- Analista de Tecnologia da Informação- Área: Sistemas]**  
Considere o seguinte código em Java:
```java
public class Main {
    public static void main(String[] args) {
        int[] A = {12, 25, 16, 11, 9, 31, 23, 27, 22};
        System.out.println(A[A[2] - A[4]] - A[6]);
    }
}
```
A execução desse código resulta na impressão do seguinte valor:
- **(A) 4**
- (B) 3
- (C) 2
- (D) 1
- (E) 0

---

59. **[UFU-MG- 2023- Analista de Tecnologia da Informação Área 1- Desenvolvimento de Sites, Aplicações e Sistemas]**  
Analise o programa em Java, descrito a seguir, e marque a alternativa correta que apresenta o resultado correto da execução desse programa:
```java
public class App {
    public static void main(String[] args) {
        int[] j = new int[6];
        for (int i = 0; i < 6; i++)
            j[i] = i;
        App func = new App();
        System.out.println(func.f(j, 6));
    }
    public int f(int j[], int n) {
        if (n <= 0) return 1;
        return j[n-1] * f(j, n-2) + 1;
    }
}
```
- **(A) 36**
- (B) 42
- (C) 33
- (D) 26

---

60. **[IFRN- 2009- Professor- Sistemas de Informação]**  
Analise o seguinte código Java, abaixo:
```java
1 public class test {
2
3     public static void main(String[] SSn10) {
4
5         int a[] = {1,2,3,4,5};
6         int b[] = {1,2,3,4,5,6,7,8,9,10};
7         final int tam=a.length;
8         for(int f=0;f<tam;f++)
9             a[f] = a[f]*f;
10        tam=b.length;
11        for(int f=0; f<tam;f++)
12            b[f]+=a[f/2]%(f+1);
13    }
14 }
```
Assinale a alternativa que contém o número da linha do código acima que promove um erro de compilação.
- (A) 2
- (B) 7
- (C) 8
- **(D) 10**