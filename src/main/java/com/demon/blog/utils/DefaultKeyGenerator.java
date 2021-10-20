package com.demon.blog.utils;


import com.google.common.base.Preconditions;

import java.util.Calendar;

/**
 * @ClassName DefaultKeyGenerator
 * @Descriotion 默认的主键生成器
 * @Author Demon
 * @Date 2021/10/17 20:56
 **/

public class DefaultKeyGenerator {
    public static final long EPOCH;
    private static final long SEQUENCE_BITS = 12L;
    private static final long WORKER_ID_BITS = 10L;
    private static final long SEQUENCE_MASK = 4095L;
    private static final long WORKER_ID_LEFT_SHIFT_BITS = 12L;
    private static final long TIMESTAMP_LEFT_SHIFT_BITS = 22L;
    private static final long WORKER_ID_MAX_VALUE = 1024L;
    private static long workerId;
    private long sequence;
    private long lastTime;

    public DefaultKeyGenerator() {
    }

    public static void setWorkerId(long workerId) {
        Preconditions.checkArgument(workerId >= 0L && workerId < 1024L);
        workerId = workerId;
    }

    public synchronized Number generateKey() {
        long currentMillis = System.currentTimeMillis();
        Preconditions.checkState(this.lastTime <= currentMillis, "Clock is moving backwards, last time is %d milliseconds, current time is %d milliseconds", new Object[]{this.lastTime, currentMillis});
        if (this.lastTime == currentMillis) {
            if (0L == (this.sequence = ++this.sequence & 4095L)) {
                currentMillis = this.waitUntilNextTime(currentMillis);
            }
        } else {
            this.sequence = 0L;
        }
        this.lastTime = currentMillis;
        return currentMillis - EPOCH << 22 | workerId << 12 | this.sequence;
    }

    private long waitUntilNextTime(long lastTime) {
        long time;
        for (time = System.currentTimeMillis(); time <= lastTime; time = System.currentTimeMillis()) {

        }

        return time;
    }

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 10, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        EPOCH = calendar.getTimeInMillis();
    }
}
