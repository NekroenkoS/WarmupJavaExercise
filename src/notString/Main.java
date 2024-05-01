package notString;

/*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

 */

public class Main {
    public static void main(String[] args) {

        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }

    public static String notString(String str) {
        String[] beginningString = str.split(" ");
        if (beginningString[0].equals("not")){
            return str;
        }else{
            return "not " + str;
        }
    }

}
