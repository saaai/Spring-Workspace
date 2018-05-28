package groceryapp.models;

public class ShoppingList {

	private int ShoppingListId;
	private String title;
	
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
