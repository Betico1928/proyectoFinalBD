package co.edu.javeriana.proyectofinalbd.model.DAO;

import co.edu.javeriana.proyectofinalbd.model.DTO.HotelDTO;

public interface HotelDAO
{
    public HotelDTO create(HotelDTO hotelDAO);

    public HotelDTO buscarHotel(String hotel);
}
