package assignment5.food;
import java.util.ArrayList;
import java.util.Arrays;
class FoodItemArray {
	ArrayList<FoodItems> getItems(){
		ArrayList<FoodItems> foods = new ArrayList<>();
		foods.add(new FoodItems("Burger"));
		foods.add(new FoodItems("Pasta"));
		foods.add(new FoodItems("Sushi"));
		foods.add(new FoodItems("Sandwich"));
		foods.add(new FoodItems("Salad"));
		foods.add(new FoodItems("Noodles"));
		foods.add(new FoodItems("Tacos"));
		foods.add(new FoodItems("Steak"));
		foods.add(new FoodItems("Fries"));
		foods.add(new FoodItems("Soup"));
		foods.add(new FoodItems("Donut"));
		foods.add(new FoodItems("Curry"));
		foods.add(new FoodItems("Biryani"));
		foods.add(new FoodItems("Kebab"));
		foods.add(new FoodItems("Omelette"));
		
		return foods;
	}
	String getItemsList() {
		FoodItemArray foodItem = new FoodItemArray();
		ArrayList<FoodItems> foodItems = foodItem.getItems();
		String s = "";
		for(FoodItems f: foodItems) {
			s = s + f.foodItem+", ";
		}
		return s;
	}
}
