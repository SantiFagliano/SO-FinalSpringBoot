drop database ligaAfa;

create database ligaAfa;

use ligaAfa;

create table Direccion(
	id int NOT NULL AUTO_INCREMENT,
    numero int not null,
    calle varchar(50) not null,
    localidad varchar(50) not null,
    provincia varchar(50) not null,
    primary key (id)
);

create table Persona(
    id int NOT NULL AUTO_INCREMENT,
	dni int not null,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    telefono int not null,
    email varchar(50) not null,
    id_direccion int not null,
    primary key (id),
    constraint fk_id_direccion
    foreign key (id_direccion)
    references Direccion(id)
);
create table Dt(
	id int NOT NULL,
	fecha_inicio_club date,
	fecha_fin_club date,
    club_dirigido varchar(50),
    primary key (id),
    constraint fk_id_persona_dt
    foreign key (id)
    references Persona(id)
);
create table Equipo(
    id int NOT NULL AUTO_INCREMENT,
	cuit int not null,
    nombre varchar(50) not null,
    fecha_fundacion date,
    nombre_presidente varchar(50),
    apellido_presidente varchar(50),
    id_direccion int,
    telefono int,
    email varchar(50),
    fecha_inicio_primera_division date,
    fecha_fin_primera_division date,
    categoria_actual varchar(50),
    id_dt int,
    primary key (id),
    constraint fk_id_dt
    foreign key (id_dt)
    references Dt(id),
    constraint fk_id_direccion_equipo
    foreign key (id_direccion)
    references Direccion(id)
);
create table Jugador(
	id int not null,
    fecha_nacimiento date,
    fecha_retiro date,
    fecha_debut date,
	partidos_jugados int,
	goles int,
    altura int,
    peso int,
    posicion varchar(50),
    primary key (id),
    constraint fk_id_persona_jugador
    foreign key (id)
    references Persona(id)
);

create table HistorialJugador(
	id int auto_increment,
    id_equipo int,
    id_jugador int,
    posicion varchar(50),
    fecha_inicio date,
    fecha_fin date,
    primary key (id),
    constraint fk_id_equipo_contrato
    foreign key (id_equipo)
    references Equipo(id),
    constraint fk_id_jugador
    foreign key (id_jugador)
    references Jugador(id)
);


