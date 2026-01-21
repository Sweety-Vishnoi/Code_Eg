public class test {

    public static void main(String[] args) {
        String[] in={"CODE","CODE","TECH","MACHINE"};
        for(int i=0;i<in.length;i++)
        {
            for(int j=i+1;j<in.length;j++)
            {
                if(in[i].equals(in[j])){
                    System.out.println("Duplicate: "+in[i]);
                }
            }
        }
    }

}