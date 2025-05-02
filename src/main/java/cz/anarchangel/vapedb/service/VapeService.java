package cz.anarchangel.vapedb.service;

import cz.anarchangel.vapedb.model.Vape;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
public interface VapeService {

    List<Vape> getVapes();

    Vape getVape(String id);

    void addVape(Vape vape);

    void updateVape(Vape vape);

    void deleteVape(String id);

}
