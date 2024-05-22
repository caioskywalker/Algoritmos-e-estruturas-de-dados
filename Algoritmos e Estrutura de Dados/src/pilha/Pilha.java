package pilha;

import java.lang.reflect.Array;

public class Pilha {

	private Object[] pilha;
	private int posicao;

	public Pilha(int pilhaLenght) {
		this.posicao = -1; // Nula, pois nossa pilha terá algum inteiro a partir da posicao 0
		pilha = new Object[pilhaLenght - 1];// inicializara a pilha com o tamanho que quisermos, contando com a posicao
											// 0
	}

	public boolean isPilhaEmpty() {
		if (this.posicao != -1) {
			return false;
		}
		return true;
	}

	public int size() {// numero de elementos na pilha
		if (this.isPilhaEmpty() == true) {
			return 0;
		} else {
			return this.posicao + 1;
		}
	}

	public void push(int valor) { //Coloca um inteiro no topo da pilha.
		if (this.posicao < this.pilha.length) {// Verifica se nossa pilha tem o tamanho necessario para alojar nosso
												// novo valor
			this.pilha[++this.posicao] = valor; // seta o valor e a posicao de nossa pilha;
		}
	}

	public Object pop() {
		if (this.isPilhaEmpty()) {
			return null;
		}
		return this.pilha[--this.posicao];
	}

	public Object top() {
		if (this.isPilhaEmpty()) {
			return null;
		} else {
			return this.pilha[this.posicao];
		}
	}

}
