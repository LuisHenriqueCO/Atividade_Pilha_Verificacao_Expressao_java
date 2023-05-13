package verificar_expressao_matematica;

import java.util.ArrayList;

public class Pilha {
	
	private ArrayList<Character> pilha = new ArrayList<Character>();
	
	public void push(char elemento) {
	    pilha.add(elemento);
	}

	public char pop() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.remove(pilha.size() - 1);
	}

	public char top() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.get(pilha.size() - 1);
	}

	public boolean isEmpty() {
	    return pilha.isEmpty();
	}

	public int size() {
	    return pilha.size();
	}


}
