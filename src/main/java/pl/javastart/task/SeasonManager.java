package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {
    static Season[] values = Season.values();

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        Season option = getOption(scanner);
        printChosenSeason(option);

    }

    private Season getOption(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        printOption();
        Season season = null;
        do {
            String option = scanner.nextLine();
            for (Season s : values) {
                if (s.getDestription().equalsIgnoreCase(option)) {
                    season = s;
                    return season;
                }
            }
            if (season == null) {
                System.err.println("Wybrano niepoprawną opcje");
            }
        } while (season == null);
        return season;
    }

    private static void printOption() {
        for (Season season : values) {
            System.out.println(season.getDestription());
        }
    }

    private void printChosenSeason(Season option) {
        System.out.println("W tej porze roku są następujące miesiące:");
        System.out.println(Arrays.toString(option.getMonths()));

    }

}
