import java.util.Arrays;
import java.util.stream.Stream;

class SqueakyClean {
    static String clean(String identifier) {
        String result = identifier
                .replace(' ', '_')
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("[^\\p{L}\\p{P}]", "")
                .replaceAll("[α-ω]", "");
        StringBuilder clean = new StringBuilder(result);
        while (clean.indexOf("-") != -1) {
            int hyphen = result.indexOf("-");
            char next = result.charAt(hyphen + 1);
            clean.setCharAt(hyphen+1, Character.toUpperCase(next));
            clean.deleteCharAt(hyphen);
        }
        return clean.toString();
    }
}