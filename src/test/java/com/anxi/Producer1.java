package com.anxi;

import java.util.concurrent.BlockingQueue;

public class Producer1 implements Runnable {
    BlockingQueue<String> queue;

    public Producer1(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = "A product,生产线程：" +
                    Thread.currentThread().getName();
            System.out.println("I have made a product:"+Thread.currentThread().getName());
            queue.put(temp);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
