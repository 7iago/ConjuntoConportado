package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // retorna Null
		System.out.println(livros.element()); // retorna exeption
		
		System.out.println(livros.poll()); // remove o ultimo adicionado, retorna null
		System.out.println(livros.remove()); // remove e retorna uma exeption
		System.out.println(livros.pop()); // mesmo do remove
		
	}

}
