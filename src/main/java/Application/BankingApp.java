package Application;

import org.apache.log4j.Logger;


import java.util.Scanner;

public class BankingApp {

  private static final Logger log = Logger.getLogger(BankingApp.class);
  Scanner sc = new Scanner(System.in);
    static String user;
    static String password;

  public void login(){
      int count=0;

      System.out.println("\n              ==>Logging in to your account<==");
      while(true) {

      System.out.println("Enter your username");
      user = sc.nextLine();
      if(user.equals("Madhu Sanjeev")) {log.debug("Valid user name"); break;}
      else log.error("Invalid username");}

      while(true){

      System.out.println("Enter your Password");log.warn("Do not share your password");
      password = sc.next();
      if(password.equals("S456")){log.debug("Valid password"); log.debug("You Successfully logged into your account"); break;}
      else log.error("Invalid Password");count++;if(count==3){log.fatal("You exceeded the limit YOUR ACCOUNT BLOCKED FOR 24Hrs"); return;}}

  }
  public static void main(String[] args) {

        BankingApp bObj = new BankingApp();
      System.out.println("***********Welcome to Bank Of America***********");
      System.out.println("                    MAIN MENU");
      System.out.println("------------------------------------------------");
      System.out.println("Sr.No                                Action");
      System.out.println("-----                         ------------------");
      System.out.println("  1                             Checking Account");
      System.out.println("  2                             Savings Account ");
      System.out.println("  3                             Credit Card   ");
      System.out.println("  4                             Home Loans    ");

      int key = bObj.sc.nextInt();
      log.info("You are being redirected to Login page");
      if(key>=1 && key <=4) bObj.login();
      else System.out.println("Enter a valid Input");


      System.out.println("\n\n Enjoy Safe and Secured Banking with us");

    }

}
