import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by laptop on 27.10.17.
 */
public class App {

    public static void main(String[] args) {

        List<String> listOfProducts = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String product = "";
        while (!product.equals("end")) {
            System.out.println("Podaj nazwę kolejnego produktu, jezeli chcesz zakonczyć wpisz: end ");
            product = input.nextLine();
            listOfProducts.add(product);
            listOfProducts.remove("end");
        }

        System.out.println(listOfProducts);
        RecipeRegistry recipeRegistry = new RecipeRegistry();

     /*   listOfProducts.add("szynka");
        listOfProducts.add("pieczarki");*/

        System.out.println(recipeRegistry.searchRecipe(listOfProducts));
    }
}
