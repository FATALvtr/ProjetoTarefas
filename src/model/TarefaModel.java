
package model;


public class TarefaModel {
    
    //Atributos
    private String nome;
    private boolean concluida;
    
    //Construtor
    public TarefaModel(String nome) {
        this.nome = nome;
        this.concluida = concluida = false;
    }
    
    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", concluida: " + concluida + "\n";
    }
    
    
    
}
