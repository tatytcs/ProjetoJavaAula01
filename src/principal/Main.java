package principal;

import java.util.UUID;
import javax.swing.JOptionPane;
import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sistema para cadastro de clientes!");

		var cliente = new Cliente();

		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf do cliente"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente"));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o e-mail do cliente"));

		System.out.println("\nDados do cliente:");
		System.out.println("\tId........: " + cliente.getId());
		System.out.println("\tNome......: " + cliente.getNome());
		System.out.println("\tCPF.......: " + cliente.getCpf());
		System.out.println("\tTelefone..: " + cliente.getTelefone());
		System.out.println("\tEmail.....: " + cliente.getEmail());

		var clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);

	}

}
