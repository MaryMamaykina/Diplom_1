import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    public IngredientType type = IngredientType.FILLING;
    public String name = RandomStringUtils.randomAlphabetic(7);
    public float price = Float.valueOf(RandomStringUtils.randomNumeric(3));

    Ingredient ingredient = new Ingredient(type, name, price);

    @Test
    public void doesGetPriceWorks(){
        float actual = ingredient.getPrice();
        Assert.assertEquals(price,actual,2);
    }

    @Test
    public void doesGetNameWorks(){
        String actual = ingredient.getName();
        Assert.assertEquals(name,actual);
    }

    @Test
    public void doesGetTypeWorks(){
        IngredientType actual = ingredient.getType();
        Assert.assertEquals(type,actual);
    }

}
