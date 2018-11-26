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
    if(start<0||start>=this.length()||end<0||end>=this.length()||start>end)
    throw new IndexOutOfBoundsException();
    String answer="";
    for(int i=start;i<end+1;i++)
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

}
