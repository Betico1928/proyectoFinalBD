package co.edu.javeriana.proyectofinalbd.model.DAO.Impl;

import co.edu.javeriana.proyectofinalbd.model.DAO.HotelDAO;
import co.edu.javeriana.proyectofinalbd.model.DTO.HotelDTO;
import co.edu.javeriana.proyectofinalbd.utils.Oracle;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HotelDAOImpl implements HotelDAO
{
    private final Oracle oracle;

    public HotelDAOImpl()
    {
        this.oracle = new Oracle();
    }

    @Override
    public HotelDTO create(HotelDTO hotelDTO)
    {
        System.out.println("Entrada al create");
        try
        {
            this.oracle.conectar();
            String query = "INSERT INTO hotel(nombre_Hotel, direccion_hotel, telefono_hotel, anio_construccion, registro_operacion, DNI, Clasificacion_estrellas, departamentos, hotel_ID, pais,IVA, impuesto_consumo, impuesto_turismo ) VALUES ('" + hotelDTO.getNombre_hotel() + "','" + hotelDTO.getDireccion_hotel() + "','" + hotelDTO.getTelefono_hotel() +"','" + "2022" +"','" + hotelDTO.getRegistro_operacion() + "','" + hotelDTO.getDNI() +"','" + hotelDTO.getClasificacion_estrellas() +"','" + hotelDTO.getDepartamentos() +"','" + hotelDTO.getHotel_id() +"','" + hotelDTO.getPais() +"','" + hotelDTO.getIVA() + "','" + hotelDTO.getImpuesto_consumo() +"','" + hotelDTO.getImpuesto_Turismo() + "')";
            //, , , , , , , , , , , ,
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            switch (code)
            {
                case 1:
                    System.out.println("Se creo el hotel");
                    //JOptionPane.showMessageDialog(null, "Se creo el hotel");
                    return buscarHotel(hotelDTO.getNombre_hotel());
                default:
                    return null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(LogInDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error, no se pudo registrar el hotel. Intentalo nuevamente");
            //JOptionPane.showMessageDialog(null, "Error, no se pudo registrar el hotel. Intentalo nuevamente");
            return null;
        }
    }

    @Override
    public HotelDTO buscarHotel(String nombre_hotel)
    {
        System.out.println("Buscar un hotel");
        return null;
    }
}
