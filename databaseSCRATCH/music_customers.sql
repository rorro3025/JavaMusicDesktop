create table customers
(
    customer_id   int auto_increment
        primary key,
    customer_name int          not null,
    address       varchar(100) null,
    city          varchar(30)  null,
    state         varchar(30)  null,
    zip           int          null,
    phone         varchar(30)  null,
    constraint customers_customer_id_uindex
        unique (customer_id)
);

INSERT INTO music.customers (customer_id, customer_name, address, city, state, zip, phone) VALUES (1, 'Sandra BB', '14 Wallstreet', 'Cuautitlan', 'Edo Mexico', 1234, '5514654654');
INSERT INTO music.customers (customer_id, customer_name, address, city, state, zip, phone) VALUES (2, 'Paola Gomez', '15 Wallstreet', 'tultitlan', 'Edo Mexico', 1234, '55234234');
INSERT INTO music.customers (customer_id, customer_name, address, city, state, zip, phone) VALUES (3, 'Karina Rivera', '16 Wallstreet', 'coacalco', 'Edo Mexico', 1234, '5546456467');
INSERT INTO music.customers (customer_id, customer_name, address, city, state, zip, phone) VALUES (4, 'Abigail Hernandez', '17 Wallstreet', 'ecatepec', 'Edo Mexico', 1234, '55989987');
INSERT INTO music.customers (customer_id, customer_name, address, city, state, zip, phone) VALUES (5, 'Bela Gutierrez', '18 Wallstreet', 'tlalpan', 'CDMX', 1234, '551645664');
INSERT INTO music.customers (customer_id, customer_name, address, city, state, zip, phone) VALUES (6, 'Jazmin Reyes', '19 Wallstreet', 'coyoacan', 'CDMX', 1234, '551379806');
