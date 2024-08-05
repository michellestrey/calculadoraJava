package calculadoraSimples;

import java.util.Scanner;

public class Calculadora extends Operacoes{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Operacoes operacao1 = new Operacoes();

		
		System.out.println("          Calculadora simples! ");
		System.out.println("=========INSIRA O PRIMEIRO NÚMERO==========");
		double a = input.nextDouble();
		System.out.println("=========INSIRA O SEGUNDO NÚMERO==========");
		double b = input.nextDouble();
		System.out.println("Escolha a operação (+ - * /)");
		char operacao = input.next().charAt(0);
		double resultado = 0;
		
		
		try {
			switch(operacao) {
			case '+':
				resultado = operacao1.somar(a, b);
				break;
			case '-':
				resultado = operacao1.subtrair(a, b);
				break;
			case '*':
				resultado = operacao1.multiplicar(a, b);
				break;
			case '/':
				resultado = operacao1.dividir(a, b);
				break;
			default:
				System.out.println("Operação inválida! Reinicie o programa.");	
				return;
			}
			System.out.println("O resultado é: " + resultado);    

		}catch(ArithmeticException e) {
			System.out.print(e.getMessage());


		}
		
	}
	
}
