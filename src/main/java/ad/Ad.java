package ad;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect
public class Ad implements Serializable {

    private String title;
    private int id;

    public Ad(String title, int id) {
        this.title = title;
        this.id = id;
    }
    //przed get i set wstawiona pusta metoda Ad (poniżej)

    public Ad() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void getName() {       //dodana pusta metoda getName - w przeciwnym razie pokazuje blad w AdToDTOMapper w linijce 15
    }
}
