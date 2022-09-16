
package prueba.DTO;

import java.util.Date;

public class Suscripcion {
    private usuario Usuario;
    private Club Club;
    private Date InicioSuscripcion;
    private int NumSuscripcion;
    private int AbonoTotal;
    private int IdUnicoSuscripcion;
    
    public Suscripcion(){
        this.Usuario = new usuario();
        this.Club = new Club();
        this.InicioSuscripcion =new Date();
        this.NumSuscripcion = 0;
        this.AbonoTotal = 0;
        this.IdUnicoSuscripcion = 0;  
    }

    public usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Club getClub() {
        return Club;
    }

    public void setClub(Club Club) {
        this.Club = Club;
    }

    public Date getInicioSuscripcion() {
        return InicioSuscripcion;
    }

    public void setInicioSuscripcion(Date InicioSuscripcion) {
        this.InicioSuscripcion = InicioSuscripcion;
    }

    public int getNumSuscripcion() {
        return NumSuscripcion;
    }

    public void setNumSuscripcion(int NumSuscripcion) {
        this.NumSuscripcion = NumSuscripcion;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public int getIdUnicoSuscripcion() {
        return IdUnicoSuscripcion;
    }

    public void setIdUnicoSuscripcion(int IdUnicoSuscripcion) {
        this.IdUnicoSuscripcion = IdUnicoSuscripcion;
    }
    
    
    
    
}
