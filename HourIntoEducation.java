
/**

  This code will tell the user all the information users need to know about their education,
  such as hours, days, months, years that users have put into the education program.
   Also, how old the user was when they first started school.
            */
import java.util.Scanner;

public class HourIntoEducation {

    // those are my instance variables
   public static  InformationSavings info = new InformationSavings();

    public static int year;
    public static int month;
    public  static  int day;
    public static  int week;
    public  static  int hours;
    public  static   int minutes;
    public static  int seconds;
    public static int education_hours;
    public   static int sum;
    public static int calculate;
    public static int age;
     public static int answer;
     public static int total_hours;
    public static int total_weeks;
     public static int youth;


    static final int academic_year=9;

   public static  int total_days;   // if you add the numbers of days from September to May = 274 days

    public static int weekends_vacation; // I will subtract the weekends and vacations days from the school hours. which is approximately to 78 days


   public static String name;

    // this is my constructor;

     HourIntoEducation(int y, int m, int d, int td, int wv, int ed , int w, int min,int sec) {

        year = y;
        month = m;
        day = d;
        total_days= td;
        weekends_vacation= wv;
        education_hours= ed;
        total_weeks = w;
          minutes = min;

          seconds = sec;

      }


    // this method will calculate the hours
    public  int getTotalHours(){

         calculate = day-18;       // day- 18 = 6 and 6 is the numbers hours in school per day.


         return calculate*month*9; // is 6times30 day 1month times 9 which is full school yeas.

        // the total hours are calculate down in the method answer().



        }

        // This will return the minutes
      public int getMinutes(){

        return total_hours*minutes;


    }

    // This method will calculate the second

      public int getSeconds(){

          return getMinutes()*seconds;
      }

    // this method will tell the user how many days the user went to school.
    public  double getTotalDays(){
        double days = total_hours/education_hours;   // example if you went to school for 2 days. totalhours = 12 and educatiohours=2  so 12/6 = 2 days


        return days;



    }
      // will calculated the weeks.
    public double getTotalWeeks(){


      double weeks = getTotalDays()/total_weeks;

      return weeks;
    }

    // this will calculated the total months.
   public double getTotalMonth(){

       double months = getTotalDays()/month;


       return months;

   }
// this line will calculate academic year
    public double getTotalYear(){

         double years = getTotalMonth()/academic_year;     // if you go to school for 9 = 1 academic year.

         return years;
    }

      // conclusion
    public static void Answer() {


        for (int i = 0; i < 100; i++) {


        Scanner input = new Scanner(System.in);

        HourIntoEducation inEducation = new HourIntoEducation(365,31, 24, 274, 78,6,7,60,60);


        //sum = total_days-weekends_vacation;                    // this line will subtract the days that the students don't go to school including weekends and vacations.


       info.name();

        name = input.nextLine();

        info.age();


            while(!input.hasNextDouble()) {

                input.nextLine();

                System.out.println(" invalid integer.");

                }
                age = input.nextInt();


            info.schoolYear();


            while(!input.hasNextDouble()) {

                input.nextLine();

                 System.out.print(" Try again. Invalid Integers. \r");

            }

              int school_year = input.nextInt();
          //  }






        if (age <= school_year){



            System.out.println("Invalid: your school year cannot be equal to or greater than your age.");
            break;



        }

            total_hours = inEducation.getTotalHours() * school_year - weekends_vacation;   // this line will calculate your total hours based on your school level.

            //Example: 6*31*9*12-78 = 20010hours  the number 12 is your senior year in high school. 78 is the numbers off the days that students don't go to school.
            // if you go to school for one year 6*31*9*1-78 = 1596hours.


            // it will do the sum to tell the user how hold he/she was when they first stated school.

            youth = age - school_year - 1;


            info.begunSchool();


                if (youth <= 5) {

                    info.early();
                    info.summary();

                    break;

                } else {

                    info.late();
                    info.summary();
                    break;
                }
            }

        }





        // this line will return the total hours that the individual put n.


        public static void main (String []args){

         info.tell();

         Answer();




             /** Conditions */
            Scanner ask = new Scanner (System.in);

          info.nextClass();

           while(!ask.hasNextBoolean()){


                  ask.nextLine();

              info.invalid();

           }

          boolean b = ask.nextBoolean();
            for (int i = 0; i<20; i++)


          if(b ==false){

             info.dontWant();
              break;

          }

          else{



            info.explain();



              /** Calling the WastinHours class */


               WastingHours   waste = new WastingHours();

              waste.TellMe();

              waste.condition();
              break;


          }
              info.thanks();
      }
    }






