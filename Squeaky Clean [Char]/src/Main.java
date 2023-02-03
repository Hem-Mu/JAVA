public class Main {
    public static void main(String[] args) {
        String test = new SqueakyClean().clean("  ha  terĐ\\uD83D\\uDE00ω\\");
        System.out.println("args = " + test);
    }
}