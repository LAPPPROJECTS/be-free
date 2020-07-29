package DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

public class CreateAdDTO {

    @NotNull(message = "Please provide a title")
    public String title;

    @NotNull(message = "Please provide a text")
    @Size(max = 50000, message = "Your ad is too long. Try to be brief!")
    public String text;

    @NotNull(message = "You have to add an ID")
    public UUID userId;
}
