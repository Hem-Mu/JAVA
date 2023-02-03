import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class BirdWatcher {
    public int[] getLastWeek() { //지난 주 확인된 새의 수치
        return birdsPerDay; // 그대로 새의 수치 리턴
    }

    public int getToday() { //오늘 확인된 새의 수치
        return birdsPerDay.length == 0 ? 0 : birdsPerDay.length - 1; // birdsPerDay.length : 마지막 배열 값
    }

    public int incrementTodaysCount() { //오늘 확인된 새의 수치 +1
        return ++birdsPerDay[birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() { //새가 없는 날이 있는지
        for (int count : birdsPerDay) {
            if (count == 0)
                return true;
        }
        return false;
    }


    public int getCountForFirstDays(int numberOfDays) { //한 주의 해당 일 수의 새의 수치 반환
        int[] withoutBird = getLastWeek();
        int birdCount = 0;
        for (int i = 0; i < numberOfDays - 1; i++) {
            birdCount += withoutBird[i];
        }
        return birdCount;
    }

    public int getBusyDays() { // 5마리 이상 방문 일 수 체크
        int[] withoutBird = getLastWeek();
        int moreBird = 0;
        int checkBird = 1;
        for (int i : getLastWeek()) {
            checkBird = withoutBird[i];
            if (checkBird >= 5) {
                moreBird++;
            }
        }
        return moreBird;
    }
}
//Chat GPT
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;// 그대로 새의 수치 리턴
    }

    public int getToday() {//오늘 확인된 새의 수치
        return return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];// birdsPerDay.length : 마지막 배열 값
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {//새가 없는 날이 있는지
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {//한 주의 해당 일 수의 새의 수치 반환
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {// 5마리 이상 방문 일 수 체크
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}

