package cz.anarchangel.vapedb.service.impl;

import cz.anarchangel.vapedb.model.Vape;
import cz.anarchangel.vapedb.repository.VapeRepository;
import cz.anarchangel.vapedb.service.VapeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
@Service
@RequiredArgsConstructor
public class VapeServiceImpl implements VapeService {

    @Autowired
    private VapeRepository repository;

    @Override
    public List<Vape> getVapes() {
        return repository.findAll();
    }

    @Override
    public Vape getVape(String id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Vape with id " + id + " not found"));
    }

    @Override
    public void addVape(Vape vape) {
        repository.save(vape);
    }

    @Override
    public void updateVape(Vape vape) {
        repository.save(vape); // TODO: don't save the whole object, just update the fields that were changed
    }

    @Override
    public void deleteVape(String id) {
        repository.deleteById(id);
    }

}
