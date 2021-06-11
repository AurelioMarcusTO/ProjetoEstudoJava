package cursojava.classes;

/*Classe Mãe ou Super classe ou Classe master (Atributos comuns a todos os objetos filhos)*/
public abstract class Pessoa {

	protected String nome; /* Tem que ser public para ser acessado por outra classe */
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;

	/*
	 * Método abstract que fica na classe pai é obrigatorio existir na classe filha
	 */
	public abstract double salario();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	/* Retorna true caso seja 18 anos para cima */
	public boolean pessoaMaiorIdade() {

		return idade >= 18;

	}
	
	public String msgMaiorIdade() {

		return this.pessoaMaiorIdade() ? "OOpppaaa ! É maior de Idade ! " : "Que pena vc é menor de Idade !";

	}

}
