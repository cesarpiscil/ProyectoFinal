package juegos;


public class Juegos {
    int idjuegos;
    String nombre;
    String compania;
    String genero;
    int precio;
    
public Juegos(){
}

public Juegos(int idjuegos, String nombre, String compania, String genero, int precio){
     this.idjuegos = idjuegos;
     this.nombre = nombre;
     this.compania = compania;
     this.genero = genero;
     this.precio = precio;  
}

    public int getIdjuegos() {
        return idjuegos;
    }

    public void setIdjuegos(int idjuegos) {
        this.idjuegos = idjuegos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}


