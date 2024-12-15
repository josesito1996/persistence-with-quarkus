import io.quarkus.runtime.Quarkus;

public class Main {

    public static void main(String... args) {
        long startTime = System.currentTimeMillis();
        Quarkus.run(args);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Application started in " + duration + " ms");
    }
}