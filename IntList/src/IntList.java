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

    public void skippify() {
        IntList p = this;
        int n = 1;
        while (p != null) {
            IntList next = p.rest;
            for(int i = 0; i < n; i++) {
                if(next == null) {
                    break;
                }
                next = next.rest;
            }
            p.rest = next;
            p = p.rest;
            n++;
        }
    }
    /**
      * Given a sorted linked list of items - remove duplicates.
      * For example given 1 -> 2 -> 2 -> 2 -> 3,
      * Mutate it to become 1 -> 2 -> 3 (destructively)
      */
    public static void removeDuplicates(IntList head) {
        if(head == null) return;
        IntList prev = head;
        IntList cur = head.rest;
        while(cur != null) {
            if(cur.first == prev.first) {
                prev.rest = cur.rest;
            }else {
                prev = cur;
            }
            cur = cur.rest;
        }
    }
}
