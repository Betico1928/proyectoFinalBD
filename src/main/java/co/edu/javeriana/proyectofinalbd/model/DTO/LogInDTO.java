package co.edu.javeriana.proyectofinalbd.model.DTO;

import java.util.Objects;

public class LogInDTO
{
    private String usuario;

    private String contraseña;

    // Constructor
    public LogInDTO(String usuario, String contraseña)
    {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    //Get y Set

    public String getUsuario()
    {
        return usuario;
    }
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    public String getContraseña()
    {
        return contraseña;
    }
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }


    // Hash Code
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof LogInDTO)) return false;
        LogInDTO logInDTO = (LogInDTO) o;
        return getUsuario().equals(logInDTO.getUsuario()) && getContraseña().equals(logInDTO.getContraseña());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getUsuario(), getContraseña());
    }

    //toString


    @Override
    public String toString()
    {
        return "LogInDTO{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
