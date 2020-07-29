package service;

import DTO.ShowAdDTO;
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

    public List<ShowAdDTO> getAll() {
        List<Ad> ads = adRepository.getAll();
        return ads.stream().map(ad -> adToDTOMapper.getAdDto(ad)).collect(Collectors.toList());
    }

    public void addAd(ShowAdDTO showAdDTO) {
        Ad ad = new Ad(showAdDTO.title, showAdDTO.id);
        adRepository.addAd(ad);
    }
}
