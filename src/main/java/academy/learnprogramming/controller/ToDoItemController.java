package academy.learnprogramming.controller;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

	// == model attributes ==
	@ModelAttribute
	public ToDoData toDoData() {
		return new ToDoData();
	}

	// == handler methods ==
	@GetMapping(Mappings.ITEMS)
	public String items() {
		return ViewNames.ITEMS;
	}
}
