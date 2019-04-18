package com.anxi;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test3 {
    public static void main(String[] args){
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(2);

        Consumer1 consumer1 = new Consumer1(queue);
        Producer1 producer1 = new Producer1(queue);

        for(int i=0;i<5;i++){
            new Thread(producer1,"Producer"+(i+1)).start();
            new Thread(consumer1,"Consumer"+(i+1)).start();
        }
    }
}
