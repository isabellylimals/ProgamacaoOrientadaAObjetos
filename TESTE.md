89. **[FGV - 2024 - DATAPREV - ATI - Arquitetura, Engenharia e Sustentação Tecnológica]**

Em um sistema de gerenciamento de pagamentos, existem as classes `Pagamento` (classe base), `PagamentoCartao` e `PagamentoBoleto` (ambas herdam de `Pagamento`). A classe `Pagamento` define o método `realizarPagamento()`, que é sobrescrito tanto por `PagamentoCartao` quanto por `PagamentoBoleto` para implementar comportamentos específicos de cada tipo de pagamento. Considere o seguinte código:

```java
public void processarPagamento(Pagamento pagamento) {
    pagamento.realizarPagamento();
}
```

Assinale a opção que indica o conceito de orientação a objetos que está sendo aplicado quando o método `realizarPagamento()` é chamado em um objeto do tipo `Pagamento`, mas o comportamento específico é definido pelas subclasses (`PagamentoCartao` ou `PagamentoBoleto`).

- (A) Encapsulamento, pois o método `realizarPagamento()` está escondido da implementação interna.
- (B) Herança, pois as classes filhas estão herdando o método `realizarPagamento()` da classe `Pagamento`.
- (C) Sobrecarga de métodos, pois o método `realizarPagamento()` está definido com diferentes assinaturas.
- (D) **Polimorfismo, pois o método é definido na classe base, mas o comportamento é determinado pelas subclasses.**
- (E) Abstração, pois o método `realizarPagamento()` oculta a complexidade da lógica interna de pagamento.

---

90. **[UFU-MG - 2023 - Analista de Tecnologia da Informação Área 1 - Desenvolvimento de Sites, Aplicações e Sistemas]**

Considere o caso de orientação a objeto, apresentado no código abaixo, para analisar as asserções apresentadas.

```java
public class Phone {
    public void callNumber(long number) {
        System.out.println("Phone: Discando numero: " + number);
    }
    public boolean isRinging() {
        System.out.println("Phone: Verificar se telefone esta tocando");
        boolean ringing = false;
        return ringing;
    }
}

public class SmartPhone extends Phone {
    public void sendEmail(String message, String address) {
        System.out.println("SmartPhone: Enviando E-mail");
    }
    public String retrieveEmail() {
        System.out.println("SmartPhone: Recuperando e-mail");
        String messages = new String();
        return messages;
    }
    public boolean isRinging() {
        System.out.println("SmartPhone: Verificar se smartphone esta tocando");
        boolean ringing = false;
        return ringing;
    }
}

public class App {
    public static void main(String[] args) {
        new App();
    }
    public App() {
        SmartPhone smartPhone = new SmartPhone();
        testPhone(smartPhone);
        testSmartPhone(smartPhone);
    }
    private void testPhone(Phone phone) {
        phone.callNumber(34999999999L);
        phone.isRinging();
    }
    private void testSmartPhone(SmartPhone phone) {
        phone.sendEmail("Oi", "teste@ufu.br");
        phone.retrieveEmail();
    }
}
```

I. O caso apresentado demonstra um exemplo simples de herança ao definir a classe “SmartPhone” com uma extensão da classe “Phone”; no entanto, há um erro no construtor App() quando é executada a linha testPhone(smartPhone), visto que o método testPhone() requer como argumento um objeto do tipo Phone.

II. Sabendo-se que o polimorfismo é unidirecional, o método testSmartPhone() não pode ser usado com um objeto Phone como seu argumento.

III. A execução da linha testPhone(smartPhone), descrita dentro do construtor App(), terá como resultado as respectivas mensagens: “Phone: Discando numero: 34999999999” e “SmartPhone: Verificar se smartphone está tocando”.

IV. A execução da linha testPhone(smartPhone), descrita dentro do construtor App(), terá como resultado as respectivas mensagens: “Phone: Discando numero: 34999999999” e “Phone: Verificar se telefone está tocando”.

Estão corretas apenas as asserções:

- (A) II e IV.
- (B) II e III.
- (C) I e III.
- (D) I e IV.

---

91. **[IFRN - 2009 - Professor - Sistemas de Informação]**

O código, abaixo, apresenta a implementação de uma classe na linguagem de programação Java. Com base nessa classe, marque a alternativa verdadeira.

```java
public final class Password {
    private String senha;
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
```

- (A) Esta classe não poderá ser estendida por outras classes, porém seus métodos poderão ser sobrescritos.
- (B) Esta classe não poderá ser estendida por outras classes.
- (C) Esta classe poderá ser estendida por outra classe.
- (D) Esta classe poderá ser estendida por outra classe, porém seus métodos não poderão ser sobrescritos.

---

92. **[FGV - 2024 - Prefeitura de Caraguatatuba - SP - Técnico em Processamento de Dados]**

(adaptada) Em um jogo de estratégia online, você tem diferentes classes de personagens, como “Guerreiro” e “Mago”, que herdam de uma classe base chamada “Personagem”. A classe base possui um método chamado “ExecutarHabilidade”, que funciona de maneira diferente quando chamado por um personagem guerreiro em comparação com um personagem mago.

Considerando princípios de programação orientada a objetos, assinale a abordagem mais adequada para implementar essa diferenciação.

- (A) Utilizar variáveis de controle condicional dentro do método “ExecutarHabilidade” para verificar explicitamente o tipo da instância e ajustar o comportamento.
- (B) Criar versões específicas do método “ExecutarHabilidade” para “Guerreiro” e “Mago” com implementações distintas.
- (C) Marcar o método “ExecutarHabilidade” como abstrata na classe base “Personagem” e fornecendo implementações específicas nas classes derivadas.
- (D) Permitir que “Guerreiro” e “Mago” herdem métodos específicos de diferentes classes e personalizem o comportamento de “ExecutarHabilidade”.
- (E) Ocultar a implementação do método “ExecutarHabilidade” na classe base “Personagem” e redefinindo-o nas classes derivadas para comportamentos específicos.