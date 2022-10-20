public class Livro {
	private int codigo;
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro(int codigo, String titulo, String autor, int anoPublicacao){
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public void imprimir(){
		System.out.printf("\n(%d) %s - Autor: %s\n", this.codigo,  this.titulo, this.autor);
	}	

	public void detalhar(){
		System.out.println();
		System.out.println("CODIGO: " + this.codigo);
		System.out.println("TITULO: " + this.titulo);
		System.out.println("AUTOR: " + this.autor);
		System.out.println("ANO: " + this.anoPublicacao);
	}

}
