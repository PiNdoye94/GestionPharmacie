package sn.gestionpharmacies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.gestionpharmacies.entitie.Pharmacie;
import sn.gestionpharmacies.service.PharmacieServiceImpl;
import java.util.List;


@RestController
@RequestMapping("/pharmacie")
@CrossOrigin
public class ControllerPharmacie {

    @Autowired
    private PharmacieServiceImpl pharmacieServiceImpl;

    @RequestMapping(method=RequestMethod.GET)
    public List<Pharmacie> getAllPharmacies()
    {
        return pharmacieServiceImpl.getAllPharmacies();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Pharmacie getPharmacieById(@PathVariable("id") Long id) {
        return pharmacieServiceImpl.getPharmacie(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Pharmacie createPharmacie(@RequestBody Pharmacie pharmacie) {
        return pharmacieServiceImpl.savePharmacie(pharmacie);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Pharmacie updatePharmacie(@RequestBody Pharmacie pharmacie) {
        return pharmacieServiceImpl.updatePharmacie(pharmacie);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deletePharmacie(@PathVariable("id") Long id)
    {
        pharmacieServiceImpl.deletePharmacieById(id);
    }

}
