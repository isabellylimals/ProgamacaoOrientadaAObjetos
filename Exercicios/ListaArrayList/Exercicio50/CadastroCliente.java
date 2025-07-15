package Exercicios.ListaArrayList.Exercicio50;

import java.util.ArrayList;

public class CadastroCliente {
    private ArrayList<Cliente> clientes;

    public CadastroCliente() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void imprimirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            for (Cliente c : clientes) {
                System.out.println("Dados do cliente:");
                System.out.println(c.getInfo());
                System.out.println("---------------");
            }
        }
    }
}

