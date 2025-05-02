package cz.anarchangel.vapedb.repository;

import cz.anarchangel.vapedb.model.Vape;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
@Repository
public interface VapeRepository extends MongoRepository<Vape, String> {
}
