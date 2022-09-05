package com.api.docerialindoces.repositories;

import com.api.docerialindoces.models.ConfeiteiroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConfeiteiroRepository extends JpaRepository<ConfeiteiroModel, UUID> {
}