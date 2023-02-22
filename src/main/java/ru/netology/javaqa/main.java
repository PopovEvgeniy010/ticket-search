package ru.netology.javaqa;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1, 6000, "SVO", "KZN", "10000");
        Ticket ticket2 = new Ticket(2, 5000, "VKO", "KZN", "11000");

        System.out.println(ticket1.compareTo(ticket2));
        System.out.println(ticket2.compareTo(ticket1));
        Ticket[] tickets = {ticket1,ticket2};
        Arrays.sort(tickets);
    }
}
