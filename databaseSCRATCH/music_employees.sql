create table employees
(
    outlet_number int,
    emp_number    int not null
        primary key,
    emp_name      int null,
    constraint emp_number_UNIQUE
        unique (emp_number),
    constraint outlet_fk
        foreign key (outlet_number) references outlets (outlet_number)
);

create index outlet_fk_idx
    on employees (outlet_number);

alter table employees
    modify outlet_number int auto_increment;

INSERT INTO music.employees (outlet_number, emp_number, emp_name) VALUES (1, 1, 'Daniel Trujillo');
INSERT INTO music.employees (outlet_number, emp_number, emp_name) VALUES (2, 2, 'Rodrigo Hernandez');
INSERT INTO music.employees (outlet_number, emp_number, emp_name) VALUES (3, 3, 'Oglando Mejia');
INSERT INTO music.employees (outlet_number, emp_number, emp_name) VALUES (4, 4, 'Ricardo Hernandez');
INSERT INTO music.employees (outlet_number, emp_number, emp_name) VALUES (1, 5, 'Oscar Olguin');
INSERT INTO music.employees (outlet_number, emp_number, emp_name) VALUES (3, 6, 'Victor Hernandez');
