public class InformationSavings {


    HourIntoEducation inEducation = new HourIntoEducation(365, 31, 24, 274, 78,6,7,60,60);

    public void tell (){
        System.out.println();
        System.out.println("\tIf you enter, your name, your age, and your school year.\n I will tell you how many hours,minutes, seconds, days, weeks, months,years, and how old you were when you first started school.");

        System.out.println();

        }

        public void name(){

            System.out.println("Enter your name please:");
        }

        public void age(){
            System.out.println("Enter your age:");
        }

        public void schoolYear(){
            System.out.println("Enter the total number of years you have been in school. Including college, if you attend it. ");

        }
     public void begunSchool(){

         System.out.println("Based on your age and your school year " + HourIntoEducation.name + ": begun school when you were, " + HourIntoEducation.youth + " years old.");


         System.out.println("-------------------------------------------------------------------------------------------------");
     }

        public void early(){
            System.out.println(HourIntoEducation.name + ", You begum school early that's great.");

        }
        public void late(){

            System.out.println(HourIntoEducation.name + " it seems that you started school late. I think the best age to start school is between 2-5.");
        }

        public void summary(){

            System.out.println( " you have put " + HourIntoEducation.total_hours + "hours, "+inEducation.getMinutes()+"minutes, and "+inEducation.getSeconds()+ "seconds into your education.");


            System.out.println("-----------------------------------------------------------------------");



            System.out.println(" based on your academic year you did go to school for:"+inEducation.getTotalDays()+" days");





            System.out.println(" you went to school for "+inEducation.getTotalWeeks()+" Weeks");



            System.out.println("---------------------------------------------------------------------------------------------------");


            System.out.println(" you went to school for "+inEducation.getTotalMonth()+" Months.");

            System.out.println("---------------------------------------------------------------------------------------------------");

            System.out.println(" Your total academic year are "+ inEducation.getTotalYear()+ " years.");



        }

        public void thanks (){

            System.out.println("Thank you for using this program. Let me know if you have any question "+HourIntoEducation.name+". Good bye!");
        }

        public void nextClass(){

            System.out.println("\n Enter true if you want to know how many hours you waste per day or false if you don't want to know. ");

        }

          public void invalid(){

              System.out.println("invalid boolean. Please type true or false.");
          }

           public void dontWant(){

               System.out.println("Thank you "+HourIntoEducation.name+"  and have a bless day.");
           }

           public void explain(){

               System.out.println("Hi "+ HourIntoEducation.name+ ". Enter zero (0) hours if you don't put your time into some question." );
           }

}
