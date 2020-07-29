package mapper;

import DTO.ShowAdDTO;
import model.Ad;
import org.springframework.stereotype.Service;

@Service
public class AdToDTOMapper {
    public ShowAdDTO getAdDto(Ad ad) {
        if (ad == null) {
            return null;
        } else {
            ShowAdDTO showAdDTO = new ShowAdDTO();
            showAdDTO.id = ad.getId();
            showAdDTO.title = String.format("Tytul ogloszenia: %s", ad.getTitle());
            return showAdDTO;
        }
    }
}
