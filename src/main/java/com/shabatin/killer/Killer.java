package main.java.com.shabatin.killer;

public class Killer {
    public static void killMemory(){

        long[] killerData = new long[999999999];
        for (long i : killerData) {
            System.out.println(i);
        }
    }
}
