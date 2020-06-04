package academy.learnprogramming.service;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;

import java.util.List;

public interface ToDoItemService {

	void addItem(ToDoItem itemToCreate);

	void removeItem(int id);

	ToDoItem getItem(int id);

	void updateItem(ToDoItem itemToUpdate);

	ToDoData getToDoData();
}
