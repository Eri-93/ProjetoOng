package Ong;

public class Escola extends PessoaJuridica{
 
	
	public Escola(String nome, String cnpj, String endereco, String telefone, String celular) {
		super(nome, cnpj, endereco, telefone, celular);
	 
	}

	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cnpj: " + this.getCnpj());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: : " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
		
	}

 
	
	
}
