import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;
import praktikum.generate.data.GenerateName;
import praktikum.generate.data.GeneratePrice;

public class IngredientTest {
    public IngredientType type = IngredientType.FILLING;
    public String name = new GenerateName().getRandomName();
    public float price = new GeneratePrice().getRandomPrice();

    Ingredient ingredient = new Ingredient(type, name, price);

    @Test
    public void doesGetPriceWork(){
        float actual = ingredient.getPrice();
        Assert.assertEquals(price,actual,2);
    }

    @Test
    public void doesGetNameWork(){
        String actual = ingredient.getName();
        Assert.assertEquals(name,actual);
    }

    @Test
    public void doesGetTypeWork(){
        IngredientType actual = ingredient.getType();
        Assert.assertEquals(type,actual);
    }

}
