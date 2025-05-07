package primeiraunidade.CriacaoClasses.Evento;

public class DemoEvento {
    public static void main(String [] args){
        @SuppressWarnings("unused")
        EventoAcademico ev= new EventoAcademico(1,"ecop", "Disney");
        ev.mostraEvento();
    }
}
