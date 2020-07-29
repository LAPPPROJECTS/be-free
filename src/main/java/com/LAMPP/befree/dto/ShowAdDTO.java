package DTO;

import com.LAMPP.befree.model.AdLifeCycle;

import java.time.LocalDateTime;
import java.util.UUID;

public class ShowAdDTO {
    public UUID id;
    public String title;
    public String text;
    public UUID userId;
    public LocalDateTime createdOn;
    public AdLifeCycle adLifeCycle;
}

