package Concurrencia;

class TareaSimple implements Runnable {

    private String nombre;

    public TareaSimple(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((int)(Math.random()* 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Hilo interrumpido: " + e.getMessage());
            }
        }
    }
}