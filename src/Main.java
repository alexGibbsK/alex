import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by java-1-07 on 01.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        Fighter fighter = new Fighter(r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1);
        System.out.println(new Fighter(r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1));
        System.out.println(fighter.toString());

        List<Fighter> list = new LinkedList<Fighter>();

        getFighterList(r, list);

        for(Fighter f : list){
            System.out.println(f.toString());
        }

        System.out.println((char) 27 + "[31mCRIT " + (char)27 + "[0m");
    }

    private static void getFighterList(Random r, List<Fighter> list) {
        for (int i = 0; i < 10; i++) {
        list.add(new Fighter(r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1));
        }
    }
}
