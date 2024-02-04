import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import org.apache.commons.lang3.RandomStringUtils;

public class BunTest {
    String name = RandomStringUtils.randomAlphabetic(7);
    Float price = Float.valueOf(RandomStringUtils.randomNumeric(3));
    Bun bun = new Bun(name, price);

    @Test
    public void doesGetNameWorks(){
        String actual = bun.getName();
        Assert.assertEquals(name,actual);
    }

    @Test
    public void doesGetPriceWorks(){
        Float actual = bun.getPrice();
        Assert.assertEquals(price,actual);
    }
}
