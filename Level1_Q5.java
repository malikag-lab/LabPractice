//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
public class Level1_Q5 {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        int pensForEach=pens/students;
        int remainingPens=pens%students;

        System.out.println("The Pen Per Student is "+pensForEach+" and the remaining pen not distributed is "+remainingPens);
    }
}
