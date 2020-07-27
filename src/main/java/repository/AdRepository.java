package repository;

import model.Ad;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class AdRepository {
    public List<Ad> adList = new ArrayList<>();

    public AdRepository() {
        adList.add(new Ad("Nazwa ogloszenia", 1234));
        adList.add(new Ad("Inna nazwa ogloszenia", 1333));
    }

    public void setAdList(Collection<Object> adList) {
        // adRepository.adList = adList;
    }

    public List<Ad> getAdList() {              //tutaj podpowiada getAdList a poprzednio bylo getAll
        return adList;
    }
    public Ad getById(int id) {
        return (Ad) adList.stream()
                    .filter(ad -> ad.getId() == id)
                    .findFirst()
                    .orElse(null);
    }
    public void addAd(Ad ad) {
        adList.add(ad);
    }

    public void setAdList(List<Ad> adList) {
        this.adList = adList;
    }

    public List<Ad> getAll() {
        return null;
    }
}
