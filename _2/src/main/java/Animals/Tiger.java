package Animals;

public class Tiger extends Animal{

    private static final int MaxRun  = 2000;
    private static final int MaxSwim = 2;

    public Tiger(String nickname) {
        this.nickname = nickname;
        this.counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MaxRun)
            System.out.printf("Тигр %s пробежал %s м\n", this.nickname, distance);
        else System.out.printf("Тигр %s выдохся и сошёл с дистанции\n", this.nickname);

    }

    @Override
    public void swim(int distance) {
        if (distance <= MaxSwim)
            System.out.printf("Тигр %s побарахтался %s м\n", this.nickname, distance);
        else System.out.printf("Тигру %s пришлось вытаскивать\n", this.nickname);
    }
}
