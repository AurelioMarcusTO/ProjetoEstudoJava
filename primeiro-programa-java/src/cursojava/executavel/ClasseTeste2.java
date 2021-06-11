package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClasseTeste2 {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		for (int pos = 0; pos < 3; pos ++) {
			
			Aluno aluno = new Aluno();
			
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + pos + " ? ");
			aluno.setNome(nome);
			
			alunos.add(aluno);
		}
		
		for (Aluno maluno : alunos) {
			
			System.out.println("------------------------------------------");
			System.out.println("O nome do aluno é : " + maluno.getNome());
			
		}

	}

}
