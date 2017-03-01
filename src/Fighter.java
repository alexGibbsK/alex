import java.util.Random;

/**
 * Created by java-1-07 on 01.03.2017.
 */
public class Fighter {
    int str;
    int dex;
    int per;
    int hp = 100;

    Random rand = new Random();

    public Fighter(int str, int dex, int per) {
        int sum = str + dex + per;
        double max = 50;
        this.str = (int) ((max / sum) * str);
        if (this.str < 1) this.str++;
        this.dex = (int) ((max / sum) * dex);
        this.per = (int) ((max / sum) * per);
        this.hp = 100;
    }

    @Override
    public String toString() {
        return "Fighter " +
                "str=" + str +
                ", dex=" + dex +
                ", per=" + per +
                ", hp=" + hp;
    }
}
