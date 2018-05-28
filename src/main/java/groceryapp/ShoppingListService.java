package groceryapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

 

@Service //saying that this is service, this service tag is a spl kind of service which will allow us to import where ever we want to use it.
public class ShoppingListService {

	//creating an object for shoppi nglist repository
	@Autowired
	private ShoppingListRepository repository;
	
	
	private List<ShoppingList> shoppingList;
	
	//default constructor with no arguments
	public ShoppingListService() {
		this.shoppingList = new ArrayList<ShoppingList>();
		
		this.shoppingList.add(new ShoppingList(1,"Hyvee"));
		this.shoppingList.add(new ShoppingList(2,"Krogers"));
		this.shoppingList.add(new ShoppingList(3,"Casey's"));
	}
	

		public List<ShoppingList> getAllShoppingList() {
			List<ShoppingList> shoppingLists = new ArrayList<>();
			//for returning the shopping list from the database
			this.repository.findAll()
			.forEach(x -> shoppingLists.add(x)); //we can also write this as " .forEach(shoppingLists::add); "
			return shoppingLists;
		}
		
		//creating a method that is responsible for returning a particular shopping list based on id we pass on 
		public ShoppingList getShoppingListById(int ShoppingListId) {
			
			return this.repository.findById(ShoppingListId);
			
			//return this.shoppingList.stream().filter(x -> x.getShoppingListId() ==  ShoppingListId).findFirst().get();  //"x" is the collection of shopping list
		}
		
		
		//creating method that can add into the shopping list
		public void addShoppingList(ShoppingList shoppinglist) {
			this.repository.saveAll(shoppingList);
			//this.shoppingList.add(shoppinglist);
		}
		
		
		//creating method for delete it actually depends on the id of the shopping list we want to delete
		public void deleteShoppingList(int ShoppingListId) {
			ShoppingList shoppingList = getShoppingListById(ShoppingListId);
			this.shoppingList.remove(shoppingList);
		}
		
		//creating an method for updating in the shopping list
		public void updateShoppingList(ShoppingList shoppingList) {
			ShoppingList persistedShoppingList = 
		}

	
} 
