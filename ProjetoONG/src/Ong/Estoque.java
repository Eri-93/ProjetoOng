package Ong;

public class Estoque {
	
	private int[] equipamento ={0,0};

	
	
	public void retirar(int equip) {
 
		equipamento[equip]-=1;

	}
	
	
	public void adicionar(int equip) {
		
		equipamento[equip]+=1;
		 	 
	}
		
 
	
	public void verEstoque(int equip) {	
		 
			if(equip ==0) {
				
				 System.out.println("Quantidade de computadores: " + equipamento[equip]);
			}
			else {
				 System.out.println("Quantidade de tablets: " + equipamento[equip]);	
			}

		 
	}
	

}
