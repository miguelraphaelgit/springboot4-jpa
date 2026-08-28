public class TestH2 {

    public static void main(String[] args) {
        System.out.println("Java: " + System.getProperty("java.version"));
        System.out.println("Classpath:");
        System.out.println(System.getProperty("java.class.path"));

        try {
            Class.forName("org.h2.Driver");
            System.out.println("================================");
            System.out.println("H2 ENCONTRADO!");
            System.out.println("================================");
        } catch (ClassNotFoundException e) {
            System.out.println("================================");
            System.out.println("H2 NAO ENCONTRADO!");
            System.out.println("================================");
            e.printStackTrace();
        }
    }
}
