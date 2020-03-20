package com.kodilla.stream.homework;

import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(d ->d.getDeadline())
                .collect(Collectors.toList());

        System.out.println(deadlines);
    }
}
