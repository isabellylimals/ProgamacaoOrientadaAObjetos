package ListaReusodeClasses.Questao62;

public class Evento {
    public static void main(String[] args) {
         EventoDelegacao evento= new EventoDelegacao("Festa", "01/01/2023", 20);//lembrar de trocar hora para string
        EventoHeranca eventoHeranca = new EventoHeranca("Festa", "01/01/2023", 20);
        System.out.println(evento);
        System.out.println(eventoHeranca);         

    }


}
