package Animals;

public class HomeCat extends Animal{

    private static final int MaxRun  = 200;

    public HomeCat(String nickname) {
        this.nickname = nickname;
        this.counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MaxRun)
            System.out.printf("Кот %s пробежал %s м\n", this.nickname, distance);
        else System.out.printf("Кот %s выдохся и сошёл с дистанции\n", this.nickname);

    }

    @Override
    public void swim(int distance) {
       System.out.printf("Котик %s клал на Вас свои лапки за такие препятствия\n", this.nickname);
    }
}