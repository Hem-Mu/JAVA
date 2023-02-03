public class Main {
    public static void main(String[] args) {
//        LogLevels logLevels = new LogLevels();

        String error = "[ERROR]: Invalid operation";

        String[] errorStr = error.split("\\[|\\]", 0); // 콜론 기준으로 문자열 나누기, limit = 배열의 크기지정
        for (String a:errorStr) {
            System.out.println("a = " + a.trim()); //공백제거
        }
        System.out.println("errorStr[1] = " + errorStr[1].toLowerCase());
//        System.out.println("logLevels = " + logLevels.message("[ERROR]: Invalid operation"));

        System.out.println("errorStr = " + LogLevels.message("[WARNING]:   \tTimezone not set  \r\n"));
    }
}