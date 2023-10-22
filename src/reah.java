public class reah {
    public static void main(String[] args) {
//Задача 1
        int i = 0;
        int salary = 15_000;
        int total = 0;
        while (total <= 2_459_000){
            total=total+salary;
            i++;
            if (i % 1 == 0) {
                System.out.println("Месяц "+ i +",сумма накоплений равна "+total+ " рублей");
            }
        }
        //Задача 2
        int l=0;
        while (l >= 0 && l < 10 ){
            l++;
            System.out.print(l + " ");
        }
        System.out.println();


        for(int x=10; x>=1; x--){
            System.out.print( x + " ");
        }
        System.out.println();

        //Задача 3
        int population = 12_000_000;
        double born= 17;
        double dead= 8 ;
        for (int year = 0; year<=10; year++){
            population += (born - dead)/1000 * population;

            System.out.println("Год "+ year+ " численность насиления состовляет " + population);
        }

//Задача 4
        double p = 0.07;
        int month = 0;
        double vklad = 15000;
        while (vklad <= 12_000_000) {
            vklad= vklad + vklad * p;
            month++;
            System.out.println(month+ " месяц "+ vklad + " рублей накопленно");
        }
        //Задача 5
        double p1 = 0.07;
        int month1 = 0;
        double vklad1 = 15000;
        while (vklad1 <= 12_000_000 ) {
            vklad1= vklad1 + vklad1 * p1;
            month1++;
            if (month1% 6==0){
                System.out.println(month1+ " месяц "+ vklad1 + " рублей накопленно");}
        }
        //Задача 6
        {
            int deposit = 15_000;
            for (int month2 = 1; month2 < 9 * 12; month2++) {
                deposit = deposit + (deposit / 100 * 7);
                if ( month2 % 6 == 0) {
                    System.out.println(month2 + " месяц " + deposit + " рублей накопленно");}
            }
        }
        //Задача 7
        {
            for (int friday = 1; friday <= 31; friday+=7) {
                System.out.println("Сегодня пятница "+ friday+ " -е, число. Необходимо подготовить отчет");

            }
        }

        // Задача 8

        {
            int startYear = 2023 - 200;
            int endYear = 2023 + 100;
            for (int year = startYear; year < endYear ; year++)
            {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }
    }
}
