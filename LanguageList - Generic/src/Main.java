public class Main {
    public static void main(String[] args) {
        LanguageList languageList = new LanguageList();
        
        languageList.addLanguage("JAVA");
        System.out.println("languageList = " + languageList.containsLanguage("JAVA"));
    }
}