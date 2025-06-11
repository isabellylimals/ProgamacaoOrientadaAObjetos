// 62. Crie uma classe para representar uma data e um horário (DataHora).
//  • Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que
//  contenha um campo para indicar qual o evento que ela representa (use uma String
//  para isto). Use o mecanismo de delegação para criar a classe EventoDelegacao;
//  • Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que
//  contenha um campo para indicar qual o evento que ela representa (use uma String
//  para isto). Use o mecanismo de herança para criar a classe EventoHeranca;
//  • Escreva um aplicativo de teste que demonstre o uso das classes criadas.
package ListaReusodeClasses.Questao62;

public class EventoDelegacao {
    private String evento;
    DataHora dataDoEvento;

    public EventoDelegacao(String evento, String data, int hora) {
        this.dataDoEvento = new DataHora(data, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "EventoDelegacao [evento=" + evento + ", dataDoEvento=" + dataDoEvento + "]";
    }

}
