package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;
import jdk.nashorn.internal.ir.CatchNode;

public class ClasseTeste {

	public static void main(String[] args) {

		try {
		
		
		String login = JOptionPane.showInputDialog("Informe o login : ");
		String senha = JOptionPane.showInputDialog("Informe a senha : ");
		
		PermitirAcesso permitiracesso = new Diretor(login, senha);
		
		if (new FuncaoAutenticacao(permitiracesso).autenticar()) {		
		
		/* Cria as lista de Alunos e dos Aprovado, Reprovados e Recuperacao */
		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 3; qtd++) {

			/* Se quizer pode pedir mais dados */
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");

			Aluno aluno1 = new Aluno();/*Instancia um Aluno*/
			aluno1.setNome(nome);

			for (int pos = 1; pos <= 1; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Qual o nota da Disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();/*Instancia uma Discisplina*/
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);/* Adiciona a disciplina e a nota ao aluno */

			}
			alunos.add(aluno1); /* Adiciona o aluno a lista de alunos */
		}

		/* Separa os alunos Aprovado, Reprovado, Recuperacao */
		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);/* Esta é a opcao de Reprovado */
			}

		}

		/* Saida do console */
		System.out.println("---------Listas dos Aprovados : ------------");
		for (Aluno aluno : alunosAprovados) {

			System.out.println("O nome é : " + aluno.getNome());
			System.out.println("Resultados : " + aluno.getAlunoAprovado2());
			System.out.println("A m´dia é : " + aluno.getMediaNota());

		}

		System.out.println("---------Listas dos Reprovados : ------------");
		for (Aluno aluno : alunosReprovados) {

			System.out.println("O nome é : " + aluno.getNome());
			System.out.println("Resultados : " + aluno.getAlunoAprovado2());
			System.out.println("A m´dia é : " + aluno.getMediaNota());

		}

		System.out.println("---------Listas dos Recuperacao : ------------");
		for (Aluno aluno : alunosRecuperacao) {

			System.out.println("O nome é : " + aluno.getNome());
			System.out.println("Resultados : " + aluno.getAlunoAprovado2());
			System.out.println("A m´dia é : " + aluno.getMediaNota());

		}

	}else {
		JOptionPane.showMessageDialog(null, "Senha incorreta, acesso negado !");
	}
		
			
	}catch (Exception e) {
		e.printStackTrace();
		
		System.out.println("Mensagem erro : " + e.getMessage());
	}
		
	}		

}
