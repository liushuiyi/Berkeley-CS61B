public class IntList {

    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the value of input index */
    public int get(int index) {
        if(index == 0) {
            return first;
        }
        return this.rest.get(index - 1);
    }
    // 5, 10, 15
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.get(1));
    }
}
