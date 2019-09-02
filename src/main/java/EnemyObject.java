
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


        ;

/**
 *
 * @author Arthur Bardowski <your.name at your.org>
 */



        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.List;
        import java.util.Scanner;


    public class EnemyObject {

    public static void main(String[] args) throws FileNotFoundException {

        String name;
        String model;

        int gunTypeEnemy;
        int lifeEnemy;
        int speedOfMove;
        int badAgaist;
        int behaving;
        int rangeOfactivity;
        int shootingRange;
        int escapeRange;
        int drops;
        String text;

        System.out.println("TEST BAZY DANYCH WROGOW");


        File file = new File("C:/Users/Laptop HP/.jmonkeyplatform/assetpacks/JME-Example-master/assets/data/enemy.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {

            String zdanie = in.nextLine();
            System.out.println(zdanie);


        }
    }
}
