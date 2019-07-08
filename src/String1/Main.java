package String1;

public class Main {
    public static void main(String[] args) {
        helloName name = new helloName();
        System.out.println(name.Hello("Bob"));

        makeAbba Abba = new makeAbba();
        System.out.println(Abba.make("Yo", "Go"));

        makeTags Tags = new makeTags();
        System.out.println(Tags.make("br", "Privet"));
    }
}
