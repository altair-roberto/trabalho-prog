public class Livro {

	private String nomeLivro;
	private String editoraLivro;
	private String codigoLivro;
	private String [] autoresLivro;
	private int numeroPaginas;
	private boolean disponivelParaEmprestimo;

	public Livro (String nome, String editora, String codigo, String [] autores, int paginas) {
		nomeLivro = nome;
		editoraLivro = editora;
		codigoLivro = codigo;
		numeroPaginas = paginas;
		disponivelParaEmprestimo = true;
		autoresLivro = new String [] {"", "", ""};
		for(int i = 0; i < autoresLivro.length && i < autores.length; i++) {
			if(autores[i] != null)
				autoresLivro[i] = autores[i];
		}
	}

	public boolean getDisponivelParaEmprestimo() {
		return disponivelParaEmprestimo;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public String getEditoraLivro() {
		return editoraLivro;
	}

	public String getCodigoLivro() {
		return codigoLivro;
	}

	public String [] getAutoresLivro() {
		return autoresLivro;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setDisponivelParaEmprestimo(boolean disponibilidade) {
		disponivelParaEmprestimo = disponibilidade;
	}

	public void imprimeInformacoesLivro() {
		System.out.println("Livro: " + nomeLivro);
		System.out.println("Editora: " + editoraLivro);
		System.out.println("Codigo: " + codigoLivro);

		// gera a lista de autores
		String listaAutores = "";
		for (int i = 0; i < autoresLivro.length; i++) {
			if (autoresLivro[i] != null && !autoresLivro[i].equals("")) {
				listaAutores += autoresLivro[i] + "; ";
			}
		}
		listaAutores = listaAutores.substring(0, listaAutores.length() - 2);
		System.out.println("Autor(es): " + listaAutores);


		System.out.println("Paginas: " + numeroPaginas);
		System.out.print("Disponivel: ");

		if (disponivelParaEmprestimo) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Nao");
		}

		System.out.println();
	}
}
