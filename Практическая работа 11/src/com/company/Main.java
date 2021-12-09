package com.company;

class Main {
    public static void main(String[] args) {
        int n = 4; //кол-во лошадей
        System.out.println("Несинхронизированные потоки: ");
        Runner runner = new Runner();
        for (int i = 0; i < n; i++) { // присвоение номера лошади и отправление на старт
            Thread thread = new Thread(runner);
            thread.setName("Лошадь " + (i + 1));
            thread.start();
        }
        try {
            Thread.sleep(100); //задержка
        } catch (InterruptedException e) {
        }
        System.out.println("Синхронизированные потоки: ");
        SyncRunner syncrunner = new SyncRunner();
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(syncrunner);
            thread.setName("Лошадь " + (i + 1));
            thread.start();
        }
    }
}

class Runner implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " стартовала"); // возвращает объект потока (имя)
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " финишировала");
    }
}
// с синхронизацией
class SyncRunner implements Runnable {
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " стартовала");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " финишировала");
    }
}