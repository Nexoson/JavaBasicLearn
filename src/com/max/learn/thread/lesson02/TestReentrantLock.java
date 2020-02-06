package com.max.learn.thread.lesson02;

import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();

    }
}
