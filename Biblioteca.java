public class Biblioteca {
	private Livro [] livros;
	private Usuario [] usuarios;

	public Biblioteca() {
		livros = new Livro[50];
		usuarios = new Usuario[30];
	}

	public boolean cadastrarLivro(String nome, String editora, String codigo, String [] autores, int paginas) {
		if (!livroEstaCadastrado(codigo)) {
			for (int i = 0; i < livros.length; i++) {
				if (livros[i] == null) {
					livros[i] = new Livro(nome, editora, codigo, autores, paginas);
					System.out.println("Livro \"" + nome + "\" cadastrado com sucesso!");
					ordenaListaLivros(livros);
					return true;
				}
			}
		}
		System.out.println("ERRO: O livro " + nome + " nao pode ser cadastrado!");
		return false;
	}

	public boolean emprestarLivro(String codigoLivro, String cpfUsuario) {
		if (usuarioEstaCadastrado(cpfUsuario) && livroEstaCadastrado(codigoLivro)) {
			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i] != null && usuarios[i].getCpf().equals(cpfUsuario)) {
					for (int j = 0; j < livros.length; j++) {
						if (livros[j] != null && livros[j].getCodigoLivro().equals(codigoLivro)) {
							if (usuarios[i].getAtivo() && livros[j].getDisponivelParaEmprestimo()) {
								if (usuarios[i].emprestaLivro(livros[j])) {
									System.out.println("Livro \"" + livros[j].getNomeLivro() + "\" emprestado para o usuario " + usuarios[i].getNome());
									return true;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("ERRO: O livro " + codigoLivro + " nao pode ser emprestado ao usuario " + cpfUsuario);
		return false;
	}

	public boolean devolverLivro(String codigoLivro, String cpfUsuario) {
		if (usuarioEstaCadastrado(cpfUsuario) && livroEstaCadastrado(codigoLivro)) {
			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i] != null && usuarios[i].getCpf().equals(cpfUsuario)) {
					for (int j = 0; j < livros.length; j++) {
						if (livros[j] != null && livros[j].getCodigoLivro().equals(codigoLivro)) {
							if (usuarios[i].devolveLivro(livros[j])) {
								if (!usuarios[i].getAtivo()) {
									ativarUsuario(cpfUsuario);
								}
								System.out.println("Livro " + codigoLivro + " devolvido pelo usuario " + cpfUsuario);
								return true;
							}
						}
					}
				}
			}
		}
		System.out.println("ERRO: O livro " + codigoLivro + " nao pode ser devolvido pelo usuario " + cpfUsuario);
		return false;
	}

	public boolean livroEstaCadastrado(String codigo) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getCodigoLivro().equals(codigo)) {
				return true;
			}
		}
		return false;
	}

	public void imprimeInformacoesLivros() {
		System.out.println("LISTA DE LIVROS CADASTRADOS");
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null) {
				livros[i].imprimeInformacoesLivro();
			}
		}
	}

	public boolean cadastrarUsuario(String nome, String cpf, String endereco, String telefone) {
		if (!usuarioEstaCadastrado(cpf)) {
			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i] == null) {
					usuarios[i] = new Usuario(nome, cpf, endereco, telefone);
					ordenaListaUsuarios();
					System.out.println("Usuario " + nome + " cadastrado com sucesso!");
					return true;
				}
			}
		}
		System.out.println("ERRO: O usuario " + nome + " nao pode ser cadastrado!");
		return false;
	}

	public void ativarUsuario(String cpf) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null && usuarios[i].getCpf().equals(cpf)) {
				usuarios[i].setAtivo(true);
				System.out.println("Ativando usuario " + usuarios[i].getNome());
			}
		}
	}

	public void desativarUsuario(String cpf) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null && usuarios[i].getCpf().equals(cpf)) {
				usuarios[i].setAtivo(false);
				System.out.println("Desativando usuario " + usuarios[i].getNome());
			}
		}
	}

	public boolean usuarioEstaCadastrado(String cpf) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null && usuarios[i].getCpf().equals(cpf)) {
				return true;
			}
		}

		return false;
	}

	public void imprimeInformacoesUsuarios() {
		System.out.println("LISTA DE USUARIOS CADASTRADOS");
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				usuarios[i].imprimeInformacoesUsuario();
			}
		}
	}

	private void ordenaListaUsuarios () {
		for (int i = 0; i < usuarios.length - 1; i++) {
			if (usuarios[i] != null) {
				int indice = i;
				for (int j = i + 1; j < usuarios.length; j++) {
					if (usuarios[j] != null) {
						if (usuarios[indice].getNome().compareTo(usuarios[j].getNome()) > 0) {
							indice = j;
						}
					}
				}

				if (indice != i) {
					Usuario temp = usuarios[i];
					usuarios[i] = usuarios[indice];
					usuarios[indice] = temp;
				}
			}
		}
	}

	public static void ordenaListaLivros(Livro [] listaLivros) {
		for (int i = 0; i < listaLivros.length - 1; i++) {
			if (listaLivros[i] != null) {
				int indice = i;
				for (int j = i + 1; j < listaLivros.length; j++) {
					if (listaLivros[j] != null) {
						if (listaLivros[indice].getNomeLivro().compareTo(listaLivros[j].getNomeLivro()) > 0) {
							indice = j;
						}
					}
				}

				if (indice != i) {
					Livro temp = listaLivros[i];
					listaLivros[i] = listaLivros[indice];
					listaLivros[indice] = temp;
				}
			}
		}
	}
}
