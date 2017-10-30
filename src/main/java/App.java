import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by laptop on 27.10.17.
 */
public class App {

    public static void main(String[] args){
/*

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwę produktu: ");
        String product = input.nextLine();
*/


RecipeRegistry recipeRegistry = new RecipeRegistry();
        List<String> list = new ArrayList<String>();
        list.add("szynka");
        list.add("pieczarki");

        System.out.println(recipeRegistry.searchRecipe(list));
    }
}
