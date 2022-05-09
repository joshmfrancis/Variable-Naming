// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_1_2
// File Name: Simple.java

// This program prints identifiers and prints under it my explaination why I believe it is a good identifier or not.
public class Simple {

    public static void main(String[] args) {

        System.out.println("simple");                                           // Prints identifier
        System.out.println("simple would not be a good identifier, as it does "
                + "not follow the convention style of naming identifiers. "
                + "It does not start with a capital letter. When changing the "
                + "class to this it returns the error, The first letter of "
                + "Java type should be in upper case.");                        // Prints explanation

        System.out.println("SimpleProgram");                                    // Prints identifier
        System.out.println("SimpleProgram would be a good identifier, as it "
                + "does follow the convention style of naming identifiers. "
                + "It begins with a capital letter and is easy to "
                + "differentiate from other programs.");                        // Prints explanation

        System.out.println("1 Simple");                                         // Prints identifier
        System.out.println("1 Simple would not be a good identifier, as it does"
                + " not follow the convention style of naming identifiers. "
                + "It does not start with a capital letter and contains "
                + "spaces. When changing the class to this it returns the "
                + "error, '1 Simple' is not a valid Java identifier.");         // Prints explanation

        System.out.println("Simple_");                                          // Prints identifier
        System.out.println("Simple_ would not be a good identifier, as it might"
                + " confuse the reader with another indetifier 'Simple'. "
                + "Usually a underscore is there to signify a space. "
                + "The program does accept it as a class identifier, "
                + "but I believe that it just serves to confuse.");             // Prints explanation

        System.out.println("*Simple*");                                         // Prints identifier
        System.out.println("*Simple* would not be a good identifier, "
                + "as it does not follow the convention style of naming "
                + "identifiers. It does not start with a capital letter and it"
                + " returns the error, '*Simple*' is not a valid "
                + "Java identifier.");                                          // Prints explanation

        System.out.println("$123_45");                                          // Prints identifier
        System.out.println("$123_45 would not be a good identifier, "
                + "as it does not describe the program, '$' character "
                + "should be used only in mechanically generated code, and "
                + "it does not start with a capital letter.");                  // Prints explanation

        System.out.println("Simple!");                                          // Prints identifier
        System.out.println("Simple! would not be a good identifier, "
                + "as it is not a valid idnetifier name. When changing the "
                + "class to this it returns the error, 'Simple!' is not a "
                + "valid Java identifier.");                                    // Prints explanation

    }

}
