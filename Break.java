package de.gfn.lessons.loopExamples;

public class Break {

        public static void main(String[] args) {

            for (int n = 0; n < 5; n++) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(n + " " + i);
                    if (i == 3) {
                        break;
                    }
                }
                System.out.println("nach innerer Schleife");
            }
            System.out.println("nach beiden Schleifen");


            //*************************************************************

            loop:
            for (int i=0; i<10; i++) {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                        continue loop;
                }

                System.out.println(i);
            }


            //**************************************************************

            //C - CSE, E - ECE, M - Mechanical
            char branch = 'C';
            int collegeYear = 4;
            switch( collegeYear )
            {
                case 1:
                    System.out.println("English, Maths, Science");
                    break;
                case 2:
                    switch( branch )
                    {
                        case 'C':
                            System.out.println("Operating System, Java, Data Structure");
                            break;
                        case 'E':
                            System.out.println("Micro processors, Logic switching theory");
                            break;
                        case 'M':
                            System.out.println("Drawing, Manufacturing Machines");
                            break;
                    }
                    break;
                case 3:
                    switch( branch )
                    {
                        case 'C':
                            System.out.println("Computer Organization, MultiMedia");
                            break;
                        case 'E':
                            System.out.println("Fundamentals of Logic Design, Microelectronics");
                            break;
                        case 'M':
                            System.out.println("Internal Combustion Engines, Mechanical Vibration");
                            break;
                    }
                    break;
                case 4:
                    switch( branch )
                    {
                        case 'C':
                            System.out.println("Data Communication and Networks, MultiMedia");
                            break;
                        case 'E':
                            System.out.println("Embedded System, Image Processing");
                            break;
                        case 'M':
                            System.out.println("Production Technology, Thermal Engineering");
                            break;
                    }
                    break;
            }

            //***************************************************************

            int age = 18;
            switch (age)
            {
                case 16:
                    System.out.println("You are under 18.");
                    break;
                case 18:
                    System.out.println("You are eligible for vote.");
                    break;
                case 65:
                    System.out.println("You are senior citizen.");
                    break;
                default:
                    System.out.println("Please give the valid age.");
                    break;
            }
        }
    }

