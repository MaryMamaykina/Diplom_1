import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import org.apache.commons.lang3.RandomStringUtils;
import praktikum.generate.data.GenerateName;
import praktikum.generate.data.GeneratePrice;

public class BunTest {
    String name = new GenerateName().getRandomName();
    Float price = new GeneratePrice().getRandomPrice();
    Bun bun = new Bun(name, price);

    @Test
    public void doesGetNameWork(){
        String actual = bun.getName();
        Assert.assertEquals(name,actual);
    }

    @Test
    public void doesGetPriceWork(){
        Float actual = bun.getPrice();
        Assert.assertEquals(price,actual);
    }
}
