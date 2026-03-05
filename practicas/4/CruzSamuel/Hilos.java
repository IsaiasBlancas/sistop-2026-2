public class Hilos {
    public static void main(String[] args) {
        // Obtenemos el PID único de este proceso 
        long pid = ProcessHandle.current().pid(); 

        // Creamos dos hilos que imprimen el PID y su propio nombre
        new Thread(() -> System.out.println("Hilo A - PID: " + pid)).start();
        new Thread(() -> System.out.println("Hilo B - PID: " + pid)).start();

        System.out.println("Principal - PID: " + pid);
    }
}