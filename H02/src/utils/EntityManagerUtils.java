package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EntityManagerUtils {
    static EntityManagerFactory emf = null;

    private EntityManagerUtils(){}

    public static EntityManager getEntityManager(){
        emf = Persistence.createEntityManagerFactory("mysqlPU");
        return emf.createEntityManager();
    }

    public static void closeEntityManager(EntityManager em){
        em.clear();
        em.close();
        emf.close();
    }
}
