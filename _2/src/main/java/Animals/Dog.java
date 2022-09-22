package Animals;

public class Dog extends Animal{

    private static final int MaxRun  = 500;
    private static final int MaxSwim = 10;

    public Dog(String nickname) {
        this.nickname = nickname;
        this.counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MaxRun)
            System.out.printf("Собака %s пробежала %s м\n", this.nickname, distance);
        else System.out.printf("Собака %s выдохлась и сошла с дистанции\n", this.nickname);

    }

    @Override
    public void swim(int distance) {
        if (distance <= MaxSwim)
            System.out.printf("Собака %s проплыла %s м\n", this.nickname, distance);
        else System.out.printf("Собаке %s понадобились спасатели\n", this.nickname);
    }
}
