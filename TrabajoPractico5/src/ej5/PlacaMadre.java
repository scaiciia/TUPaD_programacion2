package ej5;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class PlacaMadre {

    private String modelo;
    private String chipset;

    public PlacaMadre(String chipset, String modelo) {
        this.chipset = chipset;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

}
