package programs;

public class Test2 {
    public static void main(String[] args) {
        int[] input={4, 5, 9, 4, 9, 6, 7, 5, 3};
        int n= input.length;
        int[] result=new int[n];
        int index=0;
        for(int i=0; i<n;i++){
            boolean isDup=false;
            for(int j=0;j<index;j++)
            {
                if(input[i]==result[j])
                {
                    isDup=true;
                    break;
                }
            }
            if(!isDup){
                result[index++]=input[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(result[i]);
        }
    }
}

