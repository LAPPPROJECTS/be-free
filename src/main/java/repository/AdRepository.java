package repository;

import ad.Ad;
import com.LAMPP.befree.BeFreeApplication;
import com.LAMPP.befree.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdRepository {
    private List<Ad> adList = new ArrayList<>();

    public AdRepository() {
        adList.add(new Ad("Nazwa ogloszenia", 1234));
        adList.add(new Ad("Inna nazwa ogloszenia", 1333));
    }

    public List<Ad> getAdList() {              //tutaj podpowiada getAdList a poprzednio bylo getAll
        return adList;
    }
    public static Ad getById(int id) {
        return (Ad) adList.stream()
                    .filter(ad -> ad.getId() == id);
                    .findFirst();                     //te dwie nie dzialaja
                    .orElse(null);
    }
    public void addAd(Ad ad) {
        adList.add(ad);
    }
}
