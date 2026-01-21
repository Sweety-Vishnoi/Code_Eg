package programs;

public class Garbage_collection {
        public void finalize(){
            System.out.println("object is garbage collected");
        }
        public static void main(String args[]){
            Garbage_collection s1=new Garbage_collection();
            Garbage_collection s2=new Garbage_collection();
            s1=null;
            s2=null;
            System.gc();
        }
}
