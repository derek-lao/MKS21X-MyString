public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data=new char[s.length()];
  }

  //Returns the char value at the specified index.
  public char charAt(int index) throws IndexOutOfBoundsException{
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
  public CharSequence subSequence(int start, int end) throws IndexOutOfBoundsException{

  }

  //Returns a string containing the characters in this sequence in the same order as this sequence.
  public String toString(){

  }

  //Compares this object with the specified object for order.
  public int compareTo(CharSequence o){

  }
}
