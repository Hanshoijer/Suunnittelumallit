package tehtava_14;

import java.util.ArrayList;
import java.util.List;

public class HesburgerHamburger implements Hamburger {

	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	@Override
	public void AddIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	@Override
	public void PrintHamburger() {
		for(Ingredient x : ingredients) {
			x.PrintIngredient();
		}
	}

}
