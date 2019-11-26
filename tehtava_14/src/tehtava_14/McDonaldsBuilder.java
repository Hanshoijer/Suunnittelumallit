package tehtava_14;

public class McDonaldsBuilder implements Builder {

private Hamburger hamburger  = new McDonaldsHamburger();
	
	@Override
	public void BuildBuns() {
		hamburger.AddIngredient(new IngredientBuns());
	}

	@Override
	public void BuildPatty() {
		hamburger.AddIngredient(new IngredientPatty());
	}

	@Override
	public void BuildSalad() {
		hamburger.AddIngredient(new IngredientSalad());
	}

	@Override
	public void BuildCheese() {
		hamburger.AddIngredient(new IngredientCheese());
	}

	@Override
	public Hamburger GetHamburger() {
		return hamburger;
	}

}
