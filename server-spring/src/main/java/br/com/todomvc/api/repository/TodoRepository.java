package br.com.todomvc.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.todomvc.api.model.Todo;

@RepositoryRestResource(path = "todo", collectionResourceRel = "todo")
public interface TodoRepository extends CrudRepository<Todo, Long>{
	void deleteByCompleted(boolean completed);	
}
