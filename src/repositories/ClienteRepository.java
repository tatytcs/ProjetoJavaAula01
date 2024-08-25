package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {
	
	public void exportarDados(Cliente cliente) {
		
		try {
			
			//abrindo o arquivo
			var printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");			
			
			//Gravandos os dados no arquivo informado acima
			printWriter.write("\nDados do cliente:");
			printWriter.write("\nID............:" + cliente.getId());
			printWriter.write("\nNome..........:" + cliente.getNome());
			printWriter.write("\nCPF...........:" + cliente.getCpf());
			printWriter.write("\nTelefone......:" + cliente.getTelefone());
			printWriter.write("\nEmail.........:" + cliente.getEmail());
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!!");
		}
		catch (Exception e) {
			
			System.out.println("Falha ao gravar os dados do arquivo" + e.getMessage());
			
		}
	}

}
