package groceryapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity     //by using entity we are the objects of the class will be stored in a database
public class ShoppingList  //ShoppingList will be the table name
{
	
	@Id //primary key
	private int ShoppingListId;   //column name
	
	private String title;  //column name
	
	//creating a default constructor
	public ShoppingList() {
		
	}
	
	//creating constructor for title
	public ShoppingList(String title) {
		
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getShoppingListId() {
		return ShoppingListId;
	}

	public void setShoppingListId(int shoppingListId) {
		ShoppingListId = shoppingListId;
	}
	
	//creating constructor for ShoppingListId
	public ShoppingList(int ShoppingListId, String title)
	{
		this.ShoppingListId = ShoppingListId;
		this.title = title;
	}
	
	
	
}
