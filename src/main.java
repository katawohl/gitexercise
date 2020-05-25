public class main {
    public static void main(String[] args) {
        Future future = new Future();
        future.future("Dragon");

        Count count = new Count();
        count.count();

        Greet.greet(1);
        Greet.greetTwoParam(1, "whatever");

        Cheer cheer = new Cheer();
        cheer.cheer("Helló, We are Team awesome!");

    }
}
