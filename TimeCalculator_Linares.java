package timecalculator_linares;

/**
 * CIS115
 * Lourdes Linares
 * 10.21.2021
 * 
 */
import java.util.Scanner;
public class TimeCalculator_Linares 
{
/** 
 * PSEUDOCODE
 * //variables
 * Declare Integer seconds, days, hours, minutes, remainder
 * Declare constant Integer MINUTE = 60 
 * Declare constant Integer HOUR = 3600
 * Declare constant Integer DAY = 86400
 * //initialize variables to 0
 * days = 0
 * hours = 0
 * minutes = 0
 * //input
 * Display "Enter the seconds you want to convert"
 * input seconds
 * 
 * 
 * //calculations
 * if seconds >= DAY Then
 *  set days = seconds / DAY
 *  set remainder = seconds % DAY
 *  set hours = remainder / HOUR
 *  set remainder = remainder % HOUR
 *  set minutes = remainder / MINUTE
 *  set seconds = remainder % MINUTE
 * 
 * else if seconds >= HOUR Then
 *  set hours = seconds / HOUR
 *  set remainder = seconds % HOUR
 *  set minutes = remainder / MINUTE
 *  set seconds = remainder % MINUTE
 * 
 * else if seconds >= MINUTE Then
 *  set minutes = seconds / MINUTE
 *  set remainder = seconds % MINUTE
 *  set seconds = remainder % MINUTE
 * 
 * else
 *  set seconds = seconds
 * End If
 * 
 * 
 * //output
 * Display "Days: ", days
 * Display "Hours: ", hours
 * Display "Minutes: ", minutes
 * Display "Seconds: ", seconds
 * 
 */
    public static void main(String[] args) 
    {
        //variables
        int seconds, days, hours, minutes, remainder;
        final int MINUTE = 60;
        final int HOUR = 3600;
        final int DAY = 86400;
        days = 0;
        hours = 0;
        minutes = 0;
        remainder = 0;
        //input
        Scanner k = new Scanner (System.in);
        System.out.print("Enter the number of seconds: ");
        seconds = k.nextInt();
        //calculations
        if (seconds >= DAY)
        {
            days = seconds / DAY;
            remainder = seconds % DAY;
            hours = remainder / HOUR;
            remainder = remainder % HOUR;
            minutes = remainder / MINUTE;
            seconds = remainder % MINUTE;       
        }
        else if (seconds >= HOUR)
        {
                hours = seconds / HOUR;
                remainder = seconds % HOUR;
                minutes = remainder / MINUTE;
                seconds = remainder % MINUTE;
        }
            
        else if (seconds >= MINUTE)
        {
            minutes = seconds / MINUTE;
            remainder = seconds % MINUTE;
            seconds = remainder % MINUTE;
        }
            
        else 
        {
         seconds = seconds;             
        }
        //output
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        
        
        
        
    }
  
 }