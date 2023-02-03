import java.util.logging.Level;
import java.util.logging.Logger;

public class LogLevels {

    public static String message(String logLine) {
        String[] errorStr = logLine.split(":", 0); // 콜론 기준으로 문자열 나누기
        return errorStr[1].trim(); // 앞 뒤 공백제거
    }

    public static String logLevel(String logLine) {
        String[] errorStr = logLine.split("\\[|\\]", 0); // 메타특수문자는 split() 시 역슬래시 2번, 구분자 여러 개 시 or(|) 문자
        return errorStr[1].toLowerCase(); // 소문자로 변환
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}