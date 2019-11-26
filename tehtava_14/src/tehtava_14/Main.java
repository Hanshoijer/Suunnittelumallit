package tehtava_14;

public class Main {

	public static void main(String[] args) {

		Builder HesburgerBuilder = new HesburgerBuilder();
		Builder McDonaldsBuilder = new McDonaldsBuilder();
		
		HesburgerBuilder.BuildBuns();
		HesburgerBuilder.BuildPatty();
		HesburgerBuilder.BuildSalad();
		HesburgerBuilder.GetHamburger().PrintHamburger();

		McDonaldsBuilder.BuildBuns();
		McDonaldsBuilder.BuildPatty();
		McDonaldsBuilder.BuildCheese();
		McDonaldsBuilder.GetHamburger().PrintHamburger();
		
		
		

	}

}
