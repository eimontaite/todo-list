package academy.learnprogramming.service;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;

public interface ToDoItemService {
	void addItem(ToDoItem itemToCreate);

	void removeItem(int id);

	ToDoItem getItem();

	void updateItem(ToDoItem itemToUpdate);

	ToDoData getData();
}
