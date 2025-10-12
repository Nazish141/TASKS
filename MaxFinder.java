public class MaxFinder{
    public static int findMax(int a ,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static double findMax(double a , double b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[]args){
       int maxInt = findMax(45 ,89);
       double maxDouble = findMax(6.78,98.2);
       System.out.println("maximum value of two integers is:"+maxInt);
       System.out.println("maximum value of two doubles is:"+maxDouble);
    }
}
