public class Vehiculo {

    String marca;
    String serieModelo;
    int anio;
    String color;
    String tipo;

    public Vehiculo(String marca, String serieModelo, int anio, String color, String tipo) {
        this.marca = marca;
        this.serieModelo = serieModelo;
        this.anio = anio;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSerieModelo() {
        return serieModelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSerieModelo(String serieModelo) {
        this.serieModelo = serieModelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", serieModelo='" + serieModelo + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
