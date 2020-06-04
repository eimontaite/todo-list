package academy.learnprogramming.controller;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;
import academy.learnprogramming.service.ToDoItemService;
import academy.learnprogramming.util.AttributeNames;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Slf4j
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

	@GetMapping(Mappings.ADD_ITEM)
	public String addEditItem(Model model) {
		ToDoItem toDoItem = new ToDoItem("", "", LocalDate.now());
		model.addAttribute(AttributeNames.TO_DO_ITEM, toDoItem);
		return ViewNames.ADD_ITEM;
	}

	@PostMapping(Mappings.ADD_ITEM)
	public String processItem(@ModelAttribute(AttributeNames.TO_DO_ITEM) ToDoItem toDoItem) {
		toDoItemService.addItem(toDoItem);
		log.info("toDoItem from form = {}", toDoItem);
		return "redirect:/" + ViewNames.ITEMS;
	}
}
