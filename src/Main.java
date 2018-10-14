public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2000; i<2020; i++){
            sum+=numberOfDaysInAYear(i);
        }
        System.out.printf("Result: %d",sum);
    }
    public static int numberOfDaysInAYear(int year){
        if(isLeapYear(year)){
            return 366;
        }
        return 365;
    }
    public static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            }else {
                return true;
            }
        }
        return false;
    }
}
