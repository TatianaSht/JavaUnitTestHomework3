package homework_03.tdd;

public class NumberInInterval {

    // Проверка числа на вхождение в интервал 25-100
    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
