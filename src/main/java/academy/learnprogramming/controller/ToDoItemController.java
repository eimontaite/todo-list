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
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.View;
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
	public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model) {
		log.info("editing id = {}", id);
		ToDoItem toDoItem = toDoItemService.getItem(id);
		if(toDoItem == null) {
			toDoItem = new ToDoItem("", "", LocalDate.now());
		}
		model.addAttribute(AttributeNames.TO_DO_ITEM, toDoItem);
		return ViewNames.ADD_ITEM;
	}

	@PostMapping(Mappings.ADD_ITEM)
	public String processItem(@ModelAttribute(AttributeNames.TO_DO_ITEM) ToDoItem toDoItem) {
		if(toDoItem.getId() == 0) {
			toDoItemService.addItem(toDoItem);
		} else {
			toDoItemService.updateItem(toDoItem);
		}
		log.info("toDoItem from form = {}", toDoItem);
		return "redirect:/" + ViewNames.ITEMS;
	}

	@GetMapping(Mappings.DELETE_ITEM)
	public String deleteItem(@RequestParam int id) {
		toDoItemService.removeItem(id);
		return "redirect:/" + ViewNames.ITEMS;
	}

	@GetMapping(Mappings.VIEW_ITEM)
	public String viewItem(@RequestParam int id, Model model) {
		ToDoItem item = toDoItemService.getItem(id);
		model.addAttribute(AttributeNames.TO_DO_ITEM, item);
		log.info("item", item, "model", model);
		return ViewNames.VIEW_ITEM;
	}
}
