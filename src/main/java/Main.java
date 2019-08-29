
public class Main {
    public static void main (String[] args){
        Compare compare = new Compare();
        if (compare.compare(args[0], args[1])){
            System.out.println("The words are the same");
        } else {
            System.out.println("Words were not the same");
        }

    }
}
