package mapper;

import DTO.AdDTO;
import model.Ad;
import org.springframework.stereotype.Service;

@Service
public class AdToDTOMapper {
    public AdDTO getAdDto(Ad ad) {
        if (ad == null) {
            return null;
        } else {
            AdDTO adDTO = new AdDTO();
            adDTO.id = ad.getId();
            adDTO.title = String.format("Tytul ogloszenia: %s", ad.getTitle());
            return adDTO;
        }
    }
}
