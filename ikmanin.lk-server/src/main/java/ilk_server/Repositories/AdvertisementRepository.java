package ilk_server.Repositories;

import ilk_server.DataModels.Advertisement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends MongoRepository<Advertisement, String> {

    List<Advertisement> findByCategoryContaining(String category);
}
