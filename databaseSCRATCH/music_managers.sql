create table managers
(
    outlet_number int not null,
    emp_number    int not null,
    constraint man_employee_fk
        foreign key (emp_number) references employees (emp_number)
            on update cascade on delete cascade,
    constraint man_outlet_fk
        foreign key (outlet_number) references outlets (outlet_number)
            on update cascade on delete cascade
);

create index employee_fk_idx
    on managers (emp_number);

create index outlet_fk_idx
    on managers (outlet_number);

INSERT INTO music.managers (outlet_number, emp_number) VALUES (1, 2);
INSERT INTO music.managers (outlet_number, emp_number) VALUES (2, 5);
INSERT INTO music.managers (outlet_number, emp_number) VALUES (3, 6);
