public class Usuario {
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private boolean ativo;
	private Livro [] livrosEmprestados;

	public Usuario(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.ativo = true;
		this.livrosEmprestados = new Livro [3];
	}

	public String getNome() {
		return nome;
	}

	public String getCpf(){
		return cpf;
	}

	public String getEndereco() {
	 	return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean estaAtivo) {
		ativo = estaAtivo;
	}

	public void imprimeInformacoesUsuario() {
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.print("Situacao: ");
		if(ativo){
			System.out.println("Ativo");
		}
		else{
			System.out.println("Inativo");
		}

		listaLivrosEmprestados();
	}

	public boolean emprestaLivro(Livro livro) {
		for (int i = 0; i < livrosEmprestados.length; i++) {
			if (livrosEmprestados[i] == null) {
				livrosEmprestados[i] = livro;
				livro.setDisponivelParaEmprestimo(false);
				Biblioteca.ordenaListaLivros(livrosEmprestados);
				return true;
			}
		}

		return false;
	}

	public boolean devolveLivro(Livro livro) {
		for(int i = 0; i < livrosEmprestados.length; i++) {
			if(livrosEmprestados[i] != null && livrosEmprestados[i].getCodigoLivro().equals(livro.getCodigoLivro())) {
				livrosEmprestados[i] = null;
				livro.setDisponivelParaEmprestimo(true);
				return true;
			}
		}

		return false;
	}

	public void listaLivrosEmprestados() {
		boolean nenhumLivroEmprestado = true;
		System.out.println("\nLista de livros emprestados: ");

		for(int i = 0; i < livrosEmprestados.length; i++) {
			if(livrosEmprestados[i] != null){
				livrosEmprestados[i].imprimeInformacoesLivro();
				nenhumLivroEmprestado = false;
			}
		}

		if (nenhumLivroEmprestado) {
			System.out.println("Nenhum livro emprestado.\n");
		}
	}
}
