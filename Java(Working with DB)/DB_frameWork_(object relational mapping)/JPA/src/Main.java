import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import music.Artist;

public class Main {
    public static void main(String[] args) {

        try(var sessionFactory =
                    Persistence.createEntityManagerFactory(
                            "music");
            EntityManager entityManager = sessionFactory.createEntityManager();
        ){

            var transaction = entityManager.getTransaction();
            transaction.begin();

            Artist artist = entityManager.find(Artist.class, 103);                 //to read,search

//            artist.setArtistName("Muddy Waters");                                          // to update   use setter getter
            System.out.println(artist);
//            artist.removeDuplicates();
//            artist.addAlbum("The Best of Muddy Waters");
//            System.out.println(artist);

//            entityManager.remove(artist);                                                //to delete

//            entityManager.persist(new Artist("Muddy Water"));                              //to write

            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}