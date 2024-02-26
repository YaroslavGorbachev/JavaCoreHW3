package ru.geekbrains.core.lesson1.task3;

import ru.geekbrains.core.lesson1.task3.abstractClasses.Worker;
import ru.geekbrains.core.lesson1.task3.classes.*;
public class Main {

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new WorkerHourlyPay("Иван", 100);
        workers[1] = new WorkerHourlyPay("Женя", 150);
        workers[2] = new WorkerFixPay("Сергей", 15000);
        workers[3] = new WorkerFixPay("Петр", 16000);
        workers[4] = new WorkerHourlyPay("Алексей", 70);

        for (Worker w : workers) {
            System.out.println(w);

        }

        System.out.println();
        WorkerSorting sorting = new WorkerSorting(workers);
        sorting.printWorkers();
        System.out.println();

        sorting.sortBySalaryDesc();
        sorting.printWorkers();
        System.out.println();

        sorting.sortByName();
        sorting.printWorkers();
    }}


