package Ong;

import java.util.Scanner;

public class Aluno extends PessoaFisica{

	
	public Aluno(String nome,String cpf, String endereco, String telefone, String celular, String responsavel) {
		super(nome, cpf, endereco, telefone, celular);
		this.responsavel = responsavel;
	}    
		
	    Scanner ler = new Scanner(System.in);
		
		private String responsavel;
		
		public void CadastroAluno () {
			System.out.println("Digite seu nome: ");
			this.setNome(ler.next());
			System.out.println("Digite seu CPF: ");
			this.setCpf(ler.next());
			System.out.println("Digite seu endereço: ");
			this.setEndereco(ler.next());
			System.out.println("Digite seu telefone: ");
			this.setTelefone(ler.next());
			System.out.println("Digite seu celular: ");
			this.setCelular(ler.next());
			System.out.println("Nome do Responsável: ");
			this.responsavel =ler.next();
			
		 
	}

	public void imprimir() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("Responsavel: " + this.responsavel);
	
	}
	


}
