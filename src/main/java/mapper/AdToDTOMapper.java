package mapper;

import DTO.AdDTO;
import ad.Ad;
import org.springframework.stereotype.Service;

@Service
public class AdToDTOMapper {
    public AdDTO getAdDto(Ad ad) {
        if (ad == null) {
            return null;
        } else {
            AdDTO adDTO = new AdDTO();
            adDTO.id = ad.getId();
            adDTO.name = "Tytul ogloszenia: " + ad.getName();
            return adDTO;
        }
    }
}
