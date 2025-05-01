package com.github.jhugosc.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.jhugosc.todolist.model.Tarefa;
import com.github.jhugosc.todolist.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getAllTarefas(){
        return tarefaRepository.findAll();
    }

    public Tarefa addTarefa (Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public Tarefa updateTarefa (Long id, Tarefa tarefa) {
        Optional<Tarefa> tarefaExistente = tarefaRepository.findById(id);
        if (tarefaExistente.isPresent()) {
            tarefa.setId(id);
            return tarefaRepository.save(tarefa);
        }
        return null;
    }

    public void deleteTarefa (Long id) {
        tarefaRepository.deleteById(id);
    }
}
