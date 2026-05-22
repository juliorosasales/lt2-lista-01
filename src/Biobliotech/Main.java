package Biobliotech;

public class Main {

    public static void main(String[] args) {

        Biblioteca bib = new Biblioteca();

        Livro l1 = new Livro(1, "Fundamentos da lista de LT", "anonimo");
        Livro l2 = new Livro(2, "One piece", "Eiichiro Oda");
        Livro l3 = new Livro(3, "hxh", "esqueci");

        try {
            bib.adicionarLivro(l1);
            bib.adicionarLivro(l2);
            bib.adicionarLivro(l3);
            System.out.println("Livros adicionados");
        } catch (LimiteAcervo e) {
            System.out.println("Erro ao adicionar: " + e.getMessage());
        }

        System.out.println();

        try {
            bib.realizarEmprestimo(1);
        } catch (LivroNaoEncontrado | EmprestimoInvalido e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Atendimento finalizado");
        }

        System.out.println();

        try {
            bib.realizarEmprestimo(1);
        } catch (LivroNaoEncontrado e) {
            System.out.println(e.getMessage());
        } catch (EmprestimoInvalido e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Atendimento finalizado");
        }

        System.out.println();

        try {
            bib.devolverLivro(1);
            bib.realizarEmprestimo(1);
        } catch (LivroNaoEncontrado e) {
            System.out.println(e.getMessage());
        } catch (EmprestimoInvalido e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            bib.realizarEmprestimo(99);
        } catch (LivroNaoEncontrado e) {
            System.out.println(e.getMessage());
        } catch (EmprestimoInvalido e) {
            System.out.println(e.getMessage());
        }
    }
}