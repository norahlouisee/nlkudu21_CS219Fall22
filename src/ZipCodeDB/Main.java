package ZipCodeDB;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {

        Zipcode z1 = new Zipcode("13617","NY","Canton",
                                75.16,44.59,11781);

        System.out.println(z1);

        Zipcode z2 = new Zipcode("10514","NY","Chappaqua",
                                73.77,41.17,11097);

        System.out.println(z2);

        Database db = new Database();

        System.out.println(db.findByZip("12901"));
        System.out.println(db.findByZip("hello"));

        System.out.println(db.search("43221"));

        db.search("13617").getWeatherData();

        System.out.println(db.getNorthern());
        System.out.println(db.search("99950").getWeatherData());

    }
}

