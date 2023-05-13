package verificar_expressao_matematica;

import java.util.Scanner;

public class Verificador {

    public static boolean verificarExpressao(String expressao) {
    	Pilha pilha = new Pilha();
        
        for (char i : expressao.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                pilha.push(i);
            } else if (i == ')' || i == ']' || i == '}') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((topo == '(' && i != ')') || (topo == '[' && i != ']') || (topo == '{' && i != '}')) {
                    return false;
                }
           
            }
        
        }

        if (!pilha.isEmpty()) {
            return false;
        }

        char ultimoCaractere = expressao.charAt(expressao.length() - 1);
        if (ultimoCaractere == '+' || ultimoCaractere == '-' || ultimoCaractere == '*' ||
        		ultimoCaractere == '/' || ultimoCaractere == '^') {
            return false;
        }

        return true;
        
    }
    
    public static void main(String[] args) {
    	while (true) {
	    	Scanner input = new Scanner(System.in);
	    	System.out.print("Insira a expressão ou apenas clique ENTER para sair: ");
	        String expressao = input.nextLine();
	        
	        if (expressao.isEmpty()) {
	        	System.out.println("Até mais.");
	        	break;
	        } else if (verificarExpressao(expressao)) {
	            System.out.println("A expressão está correta.");
	        } else {
	            System.out.println("A expressão está errada.");
	        }
    	}
    }
}

