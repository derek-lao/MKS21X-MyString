public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
      data[i]=s.charAt(i);
    }
  }

  //Returns the char value at the specified index.
  public char charAt(int index){
    if(index<0 || index>=data.length)
    throw new IndexOutOfBoundsException();
    return data[index];
  }

  //Returns the length of this character sequence.
  public int length(){
    int answer=0;
    for(int i=0;i<data.length;i++)
    {
      answer++;
    }
    return answer;
  }

  //Returns a CharSequence that is a subsequence of this sequence.
  public CharSequence subSequence(int start, int end){
    if(start<0||start>=this.length()||end<0||end>this.length()||start>end)
    throw new IndexOutOfBoundsException();
    String answer="";
    for(int i=start;i<end;i++)
    {
      answer+=data[i];
    }
    return answer;
  }

  //Returns a string containing the characters in this sequence in the same order as this sequence.
  public String toString(){
    String answer="";
    for(int i=0;i<data.length;i++)
    {
      answer+=data[i];
    }
    return answer;
  }

  //Compares this object with the specified object for order.
  //Based on test cases:
  //1. Compare their letters up to the length of the shorter sequence.
  //   Return the difference between the first char that is different.
  //2. If the letters the same up to this point, return the difference in their lengths.
  //   Therefore, return 0 if they are the same length and all have same characters.
  public int compareTo(CharSequence o) throws NullPointerException{
    int shorter;
    if(this.length()>o.length())
    {
      shorter=o.length();
    }
    else
    {
      shorter=this.length();
    }

    for(int i=0;i<shorter;i++)
    {
      if(this.charAt(i)==o.charAt(i))
      continue;
      else
      {
        return this.charAt(i)-o.charAt(i);
      }
    }
    return this.length()-o.length();
  }

  public static void main(String[] args) {

      // sole constructor test
      MyString msg = new MyString("droid");
      System.out.println("MyString msg = new MyString(\"charlotte\")");

      // toString()
      System.out.println("msg: " + msg);                                                  // "droid"

      // length()
      System.out.println("msg.length(): " + msg.length());                                // 5

      System.out.println();

      // charAt() exception catch
      System.out.println("msg.charAt(-1):");
      try {
        System.out.println(msg.charAt(-1));                             // IndexOutOfBoundsException
      } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

      System.out.println();

      System.out.println("msg.charAt(15):");
      try {
        System.out.println(msg.charAt(15));                             // IndexOutOfBoundsException
      } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

      System.out.println();

      // charAt()
      System.out.println("msg.charAt(0): " + msg.charAt(0));                              // "d"
      System.out.println("msg.charAt(3): " + msg.charAt(3));                              // "i"

      System.out.println();

      // subSequence() exception catch
      // start < 0
      System.out.println("msg.subSequence(-1,4):");
      try {
        System.out.println(msg.subSequence(-1,4));                      // IndexOutOfBoundsException
      } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

      System.out.println();

      // end < 0
      System.out.println("msg.subSequence(1,-4):");
      try {
        System.out.println(msg.subSequence(1,-4));                      // IndexOutOfBoundsException
      } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

      System.out.println();

      // start > end
      System.out.println("msg.subSequence(11,4):");
      try {
        System.out.println(msg.subSequence(11,4));                      // IndexOutOfBoundsException
      } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

      System.out.println();

      // end > length()
      System.out.println("msg.subSequence(1,14):");
      try {
        System.out.println(msg.subSequence(1,14));                      // IndexOutOfBoundsException
      } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

      System.out.println();

      // subSequence()
      System.out.println("msg.subSequence(0,3): " + msg.subSequence(0,3));                // "dro"
      System.out.println("msg.subSequence(2,5): " + msg.subSequence(2,5));                // "oid"

      System.out.println();

      // compareTo()
      System.out.println("msg.compareTo(\"droid\"): " + msg.compareTo("droid"));          // 0
      System.out.println("msg.compareTo(\"bat\"): " + msg.compareTo("bat"));              // 1
      System.out.println("msg.compareTo(\"seventh\"): " + msg.compareTo("seventh"));      // -1
      System.out.println("msg.compareTo(\"drank\"): " + msg.compareTo("drank"));          // 1
      System.out.println("msg.compareTo(\"drunk\"): " + msg.compareTo("drunk"));          // -1

    }

}
