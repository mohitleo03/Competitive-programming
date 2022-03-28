import java.util.*;

public class centuri {

  private static String getRuler(String kingdom) {
    // TODO: implement this method to determine the ruler name, given the kingdom.
    char a = kingdom.charAt(kingdom.length()-1);
            if ( a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'|| a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {  //a,e,i,o,u
                return "Alice";
            }
            else if(a == 'y'){  //
                return "nobody";
            }
            else{
                return "Bob";
            }
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}
