
package prueba.DTO;

import java.util.Date;


public class usuario {
    
    private int ID;
    private String Nombre;
    private int Rut;
    private String Dv;
    private Date FechaDeNacimiento;
    private String Telefono;    
    private String NombreUsuario;
    private String Email;
    private String Contrasenia;
    
    
    public usuario(){
        this.ID = 0;
        this.Nombre = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaDeNacimiento = new Date();
        this.Telefono = "";
        this.NombreUsuario = "";
        this.Email = "";
        this.Contrasenia = "";
                 
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int rut, char dv) {
        if (this.validarRut(rut, dv)) {
            this.Rut = rut;
            this.Dv = dv + "";
        }           
    }


    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        if(Telefono.length()>8 && Telefono.startsWith("56")){
            this.Telefono = Telefono;
        }
    }

    public String getNombreUsuario() {    
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if(NombreUsuario.length() > 4){
            this.NombreUsuario = NombreUsuario;
        }
        
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if (Email.contains("@")&& (Email.contains(".com") && (Email.contains(".cl")))) {
            this.Email = Email;
        }
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        int mayuscula = 0;
        int numero = 0;
        for (int i = 0; i < Contrasenia.length(); i++) {
            if (Character.isUpperCase(Contrasenia.charAt(i))) {
                mayuscula++;
            } else if (Character.isDigit(Contrasenia.charAt(i))) {
                numero++;
            }
        }
        if (mayuscula > 0 && numero > 0 && Contrasenia.length() > 6) {
            this.Contrasenia = Contrasenia;
        }

    }

    public boolean validarRut(int Rut, char Dv) {
        boolean Validacion = false;
        try {
            int m = 0, s = 1;
            for (; Rut != 0; Rut /= 10) {
                s = (s + Rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (Dv == (char) (s != 0 ? s + 47 : 75)) {
                Validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return Validacion;
    }

    public String iniciarSesion(String NombreUsuario, String Contrasenia) {
        if (NombreUsuario.equals(this.NombreUsuario) && Contrasenia.equals(this.Contrasenia)) {
            return "Inicio se sesion exitoso";
        } else {
            return "Datos incorrectos, ingrese nuevamente.";
        }
    }

    public String resetContraseña(String NombreUsuario, String ContraseniaNueva) {
        if (NombreUsuario.equals(this.NombreUsuario)) {
            int mayus = 0;
            int num = 0;
            for (int i = 0; i < ContraseniaNueva.length(); i++) {
                if (Character.isUpperCase(Contrasenia.charAt(i))) {
                    mayus++;
                } else if (Character.isDigit(Contrasenia.charAt(i))) {
                    num++;
                }
            }
            if (mayus > 0 && num > 0 && ContraseniaNueva.length() > 6) {
                this.Contrasenia = ContraseniaNueva;
            } else {
                System.out.println("Contraseña invalida.");
            }
        }
        return "Nombre de usuario incorrecto, reingrese nuevamente.";
    }
    
}


