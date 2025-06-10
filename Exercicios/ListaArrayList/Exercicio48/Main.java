package Lista4ArrayList.Exercicio48;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.adicionarCompromisso(new EntradaEmAgenda(10, 15, 8, 2023, "Reunião de trabalho"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(14, 15, 8, 2023, "Consulta médica"));
        
       
        System.out.println("Compromissos para o dia 15/08/2023:");
        agenda.listaDia(15, 8, 2023);
    }
}
