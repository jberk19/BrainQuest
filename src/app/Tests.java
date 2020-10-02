package app;

public class Tests {
    public static void main(String[] args) {

        // CREATE A CREATURE
        System.out.println("\nShould announce a creature:");
        Creature a = new Creature("Hockey Player");

        // CHECK CREATURE'S HEALTH
        System.out.println("\nHealth should be set to 100 by default:");
        System.out.println(a.health() == 100);

        // CHECK CREATURE'S TREASURE
        System.out.println("\nCreature should have no default treasure:");
        System.out.println(a.getTreasure() == null);
        System.out.println();

        // BUILD A TREASURE
        System.out.println("\nTreasure's name is Golden Hockeystick:");
        Treasure gh = new Treasure("Golden Hockeystick");
        System.out.println(gh.title().equals("Golden Hockeystick"));
        System.out.println();
    }
}