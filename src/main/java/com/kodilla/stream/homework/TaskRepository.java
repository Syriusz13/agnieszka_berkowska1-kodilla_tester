package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Stay at home", LocalDate.of(2020, 3, 12),LocalDate.of(2020,5,15)));
        taskList.add(new Task("Win the battle", LocalDate.of(1410, 7, 14),LocalDate.of(1410,7,15)));
        taskList.add(new Task("Have a nice weekend", LocalDate.of(2020, 3, 20),LocalDate.of(2020,3,22)));
        taskList.add(new Task("Complete the course", LocalDate.of(2020, 2, 1),LocalDate.of(2020,6,30)));
        return taskList;
    }
}
