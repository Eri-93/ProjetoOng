package Ong;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;

	public PessoaJuridica(String nome, String cnpj,String endereco, String telefone, String celular) {
		super(nome, endereco, telefone, celular); 
		this.cnpj = cnpj;
	}


	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	 
	
	
	public void imprimir() {
		System.out.println("Classe Pessoa juridica");
 
	}
	
	
}
