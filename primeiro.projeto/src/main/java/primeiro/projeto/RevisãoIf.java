package primeiro.projeto;

public class RevisãoIf {

	public static void main(String[] args) {

		int mediaPassar = 10;
		int nota1 = 9;
		int nota2 = 10;
		int nota3 = 7;
		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= mediaPassar) {

			System.out.println("Parabens você passou de ano. Sua media é " + media + ".");
		}

		else {
			System.out.println("Infelizmente você não atingiu a média. Porquê sua media é " + media + ".");
		}

	}

}
