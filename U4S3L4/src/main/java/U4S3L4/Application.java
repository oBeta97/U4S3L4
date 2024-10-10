package U4S3L4;

import U4S3L4.dao.BaseDAO;
import U4S3L4.entities.AthleticsCompetition;
import U4S3L4.entities.Event;
import U4S3L4.entities.Location;
import U4S3L4.entities.Person;
import U4S3L4.enums.EventType;
import U4S3L4.enums.Genders;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    private static final EntityManagerFactory U4S3L3Factory = Persistence.createEntityManagerFactory("u4s3l4");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManager em = U4S3L3Factory.createEntityManager();

        BaseDAO bd = new BaseDAO(em);

        try {
            Location l = bd.getObjectById(Location.class, "e2515596-9fa3-4d75-b4c8-24c947acee89");

            Person p = bd.getObjectById(Person.class, "dc0cda85-b08f-4922-a63d-9d7ccd4b18fb");

            AthleticsCompetition ac = bd.getObjectById(AthleticsCompetition.class, "d9eefed1-4e4e-4f5c-9c02-de44d247f0e1");

            bd.save(ac);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        System.out.println("END! :(");
    }
}
