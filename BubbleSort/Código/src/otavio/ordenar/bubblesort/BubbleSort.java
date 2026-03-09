package otavio.ordenar.bubblesort;

public class BubbleSort {

	public BubbleSort() {
		super();
	}
	
	public int[] ordenar(int[] vetor) {
		
		int aux, tamanho = vetor.length;
		int cont1, cont2;
		/*
		 * O método bubble sort consiste em percorrer o vetor aos pares
		 * e, a cada par, alocar o menor valor a esquerda. Logo o primeiro valor do
		 * par começa em 0 (cont1=0), o segundo estará uma poisção a frente(cont2=cont1+1).
		 * Apenas o segundo valor do par chegará ao último indice do vetor
		 * o primeiro chegará em último-1 (cont1<tamanho-1).
		 * Este processo é repetido N vezes, sendo N o número de elementos do vetor.
		 */
		for(int vezes=0; vezes<tamanho; vezes++) {	
			for(cont1=0; cont1<tamanho-1; cont1++) {
				cont2 = cont1+1;
				if(vetor[cont1]>vetor[cont2]) {
					aux = vetor[cont1];
					vetor[cont1]=vetor[cont2];
					vetor[cont2]=aux;				
				}
			}
		}
		return vetor;
	}

}
