package ru.geekbrains.core.lesson1.task3.classes;

import ru.geekbrains.core.lesson1.task3.abstractClasses.Worker;
public class WorkerHourlyPay extends Worker{

    private final double hourlyRate; // Почасовая ставка

    public WorkerHourlyPay(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Расчёт среднемесячной заработной платы для «повременщиков»
     * @return заработную плату
     */
    @Override
    public double calculateMonthlySalary(){
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public int compareTo(Worker o) {
        return this.getName().compareTo(o.getName());
    }
}
