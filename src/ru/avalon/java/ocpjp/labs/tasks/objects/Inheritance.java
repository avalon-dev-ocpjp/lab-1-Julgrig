package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Задание, направленное на изучение следующих тем:
 * 1. наследование;
 * 2. полиморфизм;
 * 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {

    /**
     * Объект, выполняющий сравнение объектов типа
     * {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров {@link Citizen}
     * в консоль.
     */
    private ObjectWriter<Citizen> writer;

    public Inheritance() {
        comparator = new CitizenComparator();
        source = new CitizenSource();
        writer = new CitizenWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        List<Citizen> citizens = new ArrayList<>();

        // TODO(Студент): Добавить все элементы, доступные в объекте source, в коллекцию citizens

        // TODO(Студент): Отсортировать список citizens перед выводом в поток

        // TODO(Студент): Пользуясь объектом writer вывести список citizens в консоль
        
        for (Citizen citizen : source) {  // TODO(Студент): Добавить все элементы, доступные в объекте source, в коллекцию citizens
            citizens.add(citizen);
        }

        Collections.sort(citizens, comparator);  // TODO(Студент): Отсортировать список citizens перед выводом в поток

        citizens.forEach((citizen) -> {          // TODO(Студент): Пользуясь объектом writer вывести список citizens в консоль
            try {
                writer.write(citizen);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }
}
