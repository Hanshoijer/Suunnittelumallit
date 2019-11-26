package tehtava_14;

public class McDonaldsHamburger implements Hamburger {

	StringBuilder ingredients = new StringBuilder();
	
	@Override
	public void AddIngredient(Ingredient ingredient) {
		ingredients.insert(0, ingredient.getIngredientName() + " ");
	}

	@Override
	public void PrintHamburger() {
		System.out.println(ingredients);
	}

}
