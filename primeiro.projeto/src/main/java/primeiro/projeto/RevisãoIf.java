package primeiro.projeto;

public class Revis�oIf {

	public static void main(String[] args) {

		int mediaPassar = 10;
		int nota1 = 9;
		int nota2 = 10;
		int nota3 = 7;
		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= mediaPassar) {

			System.out.println("Parabens voc� passou de ano. Sua media � " + media + ".");
		}

		else {
			System.out.println("Infelizmente voc� n�o atingiu a m�dia. Porqu� sua media � " + media + ".");
		}

	}

}
