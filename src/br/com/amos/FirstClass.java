package br.com.amos;

public class FirstClass {

	public static void main(String[] args) {
		String message = args[0];
		if (message.equalsIgnoreCase(message)) {
			System.out.print("Hello World");
		} else {
			System.out.print("Não há mensagem");
		}

	}

}
