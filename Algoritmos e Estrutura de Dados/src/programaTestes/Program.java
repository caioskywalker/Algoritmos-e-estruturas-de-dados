package programaTestes;

import fifo.Fifo;
import fifo.FifoLinear;
import listaEncadeada.ListaEncadeada;
import pilha.Pilha;

public class Program {

	public static void main(String[] args) {

//		Pilha pilha = new Pilha(10);
//		System.out.println(pilha.isPilhaEmpty());
//		
//		pilha.push(10);
//		pilha.push(20);
//		pilha.push(30);
//		
//		System.out.println("---------------Testes Pilhas ------------");
//		System.out.println(pilha.isPilhaEmpty());
//		System.out.println(pilha.size());
//		System.out.println(pilha.top());
//		System.out.println(pilha.pop());//Remove o valor do topo da pilha e o retorna ao chamador.
//		System.out.println(pilha.size());
//		System.out.println(pilha.top());
//		
//		System.out.println("--------------------------- \n");
//		System.out.println("---------------Testes FIFO ------------");
//		
//		
//		Fifo fifo = new Fifo(5);
//		fifo.enqueue(1);
//		fifo.enqueue(2);
//		fifo.enqueue(3);
//		fifo.enqueue(4);
//		fifo.enqueue(5);
//		fifo.imprimirTodaFila();
//		System.out.println("--------------------------------");
//		System.out.println(fifo.front());
//		System.out.println(fifo.rear());
//		
//		System.out.println("Posicao do front " + fifo.positionFront());
//		System.out.println("Posicao do rear " + fifo.positionRear());
//		System.out.println("--------------------------------");
//		fifo.dequeue();
//		fifo.dequeue();
//		fifo.imprimirTodaFila();
//		System.out.println("--------------------------------");
//		System.out.println(fifo.front());
//		System.out.println(fifo.rear());
//		System.out.println("Posicao do front " + fifo.positionFront());
//		System.out.println("Posicao do rear " + fifo.positionRear());
//		System.out.println("--------------------------------");
//		fifo.enqueue(6);
//		fifo.enqueue(7);
//		fifo.imprimirTodaFila();
//		System.out.println("--------------------------------");
//		System.out.println(fifo.front());
//		System.out.println(fifo.rear());
//		System.out.println("Posicao do front " + fifo.positionFront());
//		System.out.println("Posicao do rear " + fifo.positionRear());
//		System.out.println("--------------------------------");
//		fifo.dequeue();
//		fifo.imprimirTodaFila();
//		System.out.println("--------------------------------");
//		System.out.println("Posicao do front " + fifo.positionFront());
//		System.out.println("Posicao do rear " + fifo.positionRear());
//		fifo.dequeue();
//		fifo.dequeue();
//		fifo.imprimirTodaFila();
//		System.out.println("--------------------------------");
//		System.out.println("Posicao do front " + fifo.positionFront());
//		System.out.println("Posicao do rear " + fifo.positionRear());
//		fifo.imprimirTodaFila();
//		System.out.println("--------------------------------");

//		FifoLinear fl = new FifoLinear(5);
//		fl.enqueue(1);
//		fl.enqueue(2);
//		fl.enqueue(3);
//		fl.enqueue(4);
//		fl.enqueue(6);
//
//		fl.imprimirTodaFila();
//		System.out.println("----------------");
//		fl.dequeue();
//
//		fl.imprimirTodaFila();
//		System.out.println("----------------");
//		System.out.println(fl.getPrimeiro());
//		System.out.println(fl.getUltimo());
//		fl.enqueue(7); A partir daqui dará erro, pois não retorna a posição 0 do array como a FifoCircular
//		fl.imprimirTodaFila();
//		System.out.println("----------------");
		
		System.out.println("----------Testes Lista encadeada----------------");
		
		ListaEncadeada<Integer> lista = new ListaEncadeada();
		lista.adiciona(1);//0
		lista.adiciona(2);//1
		lista.adiciona(3);//2
		lista.adiciona(4);//3
//		System.out.println(lista);
//		System.out.println(lista.getTamanho());//retorna tamanho
//		System.out.println(lista.printList());//imprime lista
//		lista.clearList(); limpa lista
//		System.out.println(lista.busca(1));//posicao 0
//		System.out.println(lista.busca(2));
//		System.out.println(lista.buscaIndex(1));
		lista.insertWithPosition(2,10);
		System.out.println(lista.printList());
		System.out.println(lista.busca(10));
		System.out.println(lista.busca(4));
		lista.pop();
		System.out.println(lista.printList());
		lista.remove(2);
		System.out.println(lista.printList());
		
	}

}
