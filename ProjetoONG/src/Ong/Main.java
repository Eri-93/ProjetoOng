package Ong;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		/*Teste doação ok
		Doador doa = new Doador(null, null, null, null, null, 0);
		
		doa.CadastroDoador ();
		doa.Doacao();
		*/ 
		
		Aluno alu = new Aluno (null, null, null, null, null, null);
		
		alu.CadastroAluno();
		alu.imprimir();
		
		/*int opt;
		do {
			System.out.println("Digite uma opção:  \n 1 - Aluno \n 2- Doador \n 3- Escola \n 4 - Sair");
			opt = ler.nextInt();
			switch(opt) {
			case 1: 
				
				break;
			case 2: 
				
				break;
			case 3: 
				
				break;
				
			}
		}
			while(opt!=4);
		
		
		
	 Pessoa pes = new Escola("Escola", "43.888.456/0001.66", "Rua da escola", "31313131", "91919191");
 		
	   pes.imprimir();	
		System.out.println();
		
		pes = new Doador("Doador", "Endereço do doador", "32323232", "92929292");
		pes.imprimir();
		
		pes = new Aluno("Aluno", "45.479.645-03", "Rua do aluno", "3333333333333", "93939393");
		System.out.println();
		pes.imprimir();*/
				
				
		
	}

}
