import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleReciepes {

    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.setName("Bread");
        recipe.setRawIng(Arrays.asList("wheat", "floor"));
        recipe.setInterIng(List.of());

        Recipe recipe1 = new Recipe();
        recipe1.setName("Corn");
        recipe1.setRawIng(Arrays.asList("corn", "floor"));
        recipe1.setInterIng(List.of());

        Recipe recipe2 = new Recipe();
        recipe2.setName("Sandwich");
        recipe2.setRawIng(Arrays.asList("corn", "floor"));
        recipe2.setInterIng(List.of("WOW"));


        returnPossibileReciepes(Arrays.asList(recipe, recipe1, recipe2), Arrays.asList("wheat", "floor", "corn"));
    }


    public static List<String> returnPossibileReciepes(List<Recipe> reciepes, List<String> ingredients) {

        List<String> EMPTY_LIST = new ArrayList();
        List<String> finalReciepes = new ArrayList();


        if (reciepes.size() == 0 || ingredients.size() == 0) return EMPTY_LIST;

        for (Recipe eachRecipe : reciepes) {
            boolean canAdd = true;
            for (String eachIngredient : eachRecipe.getRawIng())
                if (!ingredients.contains(eachIngredient)) {
                    canAdd = false;
                    break;
                }

            if (canAdd) finalReciepes.add(eachRecipe.getName());

        }

        for (Recipe eachRecipe : reciepes)
            for (String intermediatIng : eachRecipe.getInterIng())
                if (finalReciepes.contains(intermediatIng)) {
                    boolean canAdd = true;
                    for (String eachIng : eachRecipe.getInterIng())
                        if (!ingredients.contains(eachIng)) {
                            canAdd = false;
                            break;
                        }

                    if (canAdd) finalReciepes.add(eachRecipe.getName());

                }
        return finalReciepes;

    }

    static class Recipe {

        private String name;
        private List<String> rawIng;
        private List<String> interIng;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getRawIng() {
            return rawIng;
        }

        public void setRawIng(List<String> rawIng) {
            this.rawIng = rawIng;
        }

        public List<String> getInterIng() {
            return interIng;
        }

        public void setInterIng(List<String> interIng) {
            this.interIng = interIng;
        }
    }
}
// List<String> returnPossibileReciepes(List)
