package primeiro.projeto;

public class Aprovacao {

	public static void main(String[] args) {
		
		
		double nota1 = 10.0;
		double nota2 = 9.5;
		double nota3 = 8.45;
		double media = ( nota1 + nota2 + nota3 )/ 3;
		double notaAprovacao = 8.0;
		boolean falta = false;
		
		if (media >= notaAprovacao && falta ) {
			
			System.out.println("Aluno Aprovado " + media+".");
		}
		
		else {
			System.out.println("Aulo reprovado " +media+".");
		}

	}

}
