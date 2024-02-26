package ru.geekbrains.core.lesson1.task3.classes;

import ru.geekbrains.core.lesson1.task3.abstractClasses.Worker;
import ru.geekbrains.core.lesson1.task3.interfaces.SortByName;
import ru.geekbrains.core.lesson1.task3.interfaces.SortBySalaryDesc;
import java.util.Arrays;

/**
 * класс для сортировки массива с Worker
 */
public class WorkerSorting implements SortBySalaryDesc, SortByName {
    private final Worker[] workers;
    public WorkerSorting(Worker[] workers) {
        this.workers = workers;
    }

    /**
     * сортировка массива по salary
     */
    @Override
    public void sortBySalaryDesc(){
        Arrays.sort(workers,(e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
    }

    /**
     * сортировка массива по имени
     */
    @Override
    public void sortByName(){
        Arrays.sort(workers);
    }

    /**
     * печать массива
     */
    public void printWorkers(){
        for (Worker worker: workers) {
            System.out.println(worker.getName() + ": " + worker.getSalary());
        }
    }

}
