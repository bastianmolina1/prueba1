
package prueba.DTO;

import java.util.Date;

public class Club {
    private int Rol;
    private String NombreClub;
    private String NombreFundador;
    private Date AnioFundacion;
    private String PaisOrigen;
    private String Lema;
    private String Colores;
    private int Valor;
    
    public Club(){
        this.Rol = 0;
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AnioFundacion = new Date();
        this.PaisOrigen = "";
        this.Lema = "";
        this.Colores = "";
        this.Valor = 0;        
        
    }

    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public Date getAnioFundacion() {
        return AnioFundacion;
    }

    public void setAnioFundacion(Date AnioFundacion) {
        this.AnioFundacion = AnioFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
    public String ValidarRolUnico() {    
        for (int i = 0; i < this.NombreClub.length(); i++) {            
            if (this.NombreClub.charAt(i) == ' ') {                
                System.out.println(" ");
            }
        }
        return null;
    }
}
              
