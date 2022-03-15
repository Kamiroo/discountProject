import java.util.Scanner;
import java.util.Date;

public class Discount {


    public int computeDiscount(int yearOfBirth){
        // metode ktora przyjmie rok urodzenia i zwroci wiek i przypisze to do zmiennej
        int age = calculateAge(yearOfBirth);
        if (age >= 1 && age <= 15){
            System.out.println("Przysługuję Ci 0% rabatu.");
            return 0;
        }
        else if (age >= 16 && age <=25) {
            System.out.println("Przysługuję Ci 5% rabatu.");
            return 5;
        }
        else if (age >= 26 && age <=45) {
            System.out.println("Przysługuję Ci 10% rabatu.");
            return 10;
        }
        else if (age >= 46 && age <= 65) {
            System.out.println("Przysługuję Ci 15% rabatu.");
            return 15;
        }
        else if (age >= 66 && age <= 150) {
            System.out.println("Przysługuję Ci 20% rabatu.");
            return 20;
        }
        else {
            System.out.println("Wprowadzono nieprawdiłową datę.");
            return -1;
        }
    }

    private int calculateAge(int yearOfBirth) {
        int year = new Date().getYear();
        int current_year = year + 1900;
        int age = current_year - yearOfBirth;
        return age;
    }

}
