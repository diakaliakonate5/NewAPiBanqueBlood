package com.BanqueBlood.Banque_Blood.controller;

import com.BanqueBlood.Banque_Blood.model.Demande;
import com.BanqueBlood.Banque_Blood.model.Vue;
import com.BanqueBlood.Banque_Blood.services.VueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Vue")
@RestController
@CrossOrigin("*")
public class VueController {
    @Autowired
    VueService vueService;

    @PostMapping("save")
    public String saveVue(@RequestBody Vue vue){
        this.vueService.addVue(vue);
        return "Enregistrement effectué avec succès...";
    }

    @GetMapping("vue/{id}")
    public Vue getVue(@PathVariable("id") Long id){
        return this.vueService.getVueById(id);
    }

    @GetMapping("list")
    public List<Vue> getListVue(){
        return this.vueService.getListVue();
    }

    @PostMapping("VueByDemande")
    public List<Vue> VueByDemande(@RequestBody Demande demande){
        return this.vueService.getVueByDemande(demande);
    }
    @PostMapping("/Vue/listNotVue/{iduser}")
    public List<Vue> VueByDemande(@RequestBody Demande demande,@PathVariable("iduser") Long iduser){
        return this.vueService.getVueByDemande(demande);
    }
}
