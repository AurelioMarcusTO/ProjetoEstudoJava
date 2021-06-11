package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

//import com.sun.java_cup.internal.runtime.Scanner;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecoes.ExcecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		try {
			
			lerArquivo();			
			

			String login = JOptionPane.showInputDialog("Informe a login !");
			String senha = JOptionPane.showInputDialog("Informe a senha !");

			PermitirAcesso permitirAcesso = new Aluno(login, senha);

			if (new FuncaoAutenticacao(permitirAcesso).autenticar()) {/* Se true acesso se false nao acessa */

				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do Aluno " + qtd + " ?");

					/* Aluno instanciado, temos um aluno real */

					/* O aluno1 é uma referencia ao objeto Aluno */
					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					for (int pos = 1; pos <= 1; pos++) {

						String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Qual o nota da Disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir alguma disciplina ? ");

					if (escolha == 0) {/* Opção SIM é ZERO */

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane
									.showInputDialog("Qual posição deseja remover 1, 2, 3 ou 4");

							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);

							posicao++;

							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");

						}

					}

					alunos.add(aluno1);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);/* Esta é a opcao de Reprovado */
					}

				}

				System.out.println("---------Listas dos Aprovados : ------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {

					System.out.println("O nome é : " + aluno.getNome());
					System.out.println("Resultados : " + aluno.getAlunoAprovado2());
					System.out.println("A média é : " + aluno.getMediaNota());

				}

				System.out.println("---------Listas dos Reprovados : ------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {

					System.out.println("O nome é : " + aluno.getNome());
					System.out.println("Resultados : " + aluno.getAlunoAprovado2());
					System.out.println("A m´dia é : " + aluno.getMediaNota());

				}

				System.out.println("---------Listas dos Recuperacao : ------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {

					System.out.println("O nome é : " + aluno.getNome());
					System.out.println("Resultados : " + aluno.getAlunoAprovado2());
					System.out.println("A m´dia é : " + aluno.getMediaNota());

				}

			} else {

				JOptionPane.showMessageDialog(null, "Senha incorreta, acesso negado !");
			}

		} catch (Exception e) {

			/* Saida no console */
			StringBuilder saida = new StringBuilder();

			e.printStackTrace();/* Imprime erro no console */

			/* Mensagem do erro */
			System.out.println("Mensagem erro : " + e.getMessage());

			/* Mensagem de erro por lista */

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe do erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Metodo do erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha do erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Erro na Classe : " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de numeros" + saida.toString());

		}finally { /*Sempre é executado ocorrendo erros ou não*/
			/*É usado para processos onde é necessario ser executado tendo erros ou nao*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java !");
		}

	}
	public static void lerArquivo() throws FileNotFoundException {
		
		//File fil = new File("file.txt");
		//java.util.Scanner scan = new java.util.Scanner(fil);
		
	}

}
