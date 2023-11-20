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

                if(i == 99){
                    myWriter.write(
                            "('"+name + "','"+firstName + "','" + lastName  +"','"  +streetAddress +"');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+name + "','"+firstName + "','" + lastName  +"','"  +streetAddress +"'),"+ "\n");
                };

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

                String lustigername = faker.funnyName().name();
                String artistname = faker.artist().name();
                String nachname = faker.app().name();
                String code = faker.code().ean8();

                if(i == 99){
                    myWriter.write(
                            "('"+lustigername + "','"+artistname + "','" + nachname  +"','"  +code +"');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+lustigername + "','"+artistname + "','" + nachname  +"','"  +code +"'),"+ "\n");
                };

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

                String tier = faker.animal().name();
                String bier = faker.beer().name();
                String buchauthor = faker.book().author();
                String katze = faker.cat().name();

                if(i == 99){
                    myWriter.write(
                            "('"+tier + "','"+bier + "','" + buchauthor  +"','"  +katze +"');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+tier + "','"+bier + "','" + buchauthor  +"','"  +katze +"'),"+ "\n");
                };

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

                String music = faker.music().genre();
                String zelda = faker.zelda().character();
                String dragonball = faker.dragonBall().character();
                String superheld = faker.superhero().name();

                if(i == 99){
                    myWriter.write(
                            "('"+music + "','"+zelda + "','" + dragonball  +"','"  +superheld +"');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+music + "','"+zelda + "','" + dragonball  +"','"  +superheld +"'),"+ "\n");
                };

            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


