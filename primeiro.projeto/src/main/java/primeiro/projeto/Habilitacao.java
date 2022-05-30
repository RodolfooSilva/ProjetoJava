package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {

		String nome= "Alice Silva";
		int idade= 16;
		int idadePermitida = 21;
		boolean emancipado = false;

		if (idade >= idadePermitida || emancipado) {

			System.out.println(" Você pode tirar Habilitação " + nome);
		}

		else {
			System.out.println("Você não pode tirar Habilitação " + nome);

		}

	}

}
