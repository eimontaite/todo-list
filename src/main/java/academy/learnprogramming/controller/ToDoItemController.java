package academy.learnprogramming.controller;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.service.ToDoItemService;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

	// == fields ==
	public final ToDoItemService toDoItemService;

	@Autowired
	public ToDoItemController(ToDoItemService toDoItemService) {
		this.toDoItemService = toDoItemService;
	}

	// == model attributes ==
	@ModelAttribute
	public ToDoData toDoData() {
		return toDoItemService.getToDoData();
	}

	// == handler methods ==
	@GetMapping(Mappings.ITEMS)
	public String items() {
		return ViewNames.ITEMS;
	}
}
