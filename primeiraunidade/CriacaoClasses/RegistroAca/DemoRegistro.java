package primeiraunidade.CriacaoClasses.RegistroAca;

public class DemoRegistro {
    public static void main(String[] args) {
        RegistroAcademico isa = new RegistroAcademico();
        isa.inicializaRegistroAcademico("Isabelly", "123456", 2, 60);
            double valorMensalidade = isa.calculaValorMensalidade();
        System.out.println("Valor da mensalidade: " + valorMensalidade);
        // System.out.println("Nome: " + isa.nome);
        // System.out.println("Matrícula: " + isa.mat);
        // System.out.println("Código do curso: " + isa.codigoCurso);
        // System.out.println("Percentual de cobrança: " + isa.percentualDeCobrança + "%");
        RegistroAcademico kayque = new RegistroAcademico();
        double valorMensalidadeKayque = kayque.calculaValorMensalidade();
        System.out.println("Valor da mensalidade: " + valorMensalidadeKayque); //INICIALIZA COM 0 

    }
}
