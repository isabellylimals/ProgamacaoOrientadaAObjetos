package ListaReusodeClasses.Questao62;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(String evento, String data, int hora) {
        super(data, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "EventoHeranca [evento=" + evento + ",Hora()=" + getHora() + ",Data()=" + getData() + "]";
    }

}
