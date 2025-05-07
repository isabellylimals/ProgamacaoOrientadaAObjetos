package primeiraunidade.CriacaoClasses.Evento;

public class EventoAcademico {
    String nome;
    String local;
    int numParticipantes;

    public EventoAcademico(int numParticipantes, String nome, String local) {
        this.nome=nome;
        this.local= local;
        //(local.isEmpty()? "UFERSA" : 1);
        this.numParticipantes= (numParticipantes>0 ? numParticipantes : 1);
    }
    @SuppressWarnings("unused")
        void mostraEvento(){
        System.out.println("Nome do evento: "+ nome + "\nLocal: " + local + "\nNumero de participantes: " + numParticipantes);
    }
}
