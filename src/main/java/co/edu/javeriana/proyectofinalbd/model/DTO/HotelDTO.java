package co.edu.javeriana.proyectofinalbd.model.DTO;

import java.util.Objects;

public class HotelDTO
{
    private String nombre_hotel;

    private String direccion_hotel;

    private String telefono_hotel;

    private String registro_operacion;

    private int DNI;

    private int Clasificacion_estrellas;

    private int departamentos;

    private int hotel_id;

    private String pais;

    private int IVA;

    private int impuesto_consumo;

    private int impuesto_Turismo;

    // Constructor

    public HotelDTO(String nombre_hotel, String direccion_hotel, String telefono_hotel, String registro_operacion, int DNI, int clasificacion_estrellas, int departamentos, int hotel_id, String pais, int IVA, int impuesto_consumo, int impuesto_Turismo) {
        this.nombre_hotel = nombre_hotel;
        this.direccion_hotel = direccion_hotel;
        this.telefono_hotel = telefono_hotel;
        this.registro_operacion = registro_operacion;
        this.DNI = DNI;
        Clasificacion_estrellas = clasificacion_estrellas;
        this.departamentos = departamentos;
        this.hotel_id = hotel_id;
        this.pais = pais;
        this.IVA = IVA;
        this.impuesto_consumo = impuesto_consumo;
        this.impuesto_Turismo = impuesto_Turismo;
    }

    // Getter y Setter

    public String getNombre_hotel() {
        return nombre_hotel;
    }

    public void setNombre_hotel(String nombre_hotel) {
        this.nombre_hotel = nombre_hotel;
    }

    public String getDireccion_hotel() {
        return direccion_hotel;
    }

    public void setDireccion_hotel(String direccion_hotel) {
        this.direccion_hotel = direccion_hotel;
    }

    public String getTelefono_hotel() {
        return telefono_hotel;
    }

    public void setTelefono_hotel(String telefono_hotel) {
        this.telefono_hotel = telefono_hotel;
    }

    public String getRegistro_operacion() {
        return registro_operacion;
    }

    public void setRegistro_operacion(String registro_operacion) {
        this.registro_operacion = registro_operacion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getClasificacion_estrellas() {
        return Clasificacion_estrellas;
    }

    public void setClasificacion_estrellas(int clasificacion_estrellas) {
        Clasificacion_estrellas = clasificacion_estrellas;
    }

    public int getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(int departamentos) {
        this.departamentos = departamentos;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getImpuesto_consumo() {
        return impuesto_consumo;
    }

    public void setImpuesto_consumo(int impuesto_consumo) {
        this.impuesto_consumo = impuesto_consumo;
    }

    public int getImpuesto_Turismo() {
        return impuesto_Turismo;
    }

    public void setImpuesto_Turismo(int impuesto_Turismo) {
        this.impuesto_Turismo = impuesto_Turismo;
    }

    //equals y hash code

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelDTO)) return false;
        HotelDTO hotelDTO = (HotelDTO) o;
        return getDNI() == hotelDTO.getDNI() && getClasificacion_estrellas() == hotelDTO.getClasificacion_estrellas() && getDepartamentos() == hotelDTO.getDepartamentos() && getHotel_id() == hotelDTO.getHotel_id() && getIVA() == hotelDTO.getIVA() && getImpuesto_consumo() == hotelDTO.getImpuesto_consumo() && getImpuesto_Turismo() == hotelDTO.getImpuesto_Turismo() && getNombre_hotel().equals(hotelDTO.getNombre_hotel()) && getDireccion_hotel().equals(hotelDTO.getDireccion_hotel()) && getTelefono_hotel().equals(hotelDTO.getTelefono_hotel()) && getRegistro_operacion().equals(hotelDTO.getRegistro_operacion()) && getPais().equals(hotelDTO.getPais());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre_hotel(), getDireccion_hotel(), getTelefono_hotel(), getRegistro_operacion(), getDNI(), getClasificacion_estrellas(), getDepartamentos(), getHotel_id(), getPais(), getIVA(), getImpuesto_consumo(), getImpuesto_Turismo());
    }


    // toString()

    @Override
    public String toString() {
        return "HotelDTO{" +
                "nombre_hotel='" + nombre_hotel + '\'' +
                ", direccion_hotel='" + direccion_hotel + '\'' +
                ", telefono_hotel='" + telefono_hotel + '\'' +
                ", registro_operacion='" + registro_operacion + '\'' +
                ", DNI=" + DNI +
                ", Clasificacion_estrellas=" + Clasificacion_estrellas +
                ", departamentos=" + departamentos +
                ", hotel_id=" + hotel_id +
                ", pais='" + pais + '\'' +
                ", IVA=" + IVA +
                ", impuesto_consumo=" + impuesto_consumo +
                ", impuesto_Turismo=" + impuesto_Turismo +
                '}';
    }
}
