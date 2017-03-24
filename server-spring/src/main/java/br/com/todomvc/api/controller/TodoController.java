package br.com.todomvc.api.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Delete;
import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.composed.web.Put;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.todomvc.api.model.Todo;
import br.com.todomvc.api.service.TodoService;


@RestController
@RequestMapping(value = "/todo")
public class TodoController {

	@Autowired
    TodoService todoservice;
	
    @Get
    public ResponseEntity<Iterable<Todo>> getAll(){
    	return todoservice.getAll();
    }
    
    @Get("{id}")
    public ResponseEntity<Todo> getById(@RequestParam(value = "id") Long id) {
    	return todoservice.getById(id);
    }
    
    @Transactional
    @Delete("{id}")
    public void delete(@PathVariable Long id){
    	todoservice.delete(id); 
    }
    
	
    @Transactional
    @Delete
    public void deleteCompleted(){
    	todoservice.deleteByCompleted(true); 
    }
    
    @Transactional
    @Post
    public ResponseEntity<Todo> create(@RequestBody Todo todo){
    	return todoservice.save(todo);
    }
    
    @Transactional
    @Put("{id}")
    public ResponseEntity<Todo> update(@PathVariable long id, @RequestBody Todo todo){
    	return todoservice.update(id, todo);
    }
    
    
}
