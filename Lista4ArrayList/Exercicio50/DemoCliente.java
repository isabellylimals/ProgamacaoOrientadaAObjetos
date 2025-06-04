package Lista4ArrayList.Exercicio50;

import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();

        String nomeVar;
        int idadeVar, idVar, telVar;

        do {
            System.out.print("Id (Digite 0 ou negativo para sair): ");
            idVar = sc.nextInt();
            sc.nextLine(); 

            if (idVar < 1) break;

            System.out.print("Nome: ");
            nomeVar = sc.nextLine();

            System.out.print("Idade: ");
            idadeVar = sc.nextInt();

            System.out.print("Telefone: ");
            telVar = sc.nextInt();
            sc.nextLine(); 

            cadastro.adicionarCliente(new Cliente(idVar, idadeVar, nomeVar, telVar));

        } while (true);

        System.out.println("\nLISTA DE CLIENTES:");
        cadastro.imprimirClientes();

        sc.close();
    }
}
