public class IntList
{
    public int first;
    public IntList rest;

    /* Constructor */
    public IntList(int f, IntList r)
    {
        first = f;
        rest = r;
    }

    /* Return the size of the IntList */
    public int size()
    {
        if (rest == null)
        {
            return 1;
        }
        return 1 + rest.size();
    }

    /* Get the ith item in the list */
    // Iterative solution
    public int get_iterative(int i)
    {
        IntList l = this;
        int count = 0;
        while (count != i)
        {
            l = l.rest;
            ++count;
        }

        return l.first;
    }

    // Recursive solution
    public int get_recursive(int i)
    {
        if (i == 0)
        {
            return first;
        }
        return rest.get_recursive(i - 1);
    }

    public static void main(String[] args)
    {
        IntList l = new IntList(5, null);
        System.out.println(l.get_iterative(0));
    }
}
