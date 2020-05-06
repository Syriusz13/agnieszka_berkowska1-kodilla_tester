package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgForumStatsForUsersAbove40 = UsersRepository.getUsersList()
                .stream()
                .filter(u-> u.getAge()>=40)
                .map(un->un.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();

        System.out.println(avgForumStatsForUsersAbove40);

        double avgForumStatsForUsersBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(u-> u.getAge()<40)
                .map(un->un.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();

        System.out.println(avgForumStatsForUsersBelow40);
    }
}
