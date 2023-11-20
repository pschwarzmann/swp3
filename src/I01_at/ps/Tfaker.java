package I01_at.ps;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Tfaker {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));


        try {
            FileWriter myWriter = new FileWriter("Insertdaten.txt");
            for (int i = 0; i <100; i++) {

                String name = faker.name().fullName();
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String streetAddress = faker.address().streetAddress();

                myWriter.write(name + " " + firstName + " " + lastName + " " + streetAddress + "\n");

            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("Insertdaten2.txt");
            for (int i = 0; i <100; i++) {

                String name = faker.funnyName().name();
                String firstName = faker.artist().name();
                String lastName = faker.app().name();
                String streetAddress = String.valueOf(faker.number());

                myWriter.write(name + " " + firstName + " " + lastName + " " + streetAddress + "\n");

            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("Insertdaten3.txt");
            for (int i = 0; i <100; i++) {

                String name = faker.animal().name();
                String firstName = faker.beer().name();
                String lastName = faker.book().author();
                String streetAddress = faker.code().asin();

                myWriter.write(name + " " + firstName + " " + lastName + " " + streetAddress + "\n");

            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Insertdaten4.txt");
            for (int i = 0; i <100; i++) {

                String name = faker.aviation().toString();
                String firstName = faker.avatar().toString();
                String lastName = faker.book().genre();
                String streetAddress = faker.animal().toString();

                myWriter.write(name + " " + firstName + " " + lastName + " " + streetAddress + "\n");

            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


