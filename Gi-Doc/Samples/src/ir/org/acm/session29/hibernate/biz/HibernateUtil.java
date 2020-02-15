package ir.org.acm.session29.hibernate.biz;

import ir.org.acm.session29.hibernate.entity.BankAccount;
import org.hibernate.service.ServiceRegistryBuilder;
import ir.org.acm.session29.hibernate.entity.BankAccount;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static {
        
        try {
            Configuration configuration = new Configuration();
            //configuration.addResource("mydir/mapping.hbm.xml");
            //configuration.configure();
            configuration.configure("/ir/org/acm/session29/hibernate/hibernate.cfg.xml");
            configuration.addClass(BankAccount.class);
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            //serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (HibernateException he) {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    } 
    
}