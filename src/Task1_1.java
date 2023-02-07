import java.time.Month;

public class Task1_1 {

        public static void main(String[] args) {
            int monthNumber1 = getNumberFromMonthName("FEBRUARY");
            System.out.println("Month number is: "+monthNumber1);
        }

        public static int getNumberFromMonthName(String monthName) {
            return Month.valueOf(monthName.toUpperCase()).getValue();
        }
    }

