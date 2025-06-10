package ListaReusodeClasses.Questao61;

public class TestaEquipamento {
    public static void main(String[] args) {
        
        Equipamento equipamento = new Equipamento("Impressora", 899.90);
         Computador computador = new Computador("Notebook Gamer", 4599.90, "Intel i7", 16);
        
        System.out.println("Dados do Equipamento:");
        System.out.println(equipamento.toString());
        
        System.out.println("\nDados do Computador:");
        System.out.println(computador.toString());
        
    
    }
}