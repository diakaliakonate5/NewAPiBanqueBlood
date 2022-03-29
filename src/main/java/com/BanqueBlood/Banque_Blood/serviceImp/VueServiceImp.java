package com.BanqueBlood.Banque_Blood.serviceImp;

import com.BanqueBlood.Banque_Blood.model.Demande;
import com.BanqueBlood.Banque_Blood.model.Vue;
import com.BanqueBlood.Banque_Blood.repository.VueRepository;
import com.BanqueBlood.Banque_Blood.services.VueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VueServiceImp implements VueService {
    @Autowired
    VueRepository vueRepository;

    @Override
    public void addVue(Vue vue) {
        this.vueRepository.save(vue);
    }

    @Override
    public Vue getVueById(Long id) {
        return this.vueRepository.getById(id);
    }

    @Override
    public List<Vue> getListVue() {
        return this.vueRepository.findAll();
    }

    @Transactional
    @Override
    public Vue editVue(Long id, Vue vue) {
        Vue vue1 = vueRepository.getById(id);
        vue1.setUtilisateur(vue.getUtilisateur());
        vue1.setDemande(vue.getDemande());
        vue1.isVue();
        return  vue1;
    }

    @Override
    public List<Vue> getVueByDemande(Demande demande) {
        return vueRepository.getVueByDemande(demande);
    }
}
