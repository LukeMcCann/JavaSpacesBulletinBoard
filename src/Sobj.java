import net.jini.core.entry.*;

public class Sobj implements Entry
{
    public String contents;

    /*
     * Sobj - no arg constructor
     * required for functionality
     */
    public Sobj() {}

    public Sobj(String s) {
        contents = s;
    }
}
