package co.edu.javeriana.proyectofinalbd.model.DAO;

import co.edu.javeriana.proyectofinalbd.model.DTO.LogInDTO;

public interface LogInDAO
{
    public LogInDTO create(LogInDTO logIn);

    public LogInDTO findByID(String usuario);
}
