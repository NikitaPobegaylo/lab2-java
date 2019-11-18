package org.kpi.nikita;

import org.kpi.nikita.*;
import static java.lang.System.*;

// https://dzone.com/articles/configuring-spring-boot-for-postgresql

public class Main {
    public static void main(String [] args){
        System.out.println("123");
//        Train tr = new Train();
        Ticket ti1 = new Ticket( "Vasja", 12, 14.11 );
        System.out.println( ti1 );
    }
}