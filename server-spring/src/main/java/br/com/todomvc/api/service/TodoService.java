package br.com.todomvc.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.todomvc.api.model.Todo;
import br.com.todomvc.api.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	

    public ResponseEntity<Iterable<Todo>> getAll() {
        Iterable<Todo> result = todoRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
	public ResponseEntity<Todo> getById(long id) {
		Todo result = todoRepository.findOne(id); 
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	public ResponseEntity<Todo> save(Todo todo) {
		Todo result = todoRepository.save(todo);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	public ResponseEntity<Todo> update(long id, Todo todo) {
		ResponseEntity<Todo> result = getById(id);
        if (todo.getTitle() != null)
        	result.getBody().setTitle(todo.getTitle());
        if (todo.isCompleted() != null) {
        	result.getBody().setCompleted(todo.isCompleted());
        }
		return new ResponseEntity<>(result.getBody(), HttpStatus.OK);
	}
	
	public void delete(long id){
    	if (!todoRepository.exists(id))
            throw new ResourceNotFoundException();
        todoRepository.delete(id);
	}

	public void deleteByCompleted(boolean b) {
		todoRepository.deleteByCompleted(true);
	}

}
