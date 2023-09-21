
public class MinhaClasse {
	
	public static void main (String[] args) {
		/*System.out.println("Hello World");
		String meuNome = "Gesley";
		
		int anoNascimento = 1994;
		
		boolean verdadeira = true;
		
		System.out.println(meuNome);
		System.out.println(anoNascimento);*/
		
		String primeiroNome = "Gesley";
		String segundoNome = "Oliveira";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
		
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}
		
}
