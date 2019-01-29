public class FirstQuiz {

    public static void main(String[] args){
        System.out.println(formatDate(2019,"jan",23));
        System.out.println(convertFtoC(433)+ "degrees celsius");
        convertTime(1500);
    }

    public static String formatDate(int year, String month, int day){
        return("Today is "+month+" "+day+", "+year);
    }

    public static double convertFtoC(double f){
        return (double)Math.round(((f- 32) * 5/9)*100)/100;
    }

    public static void convertTime(int secs){
        int a = secs/86400;
        int a2= secs-a*86400;
        int b = a2/3600;
        int b2 = a2-b*3600;
        int c = b2/60;
        int c2 = b2-c*60;
        int x=a*86400;
        int y=b*3600;
        int z=c*60;
        int d= secs-x-y-z;
        String hi1=" day ";
        String hi2=" hour ";
        String hi3=" minute ";
        String hi4=" second ";
        if(a>1){
        hi1=" days " ;
        }
        if(b>1){
            hi2=" hours " ;
        }
        if(c>1){
            hi3=" minutes " ;
        }
        if(d>1){
            hi4=" seconds " ;
        }
        System.out.println(a+hi1+b+hi2+c+hi3+d+hi4);
    }
}
