package service;

import DTO.AdDTO;
import model.Ad;
import mapper.AdToDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AdRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdService {

    AdRepository adRepository;
    AdToDTOMapper adToDTOMapper;

    @Autowired
    public AdService(AdRepository adRepository, AdToDTOMapper adToDTOMapper) {
        this.adRepository = adRepository;
        this.adToDTOMapper = adToDTOMapper;
    }

    public List<AdDTO> getAll() {
        List<Ad> ads = adRepository.getAll();
        Ad ad = new Ad();
        return ads.stream().map(cart -> adToDTOMapper.getAdDto(ad)).collect(Collectors.toList());
    }

    public AdDTO getId(int id) {
        Ad ad = adRepository.getById(id);
        return adToDTOMapper.getAdDto(ad);
    }

    public void addAd(AdDTO adDTO) {
        Ad ad = new Ad(adDTO.title, adDTO.id);
        adRepository.addAd(ad);
    }
}

