package com.github.jhugosc.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.jhugosc.todolist.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
