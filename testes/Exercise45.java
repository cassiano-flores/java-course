package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

//learning Date in java
public class Exercise45 {
    
    public static void main(String[] args) throws ParseException {
        
        //use SDFs to define a format to print
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");   
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));     //set the time zone to GMT

        Date y1 = sdf1.parse("24/06/2001");                 //parse receive a SimpleDateFormat and returns a Date   
        Date y2 = sdf2.parse("24/06/2001 10:10:10");
        Date y3 = Date.from(Instant.parse("2001-06-24T10:10:10Z"));  //instant a exactly time (ISO 8601 default, Z = GMT)

        //------------------------------------------------------------------------------------------------------------------------------

        Date x1 = new Date();       //way to store the actual date
        Date x2 = new Date(0L);     //way to store when this function was invented  (01/01/1970 00:00:00
        Date x3 = new Date(1000L * 60L * 60L * 5L);     //way to store 5 HOURS after this function was invented
                                                        //L informs that this constant is LONG
        //1s = 1000ms
        //1min = 60s
        //1h = 60min
        //5h

        System.out.println("\n***** JAVA FORMAT *****");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        System.out.println("\n***** SDF2 (my time zone GMT-3) *****");
        System.out.println("y1: " + sdf2.format(y1));    //format that I established
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));
        System.out.println("x1: " + sdf2.format(x1));     //will print all dates in the equivalent of my PC time (GMT-3)
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));

        System.out.println("\n***** SDF3 (GMT) *****");
        System.out.println("y1: " + sdf3.format(y1));   
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
        System.out.println("x1: " + sdf3.format(x1));    
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
    }
}