package Concurrencia;

class ThreadSimpleTest {
    public static void main(String[] args) {
        Thread t1 = new ThreadSimple("Argentina");
        t1.start();
        Thread t2 = new ThreadSimple("Uruguay");
        t2.start();
        Thread t3 = new ThreadSimple("Paraguay");
        t3.start();
        Thread t4 = new ThreadSimple("Bolivia");
        t4.start();
        System.out.println("Arrancaron todos los Hilos!!");
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finalizaron todos los Hilos!!!");
    } 
}

