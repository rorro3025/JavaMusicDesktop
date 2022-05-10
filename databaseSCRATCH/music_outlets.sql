create table outlets
(
    outlet_number int auto_increment
        primary key,
    address       varchar(255) not null,
    city          varchar(255) not null,
    state         varchar(255) not null,
    zip           varchar(10)  not null,
    phone         varchar(10)  not null
);

INSERT INTO music.outlets (outlet_number, address, city, state, zip, phone) VALUES (1, 'wallstreet', 'coyoacan', 'CDMX', '1234', '551379806');
INSERT INTO music.outlets (outlet_number, address, city, state, zip, phone) VALUES (2, 'tulipanes 12', 'coacalco', 'Edo Mexico', '4312', '551223123');
INSERT INTO music.outlets (outlet_number, address, city, state, zip, phone) VALUES (3, 'ortencias 14', 'tultitlan', 'Edo Mexico', '6904', '55333333');
INSERT INTO music.outlets (outlet_number, address, city, state, zip, phone) VALUES (4, 'San Miguel 22', 'polanco', 'CDMX', '7890', '551111111');
