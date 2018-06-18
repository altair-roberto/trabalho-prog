public class BibliotecaTeste {
	public static void main(String [] args) {
		Biblioteca biblioteca = new Biblioteca();

		System.out.println("-- Executando operacoes --");
		// cadastra livros
		biblioteca.cadastrarLivro("Introduction to Algorithms", "The Mit Press", "0262033844", new String [] {"Cormen, Thomas H.", "Leiserson, Charles E.", "Rivest, Ronald L.", "Stein, Clifford"}, 1312);
		biblioteca.cadastrarLivro("C++ Programming Language, The", "Addison-Wesley Professional", "0321563840", new String [] {"Stroustrup, Bjarne"}, 1368);
		biblioteca.cadastrarLivro("C Programming Language, The", "Prentice Hall", "0131103628", new String [] {"Kernighan, Brian", "Ritchie, Dennis"}, 272);
		biblioteca.cadastrarLivro("Programming Pearls", "Addison-Wesley Professional", "0201657880", new String [] {"Bentley, Jon"}, 256);
		biblioteca.cadastrarLivro("Design Patterns - Elements of Reusable Software", "Addison-Wesley Professional", "0201633612", new String [] {"Gamma, Erich", "Helm, Richard", "Johnson, Ralph", "Vlissides, John"}, 395);
		biblioteca.cadastrarLivro("Art of Computer Programming Vol. 1, The", "Addison-Wesley Professional", "9780201896", new String [] {"Knuth, Donald E."}, 672);
		biblioteca.cadastrarLivro("Concrete Mathematics: A Foundation for Computer Science", "Addison-Wesley Professional", "0201558025", new String [] {"Graham, Ronald L.", "Knuth, Donald E.", "Patashnik, Oren"}, 672);
		biblioteca.cadastrarLivro("Code Complete: A Practical Handbook of Software Construction", "Microsoft Press", "0735619670", new String [] {"McConnell, Steve"}, 960);
		biblioteca.cadastrarLivro("Clean Code: A Handbook of Agile Software Craftsmanship", "Prentice Hall", "4566190951", new String [] {"Martin, Robert C."}, 464);
		biblioteca.cadastrarLivro("Data Structures and Algorithms in Java", "Sams Publishing", "0672324539", new String [] {"Lafore, Robert"}, 800);
		biblioteca.cadastrarLivro("Code: The Hidden Language of Computer Hardware and Software", "Microsoft Press", "0735611319", new String [] {"Petzold, Charles"}, 400);
		biblioteca.cadastrarLivro("Linux Programming Interface: A Linux and UNIX System Programming Handbook, The", "No Starch Press", "1593272200", new String [] {"Kerrisk, Michael"}, 1552);
		biblioteca.cadastrarLivro("Book of Proof", "Richard Hammack", "0989472108", new String [] {"Hammack, Richard"}, 314);
		biblioteca.cadastrarLivro("Programming Language Pragmatics", "Morgan Kaufmann", "0124104096", new String [] {"Scott, Michael L."}, 992);
		biblioteca.cadastrarLivro("Types and Programming Languages", "MIT Press", "0262162091", new String [] {"Pierce, Benjamin C."}, 645);
		biblioteca.cadastrarLivro("The Pragmatic Programmer: From Journeyman to Master", "Addison-Wesley Professional", "020161622X", new String [] {"Hunt, Andrew"}, 352);
		biblioteca.cadastrarLivro("Learning Python", "O'Reilly Media", "1449355730", new String [] {"Lutz, Mark"}, 1648);
		biblioteca.cadastrarLivro("Computer Networks", "Prentice Hall", "9332518742", new String [] {"Tanenbaum, Andrew S."}, 960);
		biblioteca.cadastrarLivro("Engineering a Compiler", "Morgan Kaufmann", "012088478X", new String [] {"Cooper, Keith D.", "Torczon, Linda"}, 824);
		biblioteca.cadastrarLivro("Mythical Man-Month: Essays on Software Engineering, The", "Addison-Wesley Professional", "0201835959", new String [] {"Brooks Jr., Frederick P."}, 336);
		biblioteca.cadastrarLivro("Introduction to the Theory of Computation", "Cengage India", "8131525295", new String [] {"Sipser, Michael"}, 504);
		biblioteca.cadastrarLivro("Structure and Interpretation of Computer Programs", "The MIT Press", "0262510871", new String [] {"Abelson, Harold", "Sussman, Gerald Jay", "Sussman, Julie"}, 688);
		biblioteca.cadastrarLivro("Thinking in Java", "Prentice Hall", "0131872486", new String [] {"Eckel, Bruce"}, 1150);
		biblioteca.cadastrarLivro("sed & awk", "O'Reilly Media", "1565922255", new String [] {"Dougherty, Dale", "Robbins, Arnold"}, 434);
		biblioteca.cadastrarLivro("Emacs Lisp - An Introduction", "Samurai Media Limited", "9888381490", new String [] {"Chassell, Robert J."}, 270);
		biblioteca.cadastrarLivro("Absolute OpenBSD: Unix for the Practical Paranoid", "No Starch Press", "1593274769", new String [] {"Lucas, Michael W."}, 536);
		biblioteca.cadastrarLivro("Unix Programming Environment, The", "Prentice-Hall Software Series", "013937681X", new String [] {"Kernighan, Brian W.", "Pike, Rob"}, 357);
		biblioteca.cadastrarLivro("Learning the bash Shell: Unix Shell Programming", "O'Reilly Media", "0596009658", new String [] {"Newham, Cameron"}, 354);
		biblioteca.cadastrarLivro("Compilers: Principles, Techniques, and Tools", "Addison Wesley", "0321486811", new String [] {"Aho, Alfred V.", "Lam, Monica S.", "Sethi, Ravi", "Ullman, Jeffrey D."}, 1000);
		biblioteca.cadastrarLivro("Operating System Concepts", "Wiley", "1118063333", new String [] {"Silberschatz, Abraham", "Galvin, Peter B.", "Gagne, Greg"}, 976);

		// tenta cadastrar um livro repetido
		biblioteca.cadastrarLivro("Introduction to Algorithms", "The Mit Press", "0262033844", new String [] {"Cormen, Thomas H.", "Leiserson, Charles E.", "Rivest, Ronald L.", "Stein, Clifford"}, 1312);

		// cadastra usuarios
		biblioteca.cadastrarUsuario("Camila Cunha Martins", "658.342.009-23", "Rua Sao Bento, 1956", "(31) 4532-6677");
		biblioteca.cadastrarUsuario("Gabriela Santos Souza", "675.341.678-67", "Quadra SHS, 197", "(61) 8639-2928");
		biblioteca.cadastrarUsuario("Renan Lima Cardoso", "012.410.409-60", "Rua Sao Carlos, 579", "(92) 3230-5734");
		biblioteca.cadastrarUsuario("Thais Melo Rodrigues", "329.380.561-12", "Rua Major Alvaro Fortes, 352", "(11) 27756004");
		biblioteca.cadastrarUsuario("Mariana Rodrigues Cavalcanti", "366.512.654-99", "Rua das Missoes, 1195", "(51) 3350-2311");
		biblioteca.cadastrarUsuario("Arthur Ferreira Cunha", "563.111.861-72", "Praca da Redencao, 1225", "(12) 3337-5001");
		biblioteca.cadastrarUsuario("Otavio Martinz Azevedo", "101.455.398-94", "Via de Servidao Tres, 1351", "(45) 9987-1221");
		biblioteca.cadastrarUsuario("Julia Pereira Cardoso", "111.237.592-57", "Beco Felizardo Furtado, 127", "(51) 2230-3684");
		biblioteca.cadastrarUsuario("Julia Gomes Pereira", "354.430.306-04", "Rua Marques de Barbacena, 995", "(21) 8629-2964");
		biblioteca.cadastrarUsuario("Diogo Ribeiro Carvalho", "399.564.121-44", "Rua de Vega, 182", "(31) 9306-3080");

		// tenta cadastrar um usuario repetido
		biblioteca.cadastrarUsuario("Diogo Ribeiro Carvalho", "399.564.121-44", "Rua de Vega, 182", "(31) 9306-3080");

		// desativa um usuario
		biblioteca.desativarUsuario("399.564.121-44");

		// reativa um usuario
		biblioteca.ativarUsuario("399.564.121-44");

		// empresta livros para usuarios biblioteca.emprestarLivro("", "");
		biblioteca.emprestarLivro("0262033844", "399.564.121-44");
		biblioteca.emprestarLivro("0321563840", "399.564.121-44");
		biblioteca.emprestarLivro("1118063333", "399.564.121-44");
		biblioteca.emprestarLivro("0201657880", "658.342.009-23");
		biblioteca.emprestarLivro("0201633612", "675.341.678-67");
		biblioteca.emprestarLivro("9780201896", "012.410.409-60");
		biblioteca.emprestarLivro("0201558025", "012.410.409-60");
		biblioteca.emprestarLivro("0735619670", "101.455.398-94");
		biblioteca.emprestarLivro("4566190951", "366.512.654-99");
		biblioteca.emprestarLivro("0672324539", "101.455.398-94");
		biblioteca.emprestarLivro("0735611319", "329.380.561-12");
		biblioteca.emprestarLivro("1593272200", "658.342.009-23");
		biblioteca.emprestarLivro("0989472108", "329.380.561-12");
		biblioteca.emprestarLivro("0124104096", "675.341.678-67");
		biblioteca.emprestarLivro("0262162091", "354.430.306-04");
		biblioteca.emprestarLivro("1565922255", "329.380.561-12");

		// tenta emprestar um livro que ja foi emprestado
		biblioteca.emprestarLivro("0262162091", "101.455.398-94");

		// tenta emprestar mais livros do que o permitido
		biblioteca.emprestarLivro("0124104096", "399.564.121-44");

		// tenta emprestar livro existente para usuario inexistente
		biblioteca.emprestarLivro("0735619670", "000.000.000-00");

		// tenta emprestar livro inexistente para usuario valido
		biblioteca.emprestarLivro("0000000000", "343.671.499-37");

		// tenta devolver livro emprestado
		biblioteca.devolverLivro("1565922255", "329.380.561-12");

		// tenta devolver livro nao cadastrado
		biblioteca.devolverLivro("0000000000", "343.671.499-37");

		// tenta devolver livro de usuario nao cadastrado
		biblioteca.devolverLivro("0735619670", "000.000.000-00");

		// tenta devolver livro que o usuario nao emprestou
		biblioteca.devolverLivro("0201657880", "399.564.121-44");


		System.out.println("\n -- Exibindo Resultado Final --");
		biblioteca.imprimeInformacoesLivros();
		biblioteca.imprimeInformacoesUsuarios();
	}
}
