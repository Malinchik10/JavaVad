package HW_18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

import static java.lang.Math.abs;
import static java.util.Collections.min;

public class CallableMain {
    public static void main(String[] args) {
        // https://www.digitalocean.com/community/tutorials/java-callable-future-example
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<List<String>>> list = new ArrayList<Future<List<String>>>();
        //Create MyCallable instance
        Callable<List<String>> callable = new CallableTask();
        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<List<String>> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<List<String>> fut : list){
            try {
                System.out.println(fut.get());
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
}