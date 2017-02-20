package net.zoms.jwt.football.repository;

import net.zoms.jwt.football.model.Football;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootballRepository extends MongoRepository<Football,String>{

}
