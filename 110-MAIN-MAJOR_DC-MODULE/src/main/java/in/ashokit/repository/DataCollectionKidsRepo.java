package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.KidsDetailsEntity;

public interface DataCollectionKidsRepo extends JpaRepository<KidsDetailsEntity, Serializable> {

}
