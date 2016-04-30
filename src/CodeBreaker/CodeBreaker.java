package CodeBreaker;

public class CodeBreaker {

	public String encontrarNumero(String numeroAdivinar) {

		String numeroSecreto = "4381";
		if (numeroAdivinar.length() == 4) {
			if (comprobarNumero(numeroAdivinar)) {
				return "";
			}
			if (numeroAdivinar.equalsIgnoreCase(numeroSecreto)) {
				return "XXXX";
			} else {
				return compararPorPosicion(numeroAdivinar, numeroSecreto);
			}
		} else {
			return "";
		}
	}

	public String compararPorPosicion(String numeroAdivinar, String numeroSecreto) {
		String respuesta = "";
		for (int i = 0; i < numeroAdivinar.length(); i++) {
			int indiceLetra = numeroSecreto.indexOf(numeroAdivinar.charAt(i));
			if (indiceLetra != -1) {
				if (indiceLetra == i) {
					respuesta = "X" + respuesta;
				} else {
					respuesta = respuesta + "_";
				}

			}
		}
		return respuesta;
	}

	public Boolean comprobarNumero(String validacion) {
		if (validacion.contains("[a-zA-Z]")) {
			return true;
		}
		return false;
	}

}
