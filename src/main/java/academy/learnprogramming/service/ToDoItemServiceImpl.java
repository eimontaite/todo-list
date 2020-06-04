package academy.learnprogramming.service;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {
	// == fields ==
	private final ToDoData toDoData = new ToDoData();
	
	// == public methods ==
	@Override
	public void addItem(ToDoItem itemToCreate) {

	}

	@Override
	public void removeItem(int id) {

	}

	@Override
	public ToDoItem getItem() {
		return null;
	}

	@Override
	public void updateItem(ToDoItem itemToUpdate) {

	}

	@Override
	public ToDoData getData() {
		return null;
	}
}
