//OBJECT CALISTHENICS
//Programming exercises known as "Object Calisthenics" were created by Jeff Bay and codified as a set of 9 rules in his book
“The ThoughtWorks Anthology”.
//Object Oriented Programming is associated with the term "object." The word "calisthenics,
//" which denotes exercises in the context of gymnastics, is borrowed from the Greek language.
//It doesn’t mean you have to follow all these rules, all the time. Find your balance with these rules, 
use some of them only if you feel comfortable with them.

//        The 9 rules :
//
//        Only 1 level of indentation per method
//        Don’t use the ELSE keyword
//        Wrap all Primitives and Strings
//        First class collections
//        One dot per line
//        Keep all entities small
//        Don’t abbreviate
//        No classes with more than two instance variables
//        No getters/setters/properties


import java.util.ArrayList;

public class Tech1 {
    //    Only 1 level of indentation per method
    public int one() {
        int i, j, k = 0;
        for (i = 0; i < 5; i++) {
            loopForJ(i);
        }
        return k;
    }//    more readability

    private void loopForJ(int i) {
        int k = 0;
        for (int j = 0; j < 5; j++) {
            if (i == j) {
                k++;

            }
        }
    }

    //    Don’t use the ELSE keyword
    public String two(int number) {
        if (number > 0) {
            return "Positive";
        }
        if (number < 0) {
            return "Negative";
        }
        return "Zero is None";

    }//    more readability

    //    Wrap all Primitives and Strings
    public int three() {
        Address address {
            int HouseNumber = 112;
            String street = "Fellow Street";
            String city = "Lucknow";
            String state = "U.P.";
            int pinCode = 254001;

        }//    represent clear intention and makes it easier to read, avoid behaviour scattering

        //    First class collections
        public void four () {
            class Person1 {
                private int code;
                private String Name;
            }
            class Person2 {
                private ArrayList<Integer> jobs;
            }
            class Person3 {
                private ArrayList<Integer> leaves;
            }
        }//    centralizes the behaviors related to the specific collection in a class,
        //    and each collection gets wrapped in its own class.

        //    One dot per line
        public int five () {
            String a = " Qwerty    ", c;
            int d;
            int b = a.trim().replace('e', 'a').indexOf('a');
            a = a.trim();
            c = a.replace('e', 'a');
            d = c.indexOf(c);
            return d;
        }//  less confusion, more readability


        //    Keep all entities small
        //    maximum 50 lines code for each class
        //    easy to read, understand, maintain.


        private int factorial ( int number){
            if (number == 0 || number == 1) {
                return 1;
            }
            return (number * factorial(number - 1));
        }

        //    Don’t abbreviate
        public int seven () {
            int number = 5, result;
            result = factorial(number);
            return result;
        }//    more readability

        //    No classes with more than two instance variables
        public void eight () {
            class Employee {
                class Name {
                    String firstName;
                    String lastName;
                }

                int employeeCode;
            }
        }//    high cohesion, and better encapsulation

        //    No getters/setters/properties
        public void nine () {
            class Game {
                int score;

                public void setScore(int score) {
                    this.score = score;
                }

                public int getScore() {
                    return score;
                }
            }
        }//    force you to follow the "Tell, don't ask" principle of OOPS
    }
}
