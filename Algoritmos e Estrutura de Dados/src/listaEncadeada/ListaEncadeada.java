package listaEncadeada;

import javax.management.RuntimeErrorException;

public class ListaEncadeada<Integer> {

	private No<Integer> inicio;
	private No<Integer> ultimo;
	private int tamanho = 0;
	private final int NAO_ENCONTRADO = -1;

	 public void adiciona(Integer algarismo) {
	        No<Integer> celula = new No<>(algarismo);
	        if (this.tamanho == 0) {
	            this.inicio = celula;
	        } else {
	            this.ultimo.setProximo(celula);
	        }
	        this.ultimo = celula;
	        this.tamanho++;
	    }
	
	private No<Integer> buscaEncapsulado (int posicao){
		
		if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException("NAO_EXISTE");
        }

        No<Integer> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
		
	}
	
	private boolean posicaoNaoExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.tamanho);
    }
	
	 public void adicionaInicio(Integer algarismo) {
	        if (this.tamanho == 0) {
	            No<Integer> novoNo = new No<>(algarismo);
	            this.inicio = novoNo;
	            this.ultimo = novoNo;
	        } else {
	            No<Integer> novoNo = new No<>(algarismo, this.inicio);
	            this.inicio = novoNo;
	        }
	        this.tamanho++;
	    }
	
	public void insertWithPosition(int posicao, Integer algarismo) {
		if(this.posicaoNaoExiste(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}if(posicao == 0) {
			this.adicionaInicio(algarismo);
		}else if(posicao == this.tamanho) {
			this.adiciona(algarismo);
		}else {
			No<Integer> noAnterior = this.buscaEncapsulado(posicao - 1);
			No<Integer> proximoNo = noAnterior.getProximo();
			No<Integer> novoNo = new No<>(algarismo,proximoNo);
			noAnterior.setProximo(novoNo);
			this.tamanho++;
		}
		
	}
	
	
	
	public Integer buscaIndex(int index) {
		return this.buscaEncapsulado(index).getAlgarismo();
		
	}
	
	public int busca(Integer algarismo) {
		int posicao = 0;
		No<Integer> nodeAtual = this.inicio;
		while(nodeAtual != null) {
			if(nodeAtual.getAlgarismo().equals(algarismo)) {
				return posicao;
			}
		posicao++;
		nodeAtual = nodeAtual.getProximo();	
		}
		return NAO_ENCONTRADO;
	}	

	public String printList() {
		if (this.tamanho == 0) {
			return "[]";

		}
		StringBuilder builder = new StringBuilder("[");
		No<Integer> atual = this.inicio;
		for (int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getAlgarismo()).append(",");
			atual = atual.getProximo();
		}
		builder.append(atual.getAlgarismo()).append("]");
		return builder.toString();
	}

	public void clearList() {
		for (No<Integer> atual = this.inicio; atual != null;) {
			No<Integer> proximo = atual.getProximo();
			atual.setAlgarismo(null);
			atual.setProximo(null);
			atual = proximo;
		}
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;

	}

	public int getTamanho() {
		return this.tamanho;
	}
	
	public Integer pop() {
		if(this.tamanho == 0) {
			throw new RuntimeException("LISTA_VAZIA");
		}if(this.tamanho == 1) {
			return this.removeInicio();
		}
		No<Integer> penultimoNo = this.buscaEncapsulado(this.tamanho - 2);
		Integer removido = penultimoNo.getProximo().getAlgarismo();
		penultimoNo.setProximo(null);
		this.ultimo = penultimoNo;
		this.tamanho--;
		return removido;	
	}

	private Integer removeInicio() {
		 if (this.tamanho == 0) {
	            throw new RuntimeException("LISTA_VAZIA");
	        }
	        Integer removido = this.inicio.getAlgarismo();
	        this.inicio = this.inicio.getProximo();
	        this.tamanho--;

	        if (this.tamanho == 0) {
	            this.ultimo = null;
	        }

	        return removido;
	}
	
	 public Integer remove(int posicao) {

	        if (this.posicaoNaoExiste(posicao)) {
	            throw new IllegalArgumentException("NAO_EXISTE");
	        }

	        if (posicao == 0) {
	            return this.removeInicio();
	        }
	        if (posicao == this.tamanho - 1) {
	            return this.pop();
	        }
	        No<Integer> noAnterior = this.buscaEncapsulado(posicao - 1);
	        No<Integer> atual = noAnterior.getProximo();
	        No<Integer> proximo = atual.getProximo();
	        noAnterior.setProximo(proximo);
	        atual.setProximo(null);
	        this.tamanho--;
	        return atual.getAlgarismo();
	    }

}
