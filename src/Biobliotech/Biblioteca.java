package Biobliotech;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> acervo;
    private int limite = 100;

    public Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) throws LimiteAcervo {
        if (acervo.size() >= limite) {
            throw new LimiteAcervo("Limite do acervo atingido");
        }
        acervo.add(livro);
    }

    public Livro buscarPorId(int id) throws LivroNaoEncontrado {

        Livro encontrado = null;

        for (int i = 0; i < acervo.size(); i++) {
            if (acervo.get(i).getId() == id) {
                encontrado = acervo.get(i);
            }
        }

        if (encontrado == null) {
            throw new LivroNaoEncontrado("Livro nao encontrado");
        }

        return encontrado;
    }

    public void realizarEmprestimo(int id) throws LivroNaoEncontrado, EmprestimoInvalido {

        Livro livro = buscarPorId(id);

        if (livro.isEstaEmprestado() == true) {
            throw new EmprestimoInvalido("Livro ja esta emprestado");
        }

        livro.setEstaEmprestado(true);
        System.out.println("Emprestimo realizado: " + livro.getTitulo());
    }

    public void devolverLivro(int id) throws LivroNaoEncontrado {
        Livro livro = buscarPorId(id);
        livro.setEstaEmprestado(false);
        System.out.println("Devolucao registrada: " + livro.getTitulo());
    }
}