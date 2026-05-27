
package controller;

import model.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {
    //Lista de Tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    //Método Adicionar
    public void adicionar(String nome){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Tarefa com este titulo ja existente!");
        }
                TarefaModel tarefa = new TarefaModel(nome);
                lista.add(tarefa);//acidiona se caso não existir
    }
    }
    
    //Método listar
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    public void remover(String tarefaCbx){
        //encontra o nome correspondente na lista
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(tarefaCbx)) {
                lista.remove(i);//remover a tarefa pelo indice/posição
                break;
            }
        }
        
    }
    
}
