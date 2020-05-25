public class main {
    public static void main(String[] args) {
        Future future = new Future();
        future.future("Szebi","Dragon");

        Count count = new Count();
        count.count(10,5);

        Greet.greet(1);
        Greet.greetTwoParam(1, "whatever");

        Cheer cheer = new Cheer();
        cheer.cheer("Helló, We are Team awesome!", 10);

    }
}
