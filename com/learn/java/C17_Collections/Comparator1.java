//$Id$
package com.learn.java.C17_Collections;

import java.util.*;

final class DB {
    int id;
    String name;
    long salary;
    String company;

    DB(int id, String name, long salary, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }
}

public class Comparator1 {
    public static void main(String[] args) {
        List<Integer> val = new ArrayList<Integer>();
        val.add(30);
        val.add(10);
        val.add(20);
        System.out.println(val);
        Collections.sort(val);
        System.out.println(val);

        List<DB> db = new ArrayList<DB>();
        db.add(new DB(2, "vinay", 20, "Zoho"));
        db.add(new DB(3, "kumar", 40, "Info"));
        db.add(new DB(1, "vavav", 30, "polo"));
        for (DB i : db) {
            System.out.println(i.id + " : " + i.name + " : " + i.salary + " : " + i.company);
        }
        System.out.println("--------------------------");
        System.out.println("Arranged in increasing order of id");
        Collections.sort(db, new Comparator<DB>() {

            @Override
            public int compare(DB first, DB second) {
                // TODO Auto-generated method stub
                if (first.id > second.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (DB i : db) {
            System.out.println(i.id + " : " + i.name + " : " + i.salary + " : " + i.company);
        }
        System.out.println("--------------------------");
        System.out.println("Arranged in decreasing order of salary");
        Collections.sort(db, new Comparator<DB>() {

            @Override
            public int compare(DB first, DB second) {
                // TODO Auto-generated method stub
                if (first.salary < second.salary) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (DB i : db) {
            System.out.println(i.id + " : " + i.name + " : " + i.salary + " : " + i.company);
        }
    }

}
