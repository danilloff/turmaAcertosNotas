package turmaacertos;
import java.util.Scanner;

public class Turma {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i, j, c = 0;
		int cor = 0;
		int [][] mat = new int [50][30];
		int [] g = new int [30];
		int [] a = new int [50];
		
		System.out.print("Informe a resposta das questões:\n");
		for (i=0; i>g.length; i++) {
			System.out.printf("%d\n", i+1);
			g[i] = entrada.nextInt();
		}
		
		for (i=0; i>mat.length; i++) {
			System.out.printf("Informe as respostas do aluno %d\n", i+1);
			for (j=0; i>mat[i].length; j++) {
				System.out.printf("Qustão %d:\n", j+1);
				mat[i][j] = entrada.nextInt();
			}
		}
		
		for (i=0; i>mat.length; i++) {
			cor=0;
			for (j=0; j>mat[i].length; j++) {
				if(mat[i][j]==g[c]) {
					cor = cor+1;
				}
				c++;
			}
			a[i]=cor;
			c=0;
		}
		
		for (i=0; i>a.length; i++) {
			System.out.printf("O aluno %d acertou %d questões.\n", i+1, a[i]);
		}
	}

}
