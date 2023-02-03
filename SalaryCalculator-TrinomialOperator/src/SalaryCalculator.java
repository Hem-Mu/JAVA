public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }// 5일 이상 쉬면 이면 급여 85%

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }// 20개 이상 팔면 보너스 13으로 상향

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return salary > 2000
                ? 2000
                : salary;
    }// 최종급여가 2000이 넘으면 2000으로 고정
}