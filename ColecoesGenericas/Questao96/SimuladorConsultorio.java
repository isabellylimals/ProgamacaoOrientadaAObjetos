package ColecoesGenericas.Questao96;

import java.util.*;

public class SimuladorConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaNormal = new LinkedList<>();
 //Paciente paciente = new Paciente(125874, 25);
        Random random = new Random();
        int tempo = 0;
        int pacientesAtendidos = 0;

        while (pacientesAtendidos < 20) {
            // A cada 4 minutos, chega um novo paciente
            if (tempo % 4 == 0) {
                int rg = 100000 + random.nextInt(900000);
                int idade = 10 + random.nextInt(80);

               
            Paciente novo= new Paciente(rg, idade);
                if (idade > 60) {
                    filaPrioritaria.add(novo);
                } else {
                    filaNormal.add(novo);
                }

                System.out.println("Novo paciente chegou: " + novo);
            }

            // A cada 5 minutos, consulta um paciente
            if (tempo % 5 == 0 && tempo > 0) {
                Paciente atendido = null;
                if (!filaPrioritaria.isEmpty()) {
                    atendido = filaPrioritaria.poll();
                } else if (!filaNormal.isEmpty()) {
                    atendido = filaNormal.poll();
                }

                if (atendido != null) {
                    System.out.println("Atendido no minuto " + tempo + ": " + atendido);
                    pacientesAtendidos++;
                }
            }

            tempo++;
        }

        System.out.println("Dia encerrado! Total de pacientes atendidos: " + pacientesAtendidos);
    }
}
