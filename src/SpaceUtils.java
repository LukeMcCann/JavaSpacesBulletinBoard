import net.jini.space.JavaSpace;
import net.jini.core.transaction.server.TransactionManager;
import java.rmi.RMISecurityManager;
import net.jini.core.discovery.LookupLocator;
import net.jini.core.lookup.ServiceRegistrar;
import net.jini.core.lookup.ServiceTemplate;

// Reminder: replace localhost with location

public class SpaceUtils
{

    public static JavaSpace getSpace(String hostname)
    {
        JavaSpace jSpace = null;
        try
        {
            ServiceRegistrar sr = unicastServiceLookup(hostname);

            Class c = Class.forName("net.jini.space.JavaSpace");
            Class[] classTemplate = {c};

            jSpace = (JavaSpace)
                    sr.lookup(new ServiceTemplate(null,
                            classTemplate, null));

        }
        catch(Exception e)
        {
            System.err.println("Error: " + e);
        }
        return jSpace;
    }

    public static JavaSpace getSpace() {return getSpace("localhost");}

    /*
     * getTransactionManager()
     * @param String hostname
     * @return TransactionManager
     * check security manager exists
     * create transaction manager
     */
    public static TransactionManager getTransactionManager(String hostname)
    {
        if(System.getSecurityManager() == null)
        {
            System.setSecurityManager(new RMISecurityManager());
        }

        TransactionManager tm = null;
        try
        {
            LookupLocator l = new LookupLocator("jini://" + hostname);

            ServiceRegistrar sr = l.getRegistrar();

            Class c = Class.forName("net.jini.core.transaction.server.TransactionManager");
            Class[] classTemplate = {c};

            tm = (TransactionManager) sr.lookup(new ServiceTemplate(null,
                    classTemplate, null));

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        return tm;
    }

    public static TransactionManager getTransactionManager() {return getTransactionManager("localhost");}

    /*
     * unicastServiceLookup
     * @param String hostname
     * @return ServiceRegistrar
     * uses unicast protocol to discover and return service
     */
    public static ServiceRegistrar unicastServiceLookup(String hostname)
    {
        ServiceRegistrar sr = null;
        try
        {
            LookupLocator l = new LookupLocator("jini://" + hostname);
            sr = l.getRegistrar();

            return sr;
        }
        catch(Exception e)
        {
            System.err.println("Error: " + e);
        }
        return sr;
    }
}
