package academy.learnprogramming.service;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {
	// == fields ==
	@Getter
	private final ToDoData toDoData = new ToDoData();

	// == public methods ==
	@Override
	public void addItem(ToDoItem itemToCreate) {
		toDoData.addItem(itemToCreate);
	}

	@Override
	public void removeItem(int id) {
		toDoData.removeItem(id);
	}

	@Override
	public ToDoItem getItem(int id) {
		return toDoData.getItem(id) ;
	}

	@Override
	public void updateItem(ToDoItem itemToUpdate) {
		toDoData.updateItem(itemToUpdate);
	}
}
