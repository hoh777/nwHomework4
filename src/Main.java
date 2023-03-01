public class Main {
    public static void main(String[] args) {
        //задача1
        int clientOS = 1;

        if (clientOS == 0) {
            ;
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задача2
        int clientsOS = 0;
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
            } else {
                System.out.println(" версию приложения для iOS по ссылке».");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке».");
            } else {
                System.out.println(" версию приложения для android по ссылке».");
            }
            ///задача 3
            int year = 2021;

            if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
                System.out.println(year + "является висококосным");
            } else {
                System.out.println(year + " не является висококосным");
            }
            //задача4
            int deliveryDistance = 95;
            int dilivery = 1;

            if (deliveryDistance > 20) {
                dilivery++;
            }

            if (deliveryDistance > 60) {
                dilivery++;
            }

            System.out.println("Потребуется дней " + dilivery);
        }
        //задача 5
        int monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зимв");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого месяца нет" + monthNumber);
        }

    }
}