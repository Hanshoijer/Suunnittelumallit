package tehtava_14;

public abstract class Ingredient {

	protected String ingredientName;
	
	public void PrintIngredient() {
		System.out.println(ingredientName);
	}
	
	public String getIngredientName() {
		return ingredientName;
	}
}
