package repository;

import model.Ad;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public class AdRepository {
    public List<Ad> adList = new ArrayList<>();

    public AdRepository() {
        adList.add(new Ad("Tytul", "text", UUID.randomUUID()));
        adList.add(new Ad("Inna nazwa ogloszenia", "innyText", UUID.randomUUID()));
    }

    public Ad getById(UUID id) {
        return adList.stream()
                .filter(ad -> ad.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addAd(Ad ad) {
        adList.add(ad);
    }

    public List<Ad> getAll() {
        return adList;
    }
}
