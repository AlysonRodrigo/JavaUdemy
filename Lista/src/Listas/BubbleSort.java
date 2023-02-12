package Listas;

public class BubbleSort {

	public static void main(String[] args) {
		int vetor[] = {1,5,2,4,8,6,7};
		int aux;
		boolean controle;
		
		 
		for(int i = 0; i < vetor.length; ++i){
			controle = true;
			for(int j = 0; j < (vetor.length - 1); ++j){
				
				if(vetor[j] > vetor[j + 1]){
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if(controle){
				break;
			}
		}
		
		for (int i = 0; i < vetor.length; ++i) {
			System.out.print(vetor[i] + " ");
		}

	}

}
