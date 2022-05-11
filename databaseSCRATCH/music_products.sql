create table products
(
    product_code int auto_increment
        primary key,
    artist       varchar(30)                not null,
    title        varchar(30)                not null,
    cost         decimal(6, 2) default 0.00 not null,
    sale_price   decimal(6, 2) default 0.00 not null,
    constraint products_product_code_uindex
        unique (product_code)
);

INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (1, 'Eminem', 'encore', 100.00, 110.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (2, 'Eminem', 'marshall mathers', 102.00, 112.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (3, 'Eminem', 'eminem show', 103.00, 113.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (4, '2pac', 'all eyez on me', 200.00, 220.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (5, 'Canserbero', 'vida', 100.00, 110.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (6, 'Canserbero', 'muerte', 100.00, 110.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (7, 'Proof', 'vedugo', 90.00, 100.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (8, 'The notorius B.I.G', 'ready to die', 200.00, 220.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (9, 'Cartel de santa', 'golpe avisa', 150.00, 160.00);
INSERT INTO music.products (product_code, artist, title, cost, sale_price) VALUES (10, 'Cartel de santa', 'Sin copa', 150.23, 160.67);
