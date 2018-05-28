package groceryapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import groceryapp.models.ShoppingList;

@Service //saying that this is service, this service tag is a spl kind of service which will allow us to import where ever we want to use it.
public class ShoppingListService {

	
	private List<ShoppingList> shoppingList;
	
	//default constructor with no arguments
	public ShoppingListService() {
		this.shoppingList = new ArrayList<ShoppingList>();
		
		this.shoppingList.add(new ShoppingList(1,"Hyvee"));
		this.shoppingList.add(new ShoppingList(2,"Krogers"));
		this.shoppingList.add(new ShoppingList(3,"Casey's"));
		
	}
	
	/*
	 * //creating collection of shopping lists 
		private List<ShoppingList> shoppingList = Arrays.asList(
				new ShoppingList(1,"Hyvee"),
				new ShoppingList(2,"Krogers"),
				new ShoppingList(3,"Casey's")
				);
			*/
		
		public List<ShoppingList> getAllShoppingList() {
			
			return this.shoppingList;
				
		}
		
		//creating a method that is responsible for returning a particular shopping list based on id we pass on 
		public ShoppingList getShoppingListById(int ShoppingListId)
		{
			return this.shoppingList.stream().filter(x -> x.getShoppingListId() ==  ShoppingListId).findFirst().get();  //"x" is the collection of shopping list
			
		}
		
		
		//creating method that can add into the shopping list
		public void addShoppingList(ShoppingList shoppinglist) {
			
			this.shoppingList.add(shoppinglist);
		}
		
		
		//creating method for delete it actually depends on the id of the shopping list we want to delete
		public void deleteShoppingList(int ShoppingListId)
		{
			
			ShoppingList shoppingList = getShoppingListById(ShoppingListId);
			this.shoppingList.remove(shoppingList);
			
		}
	
}
