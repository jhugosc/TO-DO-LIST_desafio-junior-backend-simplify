package com.github.jhugosc.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.jhugosc.todolist.model.Tarefa;
import com.github.jhugosc.todolist.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaContoller {
    
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> getAllTarefas() {
        return tarefaService.getAllTarefas();
    }
    
    @PostMapping
    public Tarefa addTarefa (@RequestBody Tarefa tarefa) {
        return tarefaService.addTarefa(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa updateTarefa (@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return tarefaService.updateTarefa(id, tarefa);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTarefa (@PathVariable Long id) {
        tarefaService.deleteTarefa(id);
    }
}