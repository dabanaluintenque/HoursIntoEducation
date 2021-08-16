import java.util.Scanner;

public class WastingHours{

     double day=24;

   //static double wast;
       double work;

      double at_school;

       double study;
       double sleep;

       double playVideoGame;

       double watch_tv;

      double result;

    double pray;


    Scanner input = new Scanner(System.in);




   // static  public double getWatch(){
//
//
//
//     //  }
//
//     //   if(Watching_tv>5)//{
//
//         //   System.out.println("you expend most your hours in watching Tv. "+Watching_tv+" hours is a lot.");
//         //  return Watching_tv;
//
//  // }
//
//   public static double getVideoGame(){
//
//      if (playVideoGame>5){
//
//          System.out.println("You Wast a lot of time in play video Game"+playVideoGame);
//      }
//      return playVideoGame;
//   }
//
//
//   public static double getSleep(){
//
////      if (sleep>8){
////
////          System.out.println("You put a lot hours into sleep. " +sleep+" hours is a lot. Regular hours to sleep is 8hours.");
//      }
//
//      return sleep;
//
//   }

   public double getTimeLeft(){

       result = sleep+study+work+watch_tv+playVideoGame+at_school+pray;




       return day-result;

     }

      public void TellMe() {





         /// WastingHours perDay = new WastingHours();




         System.out.println("How many hours do you sleep per day?");

           while(!(input.hasNextDouble())){

               input.nextLine();

               System.out.println("invalid integer");
           }
         sleep = input.nextDouble();




         System.out.println("How many hours do you work per day?");

          while(!(input.hasNextDouble())){

              input.nextLine();

              System.out.print("invalid integer"+" ");
          }

         work = input.nextDouble();

         System.out.println("How many hours do you spend in watch Tv per day? ");

          while(!(input.hasNextDouble())){

              input.nextLine();

              System.out.print("invalid integer"+" ");
          }
         watch_tv = input.nextDouble();


         System.out.println("If you are at school, how many hours do you spend at school per day? ");
          while(!(input.hasNextDouble())){

              input.nextLine();

              System.out.print("invalid integer"+" ");
          }

         at_school = input.nextDouble();

         System.out.println("If you study, how many hours you spend reading per day? ");
          while(!(input.hasNextDouble())){

              input.nextLine();

              System.out.print("invalid integer"+" ");
          }

         study = input.nextDouble();


         System.out.println("If you play a video game, how many hours you spend on it per day?");
          while(!(input.hasNextDouble())){

              input.nextLine();

              System.out.print("invalid integer"+" ");
          }

         playVideoGame = input.nextDouble();

         System.out.println("How many hours or minutes do you pray and give to Lord God? NOTE: If is in minutes, please enter it example: .30 ");

          while(!(input.hasNextDouble())){

              input.nextLine();

              System.out.print("invalid Integer"+" ");
          }
         pray= input.nextDouble();

     }



     public  void condition(){




       //while(!input.hasNextInt()) {



           //    input.nextLine();
             //   System.out.println(" invalid integer");

                       for (int i = 0; i < 10; i++) // {


                           if (getTimeLeft() < 0 || getTimeLeft() > day) {
                               System.out.println(" The numbers you have entered are out of the bound " + result + " hours. But day only has 24 hours. ");
                               break;


                           } else if (sleep > 8 && watch_tv > 3 && playVideoGame > 3) {

                               System.out.println("you sleep " + sleep + " hours, you watch tv " + watch_tv + " hours, and you play video game " + playVideoGame + " hours. That's not going to take you anywhere my, friend. ");

                               double e = getTimeLeft() + sleep + watch_tv + playVideoGame - 14;

                               System.out.println("Here are the amount of hours you waste per day " + e + " I think this is a lot of hour ");

                               break;
                          } else if (sleep > 8 && watch_tv > 3) {

                               System.out.println("you sleep " + sleep + " hours and you watch tv " + watch_tv + " hours think about your future this is a lot of hours wasted.");

                               double d = getTimeLeft() + sleep + watch_tv - 11;

                               System.out.println("Here are the amount of hours you waste per day " + d + " I think this is a lot of hours.");
                               break;
                           } else if (sleep > 8 && playVideoGame > 3) {

                               System.out.println("you sleep " + sleep + " hours and you play video game " + playVideoGame + " hours think about your future this is a lot of hours wasted.");

                               double f = getTimeLeft() + sleep + playVideoGame - 11;


                               System.out.println("Here are the amount of hours you waste per day " + f + " I think this is a lot of hours. ");
                               break;
                           } else if (watch_tv > 3 && playVideoGame > 3) {

                               System.out.println("you watch tv " + watch_tv + " hours and you play video game " + playVideoGame + " hours think about your future this is a lot of hours wasted.");

                               double h = getTimeLeft() + watch_tv + playVideoGame - 6;


                               System.out.println("Here are the amount of hours you waste per day " + h + " I think this is a lot of hours. ");
                               break;

                           } else if (sleep > 8) {


                               System.out.println("You put a lot hours into sleep. " + sleep + " hours is a lot. Regular hours to sleep is 8hours.");

                               double a = getTimeLeft() + sleep - 8;

                               System.out.println("Here are the amount of hours you waste per day " + a + " I think this is a lot of hours. ");
                               break;
                           } else if (watch_tv > 3) {

                               System.out.println("you expend most your hours in watching Tv. " + watch_tv + " hours is a lot. Don't watch tv more than 3 hours.");

                               double b = getTimeLeft() + watch_tv - 3;

                               System.out.println("Here are the amount of hours you waste per day " + b + " I think this is a lot of hours. ");

                               break;


                           } else if (playVideoGame > 3) {


                               System.out.println("You waste a lot of hours in-play video Game " + playVideoGame + " is a lot hours. Don't play more than 3 hours.");

                               double c = getTimeLeft() + playVideoGame - 3;

                               System.out.println("Here are the amount of hours you wast per day " + c + " I think this is a lot of hours. ");

                               break;

                           } else if (sleep <= 8 && watch_tv <= 3 && getTimeLeft() <= 3) {        // (getTimeLeft()==3||getTimeLeft()==2||getTimeLeft()==1||getTimeLeft()==0){
                               System.out.println("It seems like you don't waste your time. Here are all the hours you waste per day " + getTimeLeft() + " Great.");
                               break;
                           } else if (sleep <= 8 && watch_tv <= 3 && getTimeLeft() >= 10) {


                               System.out.println("Check the hours you have entered. It doesn't look normal. Try again, please. Or find something to keep yourself busy.");


                               double j = day - getTimeLeft();

                               System.out.println(j + " Here are all the hours you have entered.");

                               break;
                           } else {

                               System.out.println("Type something valid. Because the hours you entered is too small.");

                               break;
                           }
                       }


              //     }
         //    }


         /*
             for (double i= 0; i<100; i++){

                 if (i<=3)

                     System.out.println(" It is look like you been using almost all your hours during day."+getTimeLeft());

                     break;
               //  }
                  else
                     System.out.println(" you wast a lot hour during the day "+getTimeLeft());

                     break;


          // getWatch();
                   //  getSleep();
          */
                // }
           //  }


         /*





             }



             else {



                System.out.println("This is amount the of hours that you wast per day. "+getTimeLeft());

                 break;
             }


             }

         System.out.println("This is amount the of hours that you wast per day. "+getTimeLeft());
         }


    //     System.out.println("day only has 24 hours you have entered:"+ result);

      //   }

      //    for (int i =0 ;i<result;i++)
         //  if(i>day){

            //   System.out.println(result);

              // break;

          // }
          //else{



            //   break;
         //  }



   */
          //   }



    // public static void main (String [] args){

   // WastingHours w = new WastingHours();
     //   w.TellMe();
    //  w.condition();




   //  }
}
