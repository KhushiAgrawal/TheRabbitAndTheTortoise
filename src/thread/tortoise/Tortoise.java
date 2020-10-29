package thread.tortoise;

import javax.swing.*;

public class Tortoise implements Runnable {

    private static final int MILESTONES = 5;

    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");
    }


    @Override
    public void run() {

    }
}
