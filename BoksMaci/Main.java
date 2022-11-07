public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed Ali",10,110,100,50);
        Fighter f2 = new Fighter("Mike Tyson",15,100,95,50);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }
}
