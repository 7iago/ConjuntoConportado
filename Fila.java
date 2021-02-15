package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		// offer e add adicionam elementos na lista, o compotamento muda se estiver cheia, offer retorna false e add mostra um erro
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // peek quando vazia retorna false
		System.out.println(fila.element()); // element quando vazia mostra uma exeção (erro)
		
		System.out.println(fila.poll()); // pool remove o primeiro elemento da lista, quando vazia, retorna null
		System.out.println(fila.remove()); // remove, remove o primeiro elemento da lista, quando vazia retorna uma exeption
		
		
		
	}

}
