package praktikum.generate.data;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneratePrice {
    public float getRandomPrice(Integer numberOfCharactersBeforePoint, Integer numberOfCharactersAfterPoint){
        float price = Float.valueOf(RandomStringUtils.randomNumeric(numberOfCharactersBeforePoint) + "." + RandomStringUtils.randomNumeric(numberOfCharactersAfterPoint));
        return price;
    }
    public float getRandomPrice(){
        return getRandomPrice(3,2);
    }
}
