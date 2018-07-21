package ch16_Concurrency;

import java.util.concurrent.*;

/**
 * Created by Vasiliy Kylik (Lightning) on 22.07.2018.
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor() {
        super(0,
                Integer.MAX_VALUE,
                60L,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
                new DaemonThreadFactory());
    }
}
