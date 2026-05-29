
package controller;

import model.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {
    //Lista de Tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    //Método Adicionar
    public void adicionar(String nome){
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);//acidiona se caso não existir
    }
    
    //Método listar
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    public void remover(String nome){
        boolean encontrou = false;
        //encontra o nome correspondente na lista
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                lista.remove(i);//remover a tarefa pelo indice/posição
                encontrou = true;
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao remover a terefa!");
            }
        }
        
    }
    public void cloncluida(String nome){
        boolean achou = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                TarefaModel tarefa = lista.get(i);
                tarefa.setConcluida(true);
                achou = true;
                break;
        }
    }
        if (!achou) {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada para ser concluida!");
        }
    
}
}
