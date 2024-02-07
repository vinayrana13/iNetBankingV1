package TestData;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import com.github.javafaker.PhoneNumber;

public class RandomDataGenerator {


    public static String getUsername(){
        Faker faker = new Faker();
       return faker.name().username();
    }

    public static String getFirstName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }


    public static String getLastName(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public static String getEmailAddress(){
        Faker faker = new Faker();
        return faker.internet().safeEmailAddress();
    }

    public static String getUniquePassword(){
        Faker faker = new Faker();
        return faker.internet().password(9,10,true,true,true);
    }
    public static String getAddress(){
        Faker faker = new Faker();
        return faker.internet().password();
    }

    // TC049 - to get Random company name
    public static String getCompanyName(){
        Faker faker = new Faker();
        return faker.company().name();
    }

    // TC049 - to get Random address line 1
    public static String getAddressLine1(){
        Faker faker = new Faker();
        return faker.gameOfThrones().house();
    }

    // TC049 - to get Random address line 2
    public static String getAddressLine2(){
        Faker faker = new Faker();
        return faker.address().secondaryAddress();
    }

    // TC049 - to get Random city name
    public static String getCityName(){
        Faker faker = new Faker();
        return faker.gameOfThrones().city();
    }
    //TC070-to get Random email address
    public static String getEmail1() {
        Faker faker = new Faker();
        return faker.internet().safeEmailAddress();
    }

    public static String getPostalCode(){
        Faker faker=new Faker();
        return faker.number().digits(5);
    }

    public static String  getMobileNumber(){
        Faker faker=new Faker();
        return faker.number().digits(10);
    }

    public static String  getPosition(){
        Faker faker=new Faker();
        return faker.company().profession();
    }


    public static void main(String[] args) {
        System.out.println(RandomDataGenerator.getMobileNumber());
    }
}
