CREATE DATABASE db_task;

//=======Creacion de las tablas=======
CREATE TABLE tb_estados(
	id_estado SERIAL PRIMARY KEY,
	nomb_estado VARCHAR(50)
);

CREATE TABLE tb_iconos(
	id_icono SERIAL PRIMARY KEY,
	nomb_icono VARCHAR(50)
);

CREATE TABLE tb_usuarios(
	id_usua SERIAL PRIMARY KEY,
	nomb_usua VARCHAR(100),
	appe_usua VARCHAR(100),
	nomb_emp_usua VARCHAR(100),
	carg_emp_usua VARCHAR(120),
	telf_usua CHAR(15),
	mail_usua VARCHAR(200),
	pass_usua VARCHAR(255)
);

CREATE TABLE tb_tasks(
	id_task VARCHAR PRIMARY KEY,
	nomb_task VARCHAR(150),
	desc_task VARCHAR(150),
	id_estado INTEGER REFERENCES tb_estados(id_estado),
	ini_task DATE,
	fin_task DATE,
	comp_task BOOLEAN,
	id_icono INTEGER REFERENCES tb_iconos(id_icono),
	id_usua INTEGER REFERENCES tb_usuarios(id_usua)
);
SELECT * FROM tb_usuarios;
INSERT INTO tb_estados(nomb_estado) VALUES('PLANIFICACIÓN');
INSERT INTO tb_iconos(nomb_icono)VALUES('CARPETA');
INSERT INTO tb_usuarios(nomb_usua,appe_usua,nomb_emp_usua,carg_emp_usua,telf_usua,mail_usua,pass_usua) VALUES('adasda','sdaz','BigDavi','Soporte','+51946245333','zidane@gmail.com','123');
INSERT INTO tb_tasks VALUES('ATA-1','Proyecto de App','Desarrollado en Java 17 - Spring boot',1,'2024-01-09','2024-01-10', false,1,1);



