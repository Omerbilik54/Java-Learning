package VizeIcinTekrar;

import java.util.Scanner;

public class Account {
  private String name ;
  private double bakiye;

  public Account(String name,double bakiye){
      setName(name);
      setbakiye(bakiye);
  }
  public void yatır(double yatirilanMiktar){
      if (yatirilanMiktar>0)
          this.bakiye+=yatirilanMiktar;
      else
          System.out.println("Lütfen geçerli bir rakam giriniz : ");
  }
  public double getBakiye() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("LÜTFEN şifrenizi giriniz: ");
      if(scanner.nextInt()==1234)
          return bakiye;
      else
          return 0;
  }
  public void setbakiye(double bakiye){
      if(bakiye>0)
          this.bakiye=bakiye;
  }
  public String getName(){
      return name;
  }
  public void setName(String name){
      this.name=name;
  }
}
