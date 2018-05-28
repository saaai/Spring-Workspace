package groceryapp;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController // to let this class be defined as a rest controller
public class ShoppingListController {


	@Autowired
	private ShoppingListService service;


	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/SingleShoppingLists")
	public ShoppingList getSingleShoppingLists() {

		ShoppingList shoppingList = new ShoppingList();
		shoppingList.setTitle("Walmart"); //just displaying a single object
		return shoppingList;
	}


	//Creating a post action
	@RequestMapping(method=RequestMethod.POST, value="/PostShoppingList")
	public ShoppingList PostShoppingList(@RequestBody ShoppingList shoppingList) {
		return shoppingList;
	}


	//creating the method so that we can pass in the title of the shopping lists
	@RequestMapping("/ShoppingList/{title}")
	public ShoppingList getShoppingList(@PathVariable String title) {
		return new ShoppingList(title);
	}


	@RequestMapping("/ArrayofShoppingLists")
	public List<ShoppingList> getShoppingList() {
		return this.service.getAllShoppingList();
	}


	//creating the method so that we can pass in the ShoppingListId of the shopping lists we want to pass in 
	@RequestMapping("/ShoppingListId/{ShoppingListId}")
	public ShoppingList getShoppingListId(@PathVariable int ShoppingListId) {
		return this.service.getShoppingListById(ShoppingListId);

	}


	//creating method for adding into shopping list using postman
	@RequestMapping(method=RequestMethod.POST, value="/AddIntoShoppingList")
	public void addShoppingList(@RequestBody ShoppingList shoppingList) {

		this.service.addShoppingList(shoppingList);
	}


	//creating controller method to delete shopping list
	@RequestMapping(method = RequestMethod.DELETE, value = "/DeleteShoppingList")
	public void deleteShoppingList(@RequestBody ShoppingList  ShoppingList) {

		this.service.deleteShoppingList(ShoppingList.getShoppingListId());

	}


	//creating a method for updating shoppinng list
	@RequestMapping(method= RequestMethod.PUT, value = "/shoppinglist")
	public void updateShoppingList(@RequestBody ShoppingList shoppingList)
	{
			this.service.updateShoppingList(shoppingList);
	}


}
