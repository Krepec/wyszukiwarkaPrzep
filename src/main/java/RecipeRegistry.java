import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by laptop on 27.10.17.
 */
public class RecipeRegistry {
    Map<List<String>, String> recipes = new HashMap<List<String>, String>();


    public RecipeRegistry() {
        List<String> pizza = new ArrayList<String>();
        pizza.add("ser");
        pizza.add("szynka");
        pizza.add("pieczarki");
        List<String> szarlotka = new ArrayList<String>();
        szarlotka.add("jajka");
        szarlotka.add("margaryna");
        szarlotka.add("cukier");

        recipes.put(pizza, "pizza");
        recipes.put(szarlotka, "szarlotka");
    }

    public String searchRecipe(List<String> ingrediens) {

        System.out.println(recipes.keySet());   // keySet wyciaga klucze z mapy i wrzuca do listy
        String foundReceipe = null; // wprowadzamy dodatkową zmienną aby zapisac flage czy przepis zawiera wszystkie skladniki

        for (List list : recipes.keySet()) {

            boolean haveAllIngridients = true;
            for (String ingredient : ingrediens) {
                if (!list.contains(ingredient)) {   // czy nie ma tego elementu w przepisie
                    haveAllIngridients = false; // jezeli przepis nie zawiera chociaz jednego składnika to nie powinien byc brany pod uwage i przechodzimy do kolejnego przpisu
                }
            }
            if (haveAllIngridients) { // jezeli przepis ma wszystkie skladniki to zwracamy przepis pierwszy który znajdziemy
                foundReceipe = recipes.get(list);
            }
        }

        return foundReceipe;


    }

}
