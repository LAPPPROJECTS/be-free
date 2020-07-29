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
            showAdDTO.title = ad.getTitle();
            showAdDTO.text = ad.getText();
            showAdDTO.userId = ad.getUserId();
            showAdDTO.createdOn = ad.getCreatedOn();
            showAdDTO.adLifeCycle = ad.getAdLifeCycle();
            return showAdDTO;
        }
    }
}
