package fr.example.establishment.internal.repository;

import fr.example.establishment.internal.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, UUID> {

    List<Activity> findAllByEstablishmentId(UUID establishmentId);
}
