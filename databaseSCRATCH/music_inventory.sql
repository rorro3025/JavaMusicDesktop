create table inventory
(
    outlet_number int                        not null,
    product_code  int                        not null,
    quantity      decimal(4, 2) default 0.00 not null,
    constraint inven_out_fk
        foreign key (outlet_number) references outlets (outlet_number)
            on update cascade on delete cascade,
    constraint inven_pro
        foreign key (product_code) references products (product_code)
            on update cascade on delete cascade
);

create index inven_out_fk_idx
    on inventory (outlet_number);

create index inven_pro_idx
    on inventory (product_code);

INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (1, 1, 30);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (1, 2, 20);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (1, 3, 10);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (1, 4, 3);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (1, 5, 40);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (2, 1, 30);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (2, 3, 13);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (2, 5, 43);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (2, 6, 10);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (3, 5, 1);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (3, 4, 2);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (3, 6, 3);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (3, 8, 3);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (4, 10, 10);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (4, 9, 31);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (4, 7, 23);
INSERT INTO music.inventory (outlet_number, product_code, quantity) VALUES (4, 8, 31);
