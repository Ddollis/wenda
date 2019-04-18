package com.anxi;

import java.util.concurrent.BlockingQueue;

public class Consumer1 implements Runnable {
    BlockingQueue<String> queue;

    public Consumer1(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            String temp = queue.take();
            System.out.println(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
