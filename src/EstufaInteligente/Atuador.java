package EstufaInteligente;

public class Atuador {

    private String nome;
    private boolean funcionando;

    public Atuador(String nome, boolean funcionando) {
        this.nome = nome;
        this.funcionando = funcionando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }

    public void ligar() throws FalhaNoAtuador {
        if (!funcionando) {
            throw new FalhaNoAtuador("Falha no atuador");
        }
        System.out.println(nome + " ligado com sucesso");
    }
}