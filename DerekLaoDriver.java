public class DerekLaoDriver{
  public static void main(String[] args){
    System.out.println("Welcome to Derek Lao's driver! This is his first time ever doing a driver.");
    System.out.println("\n");
    System.out.println("Testing toString: \n");

    String lyrics;
    MyString testMyString;

    lyrics="You rock my world you know you did";
    testMyString= new MyString(lyrics);
    System.out.println("Our CharSequence:");
    System.out.println(lyrics);
    System.out.println();
    System.out.println("We have put that into a MyString.");
    System.out.print("We did a toString of the MyString. ");
    System.out.println("It should look exactly the same as the CharSequence: ");
    System.out.println(testMyString.toString());
    System.out.println("\n\n");

    lyrics="Annie are you okay? Annie are you okay? Are you okay Annie?";
    testMyString= new MyString(lyrics);
    System.out.println("Our CharSequence:");
    System.out.println(lyrics);
    System.out.println();
    System.out.println("We have put that into a MyString.");
    System.out.print("We did a toString of the MyString. ");
    System.out.println("It should look exactly the same as the CharSequence: ");
    System.out.println(testMyString.toString());
    System.out.println("\n\n");

    lyrics="Do you remember, how it all began? It just, seemed so perfect so why did it end?va";
    testMyString= new MyString(lyrics);
    System.out.println("Our CharSequence:");
    System.out.println(lyrics);
    System.out.println();
    System.out.println("We have put that into a MyString.");
    System.out.print("We did a toString of the MyString. ");
    System.out.println("It should look exactly the same as the CharSequence: ");
    System.out.println(testMyString.toString());
    System.out.println("\n\n");
  }
}
