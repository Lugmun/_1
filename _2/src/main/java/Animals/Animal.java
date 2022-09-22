package Animals;

import Abilities.Swimmable;
import Abilities.Runnable;

public abstract class Animal implements Runnable, Swimmable {

    String nickname;
    protected int counter;

    @Override
    public abstract void run(int distance);

    @Override
    public abstract void swim(int distance);

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCounter() {
        return counter;
    }
}
