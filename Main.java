public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        ThreadGroup mainGroup = new ThreadGroup("main group");

        final Thread thread1 = new Thread(mainGroup, new MyThread());
        final Thread thread2 = new Thread(mainGroup, new MyThread());
        final Thread thread3 = new Thread(mainGroup, new MyThread());
        final Thread thread4 = new Thread(mainGroup, new MyThread());

        thread1.setName("1");
        thread2.setName("2");
        thread3.setName("3");
        thread4.setName("4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15_000);
        System.out.println("Завершаю всё !");
        mainGroup.interrupt();

    }
}