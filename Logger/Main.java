package Logger;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Введите размер списка:");
        int listSize = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений:");
        int upperBound = scanner.nextInt();
        ArrayList list = new ArrayList(listSize);
        Random random = new Random();
        for (int i = 0; i < listSize; i++){
            list.add(random.nextInt(upperBound));
        }
        System.out.println("Вот случайный список:" + list);
        logger.log("Введите порог для фильтра:");
        int filtrNum = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filtrNum);
        filter.filterOut(list);
        logger.log("Завершаем программу");


    }


}
