

import java.util.*;


class ClassAssignment2 {

    // Question . 1
    // Starting from 0th digit, code must be
    // 10 digits with 2 dashes at index 3 and 6
    public static boolean validateSSN(String ssn){
        for(int i = 0; i < ssn.length() - 1; i++){
            if(i == 3 || i == 6) continue;
            else {
                if(Character.isDigit(ssn.charAt(i))) continue;
                return false;
            }
        }
        return ((ssn.length() - 1) == 10) &&
                (ssn.charAt(3) == '-') &&
                (ssn.charAt(6) == '-');
    }

    // Question . 2
    // M,C,I Majors and 1,2,3,4 Status
    public static void majorsStatus(){
        String major, status;
        System.out.print("Enter 2 characters for your major-status: ");
        String s = new Scanner(System.in).next();
        char[] chars = {s.charAt(0), s.charAt(1)};
        switch(chars[0]){
            case 'M': major = "Mathematics"; break;
            case 'C': major = "Computer"; break;
            case 'I': major = "IT"; break;
            default: major = "Undefined"; break;
        }
        switch(chars[1]){
            case '1': status = "Freshman"; break;
            case '2': status = "Sophomore"; break;
            case '3': status = "Junior"; break;
            case '4': status = "Senior"; break;
            default: status = "Undefined"; break;
        }
        System.out.println(major + " " + status);
    }
    


    // Question . 3
    // Generate car plate number in format: ABC 1234
    public static String generatePlateNo(){
        String no = "";
        for(int l = 0; l < 3; l++) no += (char)((int)'A' + Math.random() * (int)'Z');
        no += " ";
        for(int l = 0; l < 4; l++) no += (char)((int)'0' + Math.random() * (int)'9');
        return no;
    }


    // Question . 4
    // Decimal to Binary
    public static String dec2bin(int decimal){
        String binaryNumber = "";
        for(int quotient = decimal; quotient != 0; quotient /= 2)
            binaryNumber += quotient % 2;
        return binaryNumber;
    }


    // Question . 5
    // Creating separate class for this question,
    // for this question is complex...

}

class Question5 {
    static String[] questions = {

                    "Question 1. What is the greenhouse effect??\n"+
                    "Select Options:\n"+
                    "1. Certain gases in the atmosphere trap heat and warm the Earth\n"+ // CORRECT
                    "2. Life on Earth 'exhales' gas that warms up the atmosphere\n"+
                    "3. The tilt of the Earth changes the amount of solar energy the Earth receives\n"+
                    "4. The Sun is putting out more radiant energy over time\n\n"
            ,

                    "Question 2. Which activities are the largest contributors of greenhouse gases??\n"+
                    "Select Options:\n"+
                    "1. Deforestation\n"+
                    "2. Transportation \n"+ // CORRECT
                    "3. Agriculture\n"+
                    "4. Industry\n\n"
            ,

                    "Question 3. How has the global average temperature changed since the Industrial Revolution??\n"+
                    "Select Options:\n"+
                    "1. Cooler by 0.1 degree C (0.2 degree F)\n"+
                    "2. The temperature has gone up and down, but remains overall the same\n"+
                    "3. Warmer by 0.1 degree C (0.2 degree F)\n"+
                    "4. Warmer by more than 1 degree C (2.1 degrees F)\n\n" // correct
            ,

                    "Question 4. How does the rate of today's warming compare to previous episodes of rapid climate change on Earth??\n"+
                    "Select Options:\n"+
                    "1. Today's climate warming is about as fast as the temperature swings that have happened in Earth's past.\n"+
                    "2. Past changes in the climate have been faster than the changes we're seeing today.\n"+
                    "3. Today, the Earth's climate is changing much faster than it has changed in the past.\n"+ // correct
                    "4. N/A\n\n"
            ,

                    "Question 5. When was the last time in Earth's history that CO2 was as high as it is now??\n"+
                    "Select Options:\n"+
                    "1. This is the highest it's ever been\n"+
                    "2. CO2 was at least this high during the warm periods between the ice ages\n"+
                    "3. CO2 has not been this high for almost one million years.\n"+
                    "4. The last time CO2 was this high was 3 million years ago.\n\n" // CORRECT
            ,
    };

    public static void takeQuiz(){
        int score = 0;
        // Print quiz
        Scanner s = new Scanner(System.in);
        System.out.println("Mujtaba Quiz Taker\nWelcome\n\nQuestions:\n\n");
        for(int i = 0; i < 5; i++){
            System.out.print(questions[i]);
            int selectedOption = s.nextInt();
            // Correct answers for questions (in order): 1,2,4,3,4
            switch(i){
                case 0: score += selectedOption == 1 ? 1 : 0; break;
                case 1: score += selectedOption == 2 ? 1 : 0; break;
                case 2: score += selectedOption == 4 ? 1 : 0; break;
                case 3: score += selectedOption == 3 ? 1 : 0; break;
                case 4: score += selectedOption == 4 ? 1 : 0; break;
                default: {
                    System.out.println("\nInvalid Option!\nRe-taking this Question\n");
                    i--; break;
                }
            }
        }
        System.out.println("\nYour score: " + score + "\n");
    }
}









public class Main {
    public static void main(String [] args){
        System.out.println("Validate: 325-54-1234 : " + ClassAssignment2.validateSSN("325-54-1234"));
        System.out.println("");
        ClassAssignment2.majorsStatus();
        System.out.println("");
        System.out.println("Generating Plate no. : " + ClassAssignment2.generatePlateNo());
        System.out.println("");
        System.out.println("Decimal to Binary for 1234 : " + ClassAssignment2.dec2bin(1234));
        System.out.println("");
        Question5.takeQuiz();
    }
}