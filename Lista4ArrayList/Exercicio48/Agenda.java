//  Crie também uma classe Agenda que:
//  • encapsule uma agenda de compromissos representada por um ArrayList de instân
// cias da classe EntradaEmAgenda;– este item é obrigatório. Caso não seja contemplado, toda a questão será des
// considerada
//  • implemente um método construtor;
//  • possua um método para adicionar um novo compromisso à lista de compromissos;
//  • tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as
//  instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
//  Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 2 compro
// missos e, usando o método listaDia, liste as entradas da agenda que tem a mesma da
//  data do seu aniversário
package Lista4ArrayList.Exercicio48;
import java.util.ArrayList;
public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;
    public Agenda() {
        compromissos = new ArrayList<>();
    }
    public void adicionarCompromisso(EntradaEmAgenda compromisso) {
        compromissos.add(compromisso);
    }
    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda compromisso : compromissos) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso);
            }
        }
    }
}
