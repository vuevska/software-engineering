import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Master branch");
        System.out.println("vto branch");
    }

    // counts even numbers in an integer list
    public static int countEven(List<Integer> list) {
        return (int) list.stream().filter(i -> i % 2 == 0).count();
    }
}
