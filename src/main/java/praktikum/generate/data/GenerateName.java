package praktikum.generate.data;
import org.apache.commons.lang3.RandomStringUtils;

public class GenerateName {

    public String getRandomName(Integer numberOfCharacters){
        return RandomStringUtils.randomAlphabetic(numberOfCharacters);
    }
    public String getRandomName(){
        return getRandomName(7);
    }
}
