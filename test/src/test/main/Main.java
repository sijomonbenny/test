package test.main;

import test.service.VendingMachine;
import test.service.impl.VendingMachineImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input = sc.next();

        List<String> studentList = new ArrayList<>();
        studentList.add("Sijo");
        studentList.add("Amal");
        String s= "Sijo";
        s="Amal";

        String strs[] = {"Sijo", "AMala"};
        List<String> filtered = studentList.stream().filter(str -> str.contains("Sijo")).collect(Collectors.toList());
        System.out.println("Hi "+input);
        VendingMachine vendingMachine = new VendingMachineImpl();
        System.out.println(vendingMachine.getFare(100));


    }
}