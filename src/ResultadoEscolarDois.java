// ResultadoEscolar.java
public class ResultadoEscolarDois {
    public static void main(String[] args) {
        int nota = 9;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7) // sempre retornar true ou false
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}