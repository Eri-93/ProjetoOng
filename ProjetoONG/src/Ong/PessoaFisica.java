package Ong;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	
	
	public PessoaFisica(String nome,String cpf, String endereco, String telefone, String celular) {
		super(nome, endereco, telefone, celular);
		this.cpf = cpf;
		 
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
 
	
	public void imprimir() {
		System.out.println("Classe Pessoa fisica");
 
	}
	
}
