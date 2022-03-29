package com.BanqueBlood.Banque_Blood.services;

import com.BanqueBlood.Banque_Blood.model.Demande;
import com.BanqueBlood.Banque_Blood.model.Vue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VueService {
    public void addVue(Vue vue);
    public Vue getVueById(Long id);
    public List<Vue> getListVue();
    public Vue editVue(Long id, Vue vue);
    public List<Vue> getVueByDemande(Demande demande);
}
