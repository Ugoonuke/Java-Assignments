import java.util.Scanner;

public class WeatherReport {
    public static void main(String ars []){
        printWeatherReport();
    }
    public static void printWeatherReport(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 0 && a<= 8){
            System.out.print("It is cold outside, bring a jacket!");
        }
        else if(a >= 9 && a<= 16){
            System.out.print("The sun is coming out, and it is getting warmer");
        }
        else if(a >= 17 && a<= 32){
            System.out.print("Time to sit beside the pool and relax");
        }
        else if(a >= 33 && a<= 45){
            System.out.print("Too hot, can't move!");
        }
        else if(a < 0 || a > 45){
            System.out.print("Not a valid number!");
        }
    }
}
