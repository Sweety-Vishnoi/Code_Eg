package programs;

public class Array_1 {
    public static void main(String[] args) {
        float[] marks={54.6f,43.5f,43,90,87.4f};
        float sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
                    }
        System.out.println("Sum of array of marks is: "+sum);
 // or we can do in other way
        sum=0;
        for(float element:marks)
            sum=sum+element;
        System.out.println("Sum of array of marks is: "+sum);

        //reverse of array
        int[] arr={1,2,3,4,5,6};
        int l=arr.length;
        int mid=l/2;
        int temp;

        for(int j=0;j<mid;j++)
        {
            temp=arr[j];
            arr[j]=arr[l-j-1];
            arr[l-j-1]=temp;

        }
        for(int element : arr)
            System.out.print(element+"\t");
    }
}
