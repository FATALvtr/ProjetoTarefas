
package controller;

import model.TarefaModel;
import java.util.ArrayList;

public class TarefaController {
    //Lista de Tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    //Método Adicionar
    public void adicionar(String nome){
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
    }
    
    //Método listar
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    
    
}
