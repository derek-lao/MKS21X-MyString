public class compareTotesting{
  public static void main(String[] args){
    System.out.print("testing \"hi\" with \"hi\" : ");
    System.out.println("hi".compareTo("hi"));//0
    System.out.print("testing \"his\" with \"hi\" : ");
    System.out.println("his".compareTo("hi"));//1
    System.out.print("testing \"hi\" with \"his\" : ");
    System.out.println("hi".compareTo("his"));//-1
    System.out.print("testing \"hisucker\" with \"hi\" : ");
    System.out.println("hisucker".compareTo("hi"));//6
    System.out.print("testing \"hi\" with \"hisucker\" : ");
    System.out.println("hi".compareTo("hisucker"));//-6
    System.out.print("testing \"hia\" with \"hib\" : ");
    System.out.println("hia".compareTo("hib"));//-1
    System.out.print("testing \"hib\" with \"hia\" : ");
    System.out.println("hib".compareTo("hia"));//1
    System.out.print("testing \"hia\" with \"hic\" : ");
    System.out.println("hia".compareTo("hic"));//-2
    System.out.print("testing \"hic\" with \"hia\" : ");
    System.out.println("hic".compareTo("hia"));//2
    System.out.print("testing \"hiaa\" with \"hibb\" : ");
    System.out.println("hiaa".compareTo("hibb"));//-1
    System.out.print("testing \"hibb\" with \"hiaa\" : ");
    System.out.println("hibb".compareTo("hiaa"));//1
    System.out.print("testing \"hiab\" with \"hiba\" : ");
    System.out.println("hiab".compareTo("hiba"));//-1
    System.out.print("testing \"hiba\" with \"hiab\" : ");
    System.out.println("hiba".compareTo("hiab"));//1
    System.out.print("testing \"hiaa\" with \"hia\" : ");
    System.out.println("hiaa".compareTo("hia"));//1
    System.out.print("testing \"hia\" with \"hiaa\" : ");
    System.out.println("hia".compareTo("hiaa"));//-1
    System.out.print("testing \"hia123456890\" with \"hib0987654321\" : ");
    System.out.println("hia123456890".compareTo("hib0987654321"));//-1
    System.out.print("testing \"hicash\" with \"hidoor\" : ");
    System.out.println("hicash".compareTo("hidoor"));//-1
    System.out.print("testing \"hidoor\" with \"hicash\" : ");
    System.out.println("hidoor".compareTo("hicash"));//1
    System.out.print("testing \"hibbb\" with \"hia\" : ");
    System.out.println("hibbb".compareTo("hia"));//1
  }
}
