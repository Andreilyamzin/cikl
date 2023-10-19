public class Main {
    public static void main(String[] args) {
        //Задача 1
        for(int i = 1; i<= 10; i = i + 1 ){
            System.out.println(i);}
        //задача 2
        for (int p = 10; p >=1; p -- ) {
            System.out.println(p);}
        //Задача 3

        for (int t = 0; t <=17; t= t+2 ) {
            System.out.println(t);
        }
        // задача 4
        for (int y = 10; y >= -10 ;y= y-1 ){
            System.out.println(y);
        }
        //задача 5

        for (int year = 1904; year <= 2096; year=year+4 ){
            System.out.println(year + "год является високосным");
        }
        //задача 6

        for (int e = 7; e <= 98; e= e +7 ){
            System.out.println(e);
        }
        //Задача7

        for (int w =1; w <= 512; w=w *2) {
            System.out.println(w);
        }
        //Задача 8
        int salary= 29_000;
        int total = 0;
        for (int u = 1; u<=12; u++){
            total=total+salary;
            System.out.println( "Месяц "+u+",сумма накоплений равна "+ total);
        }
        //Задача 9

        int salary1 = 29_000;
        int total1 = 0;
        for (int o = 1; o <=12; o++){
            total1= total1 + salary1;
            total1= total1 + total1/ 100;
            System.out.println("Месяц "+ o + ",сумма накоплений равна "+ total1);
        }
        //Задача 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }




    }
}