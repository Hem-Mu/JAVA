import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    @org.junit.Test
    public void arrStream() {
        List<String> hamlist = Arrays.asList("ham", "ster", "gram"); //List Create

        Stream<String> stream = hamlist.stream();//Stream Insert
        for (String ham : hamlist) {
            System.out.println("ham = " + ham);
        }
    }

    @org.junit.Test
    public void legacyArray() {
        String[] List = {"ham", "ster", "gram"};
        List<String> list = Arrays.asList(List); //List Create 방식 1

        List<String> hamlist = Arrays.asList("ham", "ster", "gram"); //List Create 방식 2


        int[] birdsPerDay={1,2,3};
        System.out.println("hamlist = " + birdsPerDay.length);
        //
        Arrays.stream(birdsPerDay).filter(a->a) //hamlist for문
    }
}