import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		Map<Integer, Livro> biblioteca = new HashMap<Integer, Livro>();	
		int n;
		do{
			System.out.printf("\nDigite a função (1: CADASTRO, 2: LISTAGEM, 3: DETALHAR, 4: REMOVER, Outro valor: SAIR): \n");
			n = Integer.parseInt(sc1.nextLine());
			System.out.print("\033\143");

			switch(n){
				case 1:
					System.out.println("Digite o código do livro: ");
					int codigo = Integer.parseInt(sc1.nextLine());
			
					System.out.println("Digite o nome do livro: ");
					String titulo = sc1.nextLine();
					
					System.out.println("Digite o autor do livro: ");
					String autor = sc1.nextLine();
				
					System.out.println("Digite o ano de publicação do livro: ");
					int ano = Integer.parseInt(sc1.nextLine());


					Livro l1 = new Livro(codigo, titulo, autor, ano);
					
					l1.imprimir();		
					biblioteca.put(codigo, l1);

					break;
				case 2:
					for (Livro l : biblioteca.values()) {
						l.imprimir();
					}
					break;
				case 3:
					System.out.println("Digite o livro para detalhar (CODIGO): ");
					biblioteca.get(Integer.parseInt(sc1.nextLine())).detalhar();
					break;
				case 4:
					System.out.println("Digite o livro para remover (CODIGO): ");
					biblioteca.remove(Integer.parseInt(sc1.nextLine()));
					break;
				default:
					System.out.println("Saindo do programa");
		
			}

		}while(n==1 || n==2 || n==3 || n==4);
	
		sc1.close();
	}
}
