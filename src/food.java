//import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public interface food {

    //interface used for first stage
    //will spawn each leaf in a radius around a theoretical tree
    public abstract void grow(gameObject food);


}