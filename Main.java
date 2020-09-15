import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

  System.out.println("Enter a number to count down or up from : ");

  String name;
  int num;

  num = s.nextInt();

  if (num >= 0){
    //Positive number loop
    while (num >= 0){
      System.out.println(num);
      num --; 
    }
  }
  else {
    while (num <= 0){
      System.out.println(num);
      num ++;
    }
  }
  System.out.println("Blast off!");
}
}