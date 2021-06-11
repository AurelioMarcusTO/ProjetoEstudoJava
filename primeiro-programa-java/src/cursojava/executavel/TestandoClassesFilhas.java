package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Aurelio Marcus");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setNome("Mario");
		diretor.setRegistroGeral("857348573572093502");
		diretor.setIdade(45);

		Secretario secretario = new Secretario();
		secretario.setNome("Maria");
		secretario.setExperiencia("Administracao");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() + " - " + diretor.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade() + " - " + secretario.msgMaiorIdade());

		System.out.println("O salário do diretor é : " + diretor.salario());

		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(Pessoa pessoa) {

		System.out.println("Essa pessoa é : " + pessoa.getNome() + " seu salário é " + pessoa.salario());

	}

}
