public class Datatypes {
    public static void main(String[] args) {
        byte myNum = 100;  //1 byte	 Stores whole numbers from -128 to 127
        short myNumByte = 5000;  // 2 bytes	Stores whole numbers from -32,768 to 32,767
        int myNumInt = 100000; // 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myNumLarge = 15000000000L; // 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myNumFloat = 5.75f; //4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double myNumDouble = 19.99d; //	8 bytes	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean isJavaFun = true; // 1 bit	Stores true or false values
        boolean isFishTasty = false; // 1 bit	Stores true or false values
        char myGrade = 'B';  // 2 bytes	Stores a single character/letter or ASCII values

        String name = "Thilipan";

        System.out.println(myNum);
        System.out.println(myNumByte);
        System.out.println(myNumInt);
        System.out.println(myNumLarge);
        System.out.println(myNumFloat);
        System.out.println(myNumDouble);
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        System.out.println(myGrade);
        System.out.println(name);
    }
}
