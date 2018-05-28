package groceryapp;

import org.springframework.data.repository.CrudRepository;

public interface ShoppingListRepository extends CrudRepository<ShoppingList, Integer> {

	
	
	
}








/* Methods to implement here:
 * -	getAllShoppingList
 * - 	getShoppingList(int ShoppingListId) by passing in the id 
 * - 	updateShoppingList(ShoppingList shoppingList)
 * 
 *  java and Spring Boot has given us the  functionality right from the box. So, we dont have to use class we can make it as an interface,
 *  	because all of this functionality we can use by simply extending a built in class which is called CRUDRepository 
 * 
 * CRUD - create, read, update, delete. So, by extending our shoppinglist repository it's going to get all of the above methods we need to implement and more for free. 
 *  
 * But, if we want to fetch the shopping list by "title" then we might want to implement the  custom method, or may be if we want to fetch the shoppinglist of 10 items thats a custom method.
 * 
 *  In order to use CRUD repository we have to tell the crud repository what kind of object that we are looking for "what is the type of objects youre lookinng for". 
 *  		ex: <Type of repository your'e building, Type of the primary key> 
 *  			<ShoppingList, Integer>     
 * 
 * */
