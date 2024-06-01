package co.com.qa.quipux.utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;



public class DynamicData {
    public static final Faker FAKER = new Faker(new Locale("es"));

    public static Map<String,Object> generated() {
      Map<String,Object> dynamicData = new HashMap<>();
        dynamicData.put("name", FAKER.name().firstName());
        dynamicData.put("lastName", FAKER.name().lastName());
        dynamicData.put("email", FAKER.internet().emailAddress());
        dynamicData.put("password", FAKER.internet().password().replaceFirst("","*DASD"));
        dynamicData.put("ID", FAKER.numerify("##########"));
        dynamicData.put("phoneNumber", FAKER.phoneNumber().phoneNumber()
                .replace(".","")
                .replace("-","")
                .replace(" ","")
                .replaceFirst("", "3")
        );
        return dynamicData;
    }
}
