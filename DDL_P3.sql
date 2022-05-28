--tabla hotel
CREATE TABLE hotel (
nombre_hotel VARCHAR2(45)NOT NULL,
direccion_hotel VARCHAR2(45)NOT NULL,
telefono_hotel VARCHAR2(45)NOT NULL,
anio_construccion NUMBER(4) NOT NULL,
registro_operacion VARCHAR2(45)NOT NULL,
DNI NUMBER NOT NULL,
Clasificacion_estrellas NUMBER(2)NULL,
gerente VARCHAR2(45)NULL,
departamentos NUMBER NOT NULL,
hotel_ID NUMBER NOT NULL,
fecha_actualizacion DATE NULL,
pais VARCHAR2(45)NOT NULL,
IVA NUMBER(2)NOT NULL,
impuesto_consumo NUMBER(2)NOT NULL,
impuesto_turismo NUMBER(2)NOT NULL,
--clave primaria
CONSTRAINT hotel_pk PRIMARY KEY(hotel_ID)
);

--tabla categoria
CREATE TABLE categoria (
Sobrecosto NUMBER(10)NOT NULL,
descripcion VARCHAR2(45)NOT NULL,
fecha_actual DATE NOT NULL,
hotel_hotel_ID NUMBER NOT NULL,
--claves primarias y foraneas
CONSTRAINT categoria_pk PRIMARY KEY(descripcion),
CONSTRAINT categoria_hotel_fk FOREIGN KEY (hotel_hotel_ID) REFERENCES hotel(hotel_ID)
);

--tabla departamentos
CREATE TABLE depart_amentos (
codigo_departamentos NUMBER(10)NOT NULL,
nombre_departamentos VARCHAR2(45)NOT NULL,
presupuesto_mensual NUMBER(10)NOT NULL,
director VARCHAR2(45)NULL,
hotel_hotel_ID NUMBER NOT NULL,
--claves primarias y foraneas
CONSTRAINT depart_amentos_pk PRIMARY KEY (codigo_departamentos),
CONSTRAINT depart_amentos_hotel_fk FOREIGN KEY (hotel_hotel_ID) REFERENCES hotel(hotel_ID)
);

--tabla empleado
CREATE TABLE empleado (
telefono_empleado VARCHAR2(45)NOT NULL,
fecha_ingreso DATE NOT NULL,
salario_empleado FLOAT(10)NOT NULL,
DNI_empleado VARCHAR2(45)NOT NULL,
nombre_empleado VARCHAR2(45)NOT NULL,
jefe_inmediato VARCHAR2(45)NOT NULL,
cantidad_hijos NUMBER(2)NOT NULL,
empleado_ID NUMBER NOT NULL,
hotel_hotel_ID NUMBER NOT NULL,
--claves primarias y foraneas
CONSTRAINT empleado_pk PRIMARY  KEY(empleado_ID),
CONSTRAINT empleado_hotel_fk FOREIGN KEY (hotel_hotel_ID) REFERENCES hotel(hotel_ID)
);

--tabla hijo
CREATE TABLE hijo (
codigo_hijo NUMBER NOT NULL,
nombre_hijo VARCHAR2(45)NOT NULL,
fecha_nacimiento DATE NOT NULL,
empleado_empleado_ID NUMBER,
--claves primarias y foraneas
CONSTRAINT hijo_pk PRIMARY KEY(codigo_hijo),
CONSTRAINT hijo_empleado_fk FOREIGN KEY(empleado_empleado_ID)REFERENCES empleado(empleado_ID)
);

--tabla habitacion
CREATE TABLE habitacion (
habitacion_ID NUMBER NOT NULL,
tipo VARCHAR2(45)NOT NULL,
piso NUMBER(2)NOT NULL,
forma_reserva VARCHAR2(45)NULL,
hotel_hotel_ID NUMBER NOT NULL,
estado CHAR NOT NULL,
--claves primarias y foraneas
CONSTRAINT habitacion_pk PRIMARY KEY(habitacion_ID),
CONSTRAINT habitacion_hotel_fk FOREIGN KEY(hotel_hotel_ID)REFERENCES hotel(hotel_ID),
CONSTRAINT CK_habitacion_estado CHECK(estado='O' OR estado='D')
);

--tabla reserva
--drop sequence AUTO_IN;
CREATE SEQUENCE AUTO_IN START WITH 1 INCREMENT BY 1 MINVALUE 1;
CREATE TABLE reserva (
codigo_reserva NUMBER(10)DEFAULT AUTO_IN.NEXTVAL NOT NULL,
forma_reserva VARCHAR2(45)NOT NULL,
habitacion_habitacion_ID NUMBER NOT NULL,
--claves primarias y foraneas
CONSTRAINT reserva_pk PRIMARY KEY (codigo_reserva),
CONSTRAINT reserva_habitacion_fk FOREIGN KEY (habitacion_habitacion_ID)REFERENCES habitacion(habitacion_ID)
);

-- tabla servicio
CREATE TABLE servicio (
codigo_servicio NUMBER(10)NOT NULL,
costo_asociado FLOAT(10)NOT NULL,
tipo_servicio VARCHAR2(45)NOT NULL,
reserva_ID NUMBER(10) NOT NULL,
hotel_hotel_ID NUMBER NOT NULL,
--claves primarias y foraneas
CONSTRAINT servicio_pk PRIMARY KEY(codigo_servicio),
CONSTRAINT servicio_reserva_fk FOREIGN KEY (reserva_ID) REFERENCES reserva(codigo_reserva),
CONSTRAINT servicio_hotel_fk FOREIGN KEY(hotel_hotel_ID)REFERENCES hotel(hotel_ID)
);

--tabla particular
CREATE TABLE particular (
codigo_particular NUMBER(10)NOT NULL,
precio_reserva FLOAT(10)NOT NULL,
fecha_inicio DATE NOT NULL,
fecha_fin DATE NOT NULL,
reserva_codigo NUMBER(10)NOT NULL,
reserva_forma_reserva VARCHAR2(45)NOT NULL,
abono FLOAT(10)NOT NULL,
--claves primarias
CONSTRAINT particular_pk PRIMARY KEY(codigo_particular)
);
--agregar claves foraneas
ALTER TABLE particular ADD CONSTRAINT particular_particular_fk FOREIGN KEY(reserva_codigo)REFERENCES particular(codigo_particular);
ALTER TABLE particular ADD CONSTRAINT particular_reserva_fk FOREIGN KEY(reserva_codigo)REFERENCES reserva(codigo_reserva);

--tabla booking
CREATE TABLE booking (
codigo_booking NUMBER(10)NOT NULL,
nombre_agencia VARCHAR2(45)NOT NULL,
NIT NUMBER(10)NOT NULL,
telefono_agencia VARCHAR2(45)NOT NULL,
direccion_agencia VARCHAR2(45)NOT NULL,
nombre_agente VARCHAR2(45)NOT NULL,
precio_reserva FLOAT(10),
fecha_inicio_reserva DATE NOT NULL,
fecha_fin_reserva DATE NOT NULL,
porcentaje_descuento FLOAT(2) NOT NULL,
reserva_codigo NUMBER(10)NOT NULL,
--claves primarias y foraneas
CONSTRAINT booking_pk PRIMARY KEY(codigo_booking)
);
--agregar unas clave foraneas
ALTER TABLE booking ADD CONSTRAINT booking_booking_fk FOREIGN KEY(reserva_codigo)REFERENCES booking(codigo_booking);
ALTER TABLE booking ADD CONSTRAINT booking_reserva_fk FOREIGN KEY(reserva_codigo)REFERENCES reserva(codigo_reserva);

--tabla persona
CREATE TABLE persona (
DNI_persona NUMBER(10)NOT NULL,
nombre_persona VARCHAR2(45)NOT NULL,
telefono_persona VARCHAR2(45)NOT NULL,
direccion_persona VARCHAR2(45)NOT NULL,
habitaciones_reservadas NUMBER NOT NULL,
cantidad_personas NUMBER NOT NULL,
booking_codigo NUMBER(10)NULL,
particular_codigo NUMBER(10)NULL,
--claves primarias y foraneas
CONSTRAINT persona_pk PRIMARY KEY(DNI_persona),
CONSTRAINT persona_booking_fk FOREIGN KEY(booking_codigo)REFERENCES booking(codigo_booking),
CONSTRAINT persona_particular_fk FOREIGN KEY(particular_codigo)REFERENCES particular(codigo_particular)
);

--tabla de clasificaci�n de edades
CREATE TABLE clasificacion_edades (
codigo_clasificacion NUMBER(10)NOT NULL,
ni�os NUMBER NOT NULL,
adultos NUMBER NOT NULL,
adultos_mayores NUMBER NOT NULL,
booking_codigo NUMBER(10)NULL,
particular_codigo NUMBER(10)NULL,
--clave primaria
CONSTRAINT clasificacion_edades_pk PRIMARY KEY(codigo_clasificacion),
--claves foraneas
CONSTRAINT clasificacion_edades_booking_fk FOREIGN KEY(booking_codigo)REFERENCES booking(codigo_booking),
CONSTRAINT clasificacion_edades_particular_fk FOREIGN KEY(particular_codigo)REFERENCES particular(codigo_particular)
);

CREATE TABLE log_in(
usuarioLogIn        VARCHAR2(45) PRIMARY KEY NOT NULL,
constrasenaLogIn    VARCHAR2(45) NOT NULL
);

-- funcion DROP para borrar las tablas creadas
DROP TABLE log_in;
DROP TABLE categoria;
DROP TABLE servicio;
DROP TABLE depart_amentos;
DROP TABLE clasificacion_edades;
DROP TABLE hijo;
DROP TABLE empleado;
DROP TABLE particular;
DROP TABLE persona;
DROP TABLE booking;
DROP TABLE reserva;
DROP TABLE habitacion;
DROP TABLE hotel;
DROP SEQUENCE AUTO_IN;



