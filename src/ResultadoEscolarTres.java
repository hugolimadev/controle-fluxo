
public class ResultadoEscolarTres {
	public static void main(String[] args) {
		// Cenário 1
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        //cenario 2
        int nota1 = 6;
		String resultado1 = nota1 >=7 ? "Aprovado" : nota1 >=5 && nota1 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado1);

	}
}