import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		aluno1.setNome(scanner.nextLine());
		System.out.println("Digite a média do aluno");
		aluno1.setMedia(scanner.nextDouble());
		System.out.println("Digite a quantidade de faltas do aluno");
		aluno1.setQtdeFaltas(scanner.nextInt());
		
		System.out.println("Aluno: " + aluno1.getNome() + "\nMedia: " + aluno1.getMedia() + "\nFaltas: " + aluno1.getQtdeFaltas());
	}

}
