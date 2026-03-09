package otavio.ordenar.mergesort;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int[] ordenar(int[] vetor, int inicio, int fim) {
		
		int meio=(inicio+fim)/2;
		
		if(inicio<fim) {
			ordenar(vetor, inicio, meio); 			//Subvetores à Esquerda
			ordenar(vetor, meio+1, fim); 			//Subvetores à Direita
			organizar(vetor, inicio, meio, fim); 	//Função para ordenar os vetores
		}
		return vetor;
	}
	
	private void organizar(int[] vetor, int inicio, int meio, int fim) {
		
		// Criando o vetor auxiliar
		int tamanho=vetor.length;
		int[] vetAux = new int[tamanho];
		
		// Preenchendo o vetor auxiliar apenas com os dados do subvetor
		for(int cont=inicio; cont<=fim; cont++) vetAux[cont]=vetor[cont];
		
		// Criando os ponteiros de Esquerda e Direta 
		int pontEsq = inicio;
		int pontDir = meio+1;
		
		
		// Analisando e organizando oa valores do vetor
		for(int cont=inicio; cont<=fim; cont++) {
			
			if(pontEsq>meio) {
				vetor[cont]=vetAux[pontDir];
				pontDir++;
			}else if(pontDir>fim) {
				vetor[cont]=vetAux[pontEsq];
				pontEsq++;
			}else if(vetAux[pontEsq]<vetAux[pontDir]) {
				vetor[cont]=vetAux[pontEsq];
				pontEsq++;
			}else {
				vetor[cont]=vetAux[pontDir];
				pontDir++;
			}
		}
		
	}

}
