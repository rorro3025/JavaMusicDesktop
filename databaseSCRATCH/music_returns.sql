create table returns
(
    outlet_number int          not null,
    product_code  int          not null,
    customer_id   int          not null,
    return_date   date         null,
    return_time   time         null,
    quantity      int          null,
    reason        varchar(100) null,
    constraint ret_customer_fk
        foreign key (customer_id) references customers (customer_id)
            on update cascade on delete cascade,
    constraint ret_outlet_fk
        foreign key (outlet_number) references outlets (outlet_number)
            on update cascade on delete cascade,
    constraint ret_product_fk
        foreign key (product_code) references products (product_code)
            on update cascade on delete cascade
);

create index ret_customer_fk_idx
    on returns (customer_id);

create index ret_outlet_f_idx
    on returns (outlet_number);

create index ret_product_idx
    on returns (product_code);

