package com.BanqueBlood.Banque_Blood.repository;
import com.BanqueBlood.Banque_Blood.model.Demande;
import com.BanqueBlood.Banque_Blood.model.Vue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueRepository extends JpaRepository<Vue, Long> {
    List<Vue> getVueByDemande(Demande demande);
}
