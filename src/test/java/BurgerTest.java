import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import java.util.List;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class BurgerTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Bun bun;
    List<Ingredient> ingredients;
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient secondIngredient;

    @Test
    public void doesSetBunWork(){

        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void doesAddIngredientsWork(){
        Burger burger = new Burger();
        Assert.assertEquals("The list of ingredients should be empty before adding a new ingredient",0, burger.ingredients.size());
        burger.addIngredient(ingredient);
        Assert.assertEquals("The list of ingredients should have 1 element after adding the new ingredient", 1, burger.ingredients.size());
        Assert.assertEquals("The list of ingredients should include the new ingredient like the first element", ingredient, burger.ingredients.get(0));
    }

    @Test
    public void doesRemoveIngredientsWork(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals("The list of ingredients should be empty before adding a new ingredient",0, burger.ingredients.size());
    }

    @Test
    public void doesMoveIngredientsWork(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.addIngredient(secondIngredient);
        burger.moveIngredient(0,1);
        Assert.assertEquals("The list of ingredients should include the ingredient like the second element", ingredient, burger.ingredients.get(1));
    }

    @Test
    public void doesGetPriceWork(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(65.25F);
        burger.addIngredient(ingredient);
        Mockito.when(ingredient.getPrice()).thenReturn(185.50F);
        burger.addIngredient(secondIngredient);
        Mockito.when(secondIngredient.getPrice()).thenReturn(184.55F);
        float sumTwoBunsAndTwoIngredients = 65.25F * 2 + 185.50F + 184.55F;
        float actual = burger.getPrice();
        Assert.assertEquals(sumTwoBunsAndTwoIngredients, actual, 2);
    }

    @Test
    public void doesGetReceiptWork(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn("Delicious bun");
        burger.addIngredient(ingredient);
        Mockito.when(ingredient.getType()).thenReturn(SAUCE);
        Mockito.when(ingredient.getName()).thenReturn("First ingredient");
        burger.addIngredient(secondIngredient);
        Mockito.when(secondIngredient.getType()).thenReturn(FILLING);
        Mockito.when(secondIngredient.getName()).thenReturn("Second ingredient");
        String receipt = String.format("%s%n%s%n%s%n%s%n%s%n%s%n","(==== Delicious bun ====)","= sauce First ingredient =", "= filling Second ingredient =", "(==== Delicious bun ====)", "", "Price: 0,000000");
        String actual = burger.getReceipt();
        Assert.assertEquals(receipt, actual);
    }




















}
