public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productCar = speed * 221;
        return switch (speed) {
            case 0 -> 0; //speed -> 0 : 생산량 없음
            case 1, 2, 3, 4 -> productCar;
            case 5, 6, 7, 8 -> productCar * 0.9;
            case 9 -> productCar * 0.8;
            case 10 -> productCar * 0.77;
            default -> throw new IllegalStateException("유효하지 않은 값: " + speed);
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}