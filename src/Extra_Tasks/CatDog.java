package Extra_Tasks;

public class CatDog {

    public static boolean isSame(String str){
 int countDog = 0;
 int countCat = 0;
        for (int i = 0; i <str.length() -2 ; i++) {
           if(str.substring(i,i+3).equalsIgnoreCase("cat")){
               countCat++;
           }
           if(str.substring(i,i+3).equalsIgnoreCase("dog")){
               countDog++;
           }
        }
        return countCat == countDog;
    }

    public static void main(String[] args) {
     String  str = "catdogcat";
        System.out.println(isSame(str));

    }
}
