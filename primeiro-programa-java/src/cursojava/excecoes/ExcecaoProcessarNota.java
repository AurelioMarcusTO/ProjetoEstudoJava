package cursojava.excecoes;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		
		super("Ocorreu um erro no processamento das notass do Aluno !" + erro);
		
	}

}
