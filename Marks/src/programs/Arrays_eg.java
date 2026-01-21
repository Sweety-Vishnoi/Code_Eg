package programs;

public class Arrays_eg {
    public static void main(String[] args) {
        int[] marks = new int[5];//0 to 4 , Declare and allocated memory
        //print using for loop
        for (int i = 0; i < marks.length; i++) {
            marks[i] = i;
            System.out.println(marks[i]);
        }
        //useless way
        int[] marks1 = {100, 20, 30, 90, 80};//0 to 4 , Declare and initialize
        System.out.println(marks1[3]);

        float[] marks2 = {100, 20, 30, 90, 80};
        System.out.println(marks2[3]);
        System.out.println(marks2.length);

//print using for loop in reverse order
        for (int k = marks2.length - 1; k >= 0; k--) {
            System.out.println(marks2[k]);
        }
//for each loop
        for (float element : marks2)
            System.out.println("Eg for each loop \t " + element);

        //2d eg
        int[][] flats = {{3, 4}, {89, 90}, {87, 88}};
        for (int x = 0; x < flats.length; x++) {
            for (int y = 0; y < flats[x].length; y++) {
                System.out.print("\t"+flats[x][y]);
            }
            System.out.println("\n");
        }
    }

}
