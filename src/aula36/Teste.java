package aula36;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contato contato = new Contato();
		contato.setNome("Celio");
		//contato.setEndereco("Paulista");
		//contato.setTelefone("11 98269-4003");
		
		//relacionamento tem-um endereco (objeto)
		Endereco end = new Endereco();
		end.setNomeRua("Rua Paulista");
		end.setNumero("134");
		end.setComplemento("-");
		end.setCidade("São Paulo");
		end.setEstado("SP");
		end.setCep("03561100");
		
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone (objeto)
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("98269-4003");
		
		contato.setTelefone[](telefone);
		
		//Teste saida no console
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getCidade());
		//System.out.println(contato.getTelefone());

	}

}
