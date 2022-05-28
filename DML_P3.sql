--Informaci�n dentro de la tabla hotel
INSERT INTO hotel(nombre_hotel,direccion_hotel,telefono_hotel,anio_construccion,registro_operacion,DNI,Clasificacion_estrellas,gerente,departamentos,hotel_ID,fecha_actualizacion,pais,IVA,impuesto_consumo,impuesto_turismo)VALUES('hotel plaza','calle 94 sur,#2807','+57 3185256523',1940,'R1',
452183658,1,NULL,3,1234, TO_DATE('17/09/2021', 'DD/MM/YYYY'),'Colombia',19,5,10);
INSERT INTO hotel(nombre_hotel,direccion_hotel,telefono_hotel,anio_construccion,registro_operacion,DNI,Clasificacion_estrellas,gerente,departamentos,hotel_ID,fecha_actualizacion,pais,IVA,impuesto_consumo,impuesto_turismo)VALUES('hotel colombia','calle 2 sur,#1207','+57 3185353583',1990,'R2',
56133458,2,'Frank Hernandez',1,1235,TO_DATE('27/02/2021', 'DD/MM/YYYY'),'Colombia',19,5,10);
INSERT INTO hotel(nombre_hotel,direccion_hotel,telefono_hotel,anio_construccion,registro_operacion,DNI,Clasificacion_estrellas,gerente,departamentos,hotel_ID,fecha_actualizacion,pais,IVA,impuesto_consumo,impuesto_turismo)VALUES('hotel fernandez','calle 80 sur,#2807','91(4090)868-58-80',1940,'R3',
86935478,4,'Alberto Vigna',2,1236,TO_DATE('17/01/2021', 'DD/MM/YYYY'),'Colombia',19,5,10);
INSERT INTO hotel(nombre_hotel,direccion_hotel,telefono_hotel,anio_construccion,registro_operacion,DNI,Clasificacion_estrellas,gerente,departamentos,hotel_ID,fecha_actualizacion,pais,IVA,impuesto_consumo,impuesto_turismo)VALUES('hotel rodriguez','calle 8,#34-23','+57 3098761265',2003,'R4',
12345678,3,NULL,3,1237,TO_DATE('30/12/2021', 'DD/MM/YYYY'),'Colombia',19,5,10);
INSERT INTO hotel(nombre_hotel,direccion_hotel,telefono_hotel,anio_construccion,registro_operacion,DNI,Clasificacion_estrellas,gerente,departamentos,hotel_ID,fecha_actualizacion,pais,IVA,impuesto_consumo,impuesto_turismo)VALUES('hotel las rosas','avenida caracas, #78B-12','+57 3012348765',1912,'R5',
23456789,5,'Manuel Soto',2,1238,TO_DATE('30/03/2022', 'DD/MM/YYYY'),'Colombia',19,5,10);

--Informaci�n dentro de la tabla categoria
INSERT INTO categoria(Sobrecosto,descripcion,fecha_actual,hotel_hotel_ID)VALUES(10,1,SYSDATE,1234);
INSERT INTO categoria(Sobrecosto,descripcion,fecha_actual,hotel_hotel_ID)VALUES(20,2,SYSDATE,1235);
INSERT INTO categoria(Sobrecosto,descripcion,fecha_actual,hotel_hotel_ID)VALUES(30,3,SYSDATE,1237);
INSERT INTO categoria(Sobrecosto,descripcion,fecha_actual,hotel_hotel_ID)VALUES(40,4,SYSDATE,1236);
INSERT INTO categoria(Sobrecosto,descripcion,fecha_actual,hotel_hotel_ID)VALUES(50,5,SYSDATE,1238);

--Informaci�n dentro de la tabla departamentos
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(123,'limpieza',
2000000,NULL,1234);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(456,'administracion',
0000000,'Pepe',1235);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(789,'actividades culturales',
20000000,'Fredy',1236);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(234,'alimentacion',
100000000,'Jhony',1237);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(345,'eventos',
0000000,'Tato',1238);
--SPACE
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(124,'administracion',
40000000,'sebastian',1234);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(125,'actividades culturales',
20000000,'Luis',1234);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(129,'alimentacion',
100000000,'Alberto',1236);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(130,'limpieza',
2000000,NULL,1237);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(141,'administracion',
40000000,'Luisa',1237);
INSERT INTO depart_amentos(codigo_departamentos,nombre_departamentos,presupuesto_mensual,director,hotel_hotel_ID)VALUES(143,'administracion',
40000000,'Andres',1238);

--Informaci�n dentro de la tabla empleado
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 7901772735', '7/12/2021', 370000, '7109798879', 'Norri', 'Pepe', 1, 7109798879,1234);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 2653729768', '10/1/2021', 1200000, '6828336283', 'Philomena', 'Fredy', 2, 6828336283,1235);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 9273891926', '1/2/2021', 500000, '1234567890', 'Vaughan', 'Jhony', 0, 1234567890,1236);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 7537978085', '4/3/2022', 1040000, '4351287969', 'Abigael', 'Tato', 0, 4351287969,1237);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 7317027782', '12/4/2021', 1560000, '0619986786', 'Jacinthe', 'Sebastian', 1, 0619986786,1238);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 0673087085', '5/5/2021', 1024000, '7439125878', 'Felicio', 'Luis', 1, 7439125878,1234);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 5701764397', '1/6/2021', 1842000, '9587808509', 'Nikolaus', 'Alberto', 2, 9587808509,1235);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 2917708832', '1/7/2022', 1300000, '5893881540', 'Cacilie', 'Luisa', 0, 5893881540,1236);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 0576990264', '11/8/2021', 1100000, '0329611267', 'Charlena', 'Andres', 1, 0329611267,1237);
insert into empleado (telefono_empleado, fecha_ingreso, salario_empleado, DNI_empleado, nombre_empleado, jefe_inmediato, cantidad_hijos, empleado_ID, hotel_hotel_ID) values ('+57 4730021665', '2/9/2022', 2000000, '1223496899', 'Marsha', 'Luis', 0, 1223496899,1238);

--Informaci�n dentro de la tabla hijo
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (280, 'Grantham', '8/12/2020', 7109798879);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (209, 'Kaye', '5/5/2021', 6828336283);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (206, 'Roana', '11/9/2020', 6828336283);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (254, 'Klaus', '6/10/2021', 0619986786);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (278, 'Wesley', '6/11/2021', 7439125878);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (227, 'Clarita', '5/1/2021', 9587808509);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (225, 'Rayshell', '8/1/2021', 9587808509);
insert into hijo (codigo_hijo, nombre_hijo, fecha_nacimiento, empleado_empleado_ID) values (248, 'Karlee', '6/9/2021', 0329611267);

--Informaci�n dentro de la tabla habitaci�n
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(101,'Doble',1,NULL,1234,'D');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(202,'Cuadruple',2,'booking',1235,'O');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(303,'Individual',3,'particular',1236,'O');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(404,'Doble',4,NULL,1237,'D');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(505,'Cuadruple',5,'particular',1238,'O');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(606,'Suite',6,NULL,1234,'D');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(707,'Junior Suite',7,'booking',1235,'O');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(808,'Gran Suite',8,'particular',1236,'O');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(909,'Gran Suite',9,NULL,1237,'D');
INSERT INTO habitacion(habitacion_ID,tipo,piso,forma_reserva,hotel_hotel_ID,estado)VALUES(102,'Individual',1,'NULL',1238,'D');

--Informaci�n dentro de la tabla reserva
INSERT INTO reserva(codigo_reserva,forma_reserva,habitacion_habitacion_ID)VALUES(AUTO_IN.NEXTVAL,'booking',202);
INSERT INTO reserva(codigo_reserva,forma_reserva,habitacion_habitacion_ID)VALUES(AUTO_IN.NEXTVAL,'booking',707);
INSERT INTO reserva(codigo_reserva,forma_reserva,habitacion_habitacion_ID)VALUES(AUTO_IN.NEXTVAL,'particular',303);
INSERT INTO reserva(codigo_reserva,forma_reserva,habitacion_habitacion_ID)VALUES(AUTO_IN.NEXTVAL,'particular',808);
INSERT INTO reserva(codigo_reserva,forma_reserva,habitacion_habitacion_ID)VALUES(AUTO_IN.NEXTVAL,'particular',505);

---Informaci�n dentro de la tabla servicio
INSERT INTO servicio(codigo_servicio,costo_asociado,tipo_servicio,reserva_ID,hotel_hotel_ID)VALUES(1,100000,'Licor',1,1235);
INSERT INTO servicio(codigo_servicio,costo_asociado,tipo_servicio,reserva_ID,hotel_hotel_ID)VALUES(2,300000,'Tour',3,1235);
INSERT INTO servicio(codigo_servicio,costo_asociado,tipo_servicio,reserva_ID,hotel_hotel_ID)VALUES(3,1000000,'Restaurante',5,1238);

--Informaci�n dentro de la tabla particular
insert into particular(codigo_particular, precio_reserva, fecha_inicio, fecha_fin, reserva_codigo, reserva_forma_reserva, abono) values (3, 2300750, '2/10/2022', '8/12/2022',3, 'particular', 40);
insert into particular(codigo_particular, precio_reserva, fecha_inicio, fecha_fin, reserva_codigo, reserva_forma_reserva, abono) values (4, 3000000, '18/5/2022', '19/5/2022',4, 'particular', 30);
insert into particular(codigo_particular, precio_reserva, fecha_inicio, fecha_fin, reserva_codigo, reserva_forma_reserva, abono) values (5, 5500000, '6/5/2022', '9/5/2022',5, 'particular', 20);

--Informaci�n dentro de la tabla booking
insert into booking(codigo_booking,nombre_agencia,NIT,telefono_agencia,direccion_agencia,nombre_agente,precio_reserva,fecha_inicio_reserva,fecha_fin_reserva,porcentaje_descuento,reserva_codigo)values(
1, 'O''Kon LLC',0308997921, '+57 1214487531', '192 Lakeland Trail', 'Darelle', 4000000, '2/4/2022', '9/4/2022', 21, 1);
insert into booking(codigo_booking,nombre_agencia,NIT,telefono_agencia,direccion_agencia,nombre_agente,precio_reserva,fecha_inicio_reserva,fecha_fin_reserva,porcentaje_descuento,reserva_codigo)values(
2, 'Boehm and Sons',1019683929, '+57 1681897416', '7219 Cody Center', 'Korey', 2200000, '2/4/2022', '8/4/2022', 46, 2);

--Informaci�n dentro de la tabla persona
insert into persona(DNI_persona,nombre_persona,telefono_persona,direccion_persona,habitaciones_reservadas,cantidad_personas,booking_codigo,particular_codigo) values (891173192, 'Cyrille', '+57 3358454101', '0 Upham Center', 1, 3, 1, NULL);
insert into persona(DNI_persona,nombre_persona,telefono_persona,direccion_persona,habitaciones_reservadas,cantidad_personas,booking_codigo,particular_codigo) values (6255927466, 'Avictor', '+57 9807957994', '580 Tennyson Junction', 1, 4, 2, NULL);
insert into persona(DNI_persona,nombre_persona,telefono_persona,direccion_persona,habitaciones_reservadas,cantidad_personas,booking_codigo,particular_codigo) values (1281639265, 'Nick', '+57 8872197473', '717 Hollow Ridge Point', 1, 3, NULL,3);
insert into persona(DNI_persona,nombre_persona,telefono_persona,direccion_persona,habitaciones_reservadas,cantidad_personas,booking_codigo,particular_codigo) values (8187044330, 'Albie', '+57 8324970226', '2 Fisk Alley', 1, 2, NULL, 4);
insert into persona(DNI_persona,nombre_persona,telefono_persona,direccion_persona,habitaciones_reservadas,cantidad_personas,booking_codigo,particular_codigo) values (6581666009, 'Winny', '+57 0145833286', '18991 Londonderry Way', 1, 2, NULL, 5);

--Informaci�n dentro de la clasificaci�n de edades
INSERT INTO clasificacion_edades(codigo_clasificacion,ni�os,adultos,adultos_mayores,booking_codigo,particular_codigo)VALUES(1,1,2,0,1,NULL);
INSERT INTO clasificacion_edades(codigo_clasificacion,ni�os,adultos,adultos_mayores,booking_codigo,particular_codigo)VALUES(2,1,2,1,2,NULL);
INSERT INTO clasificacion_edades(codigo_clasificacion,ni�os,adultos,adultos_mayores,booking_codigo,particular_codigo)VALUES(3,1,2,0,NULL,3);
INSERT INTO clasificacion_edades(codigo_clasificacion,ni�os,adultos,adultos_mayores,booking_codigo,particular_codigo)VALUES(4,0,2,0,NULL,4);
INSERT INTO clasificacion_edades(codigo_clasificacion,ni�os,adultos,adultos_mayores,booking_codigo,particular_codigo)VALUES(5,0,2,0,NULL,5);