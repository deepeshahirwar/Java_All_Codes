import java.util.ArrayList;

public class Power_Set_OfArr {

    static void printSubset(ArrayList<Integer> input, ArrayList<Integer> output, int idx) {
        // for base case me print karne liye
        if (idx >= input.size()) {
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        // nahi lena hai
        printSubset(input, output, idx + 1);
        // lena hai
        output.add(input.get(idx));
        printSubset(input, output, idx + 1);

    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        input.add(1);
        input.add(2);
        input.add(3);

        printSubset(input, output, 0);
    }
}
