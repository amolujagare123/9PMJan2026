package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {
        // convert Date into String
        Date date = new Date();
        System.out.println("date="+date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sd.format(date);
        System.out.println("dateStr="+dateStr);


        //→ dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println("dateStr0="+dateStr0);


        //→ dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr1 = sd1.format(date);
        System.out.println("dateStr1="+dateStr1);

    }
}
