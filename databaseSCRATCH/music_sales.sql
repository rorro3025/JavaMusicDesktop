create table sales
(
    outlet_number int  not null,
    emp_number    int  not null,
    customer_id   int  not null,
    product_code  int  not null,
    sale_date     date null,
    sale_time     time null,
    quantity      int  null,
    constraint sale_emp_fk
        foreign key (emp_number) references employees (emp_number)
            on update cascade on delete cascade,
    constraint sales_customer_fk
        foreign key (customer_id) references customers (customer_id)
            on update cascade on delete cascade,
    constraint sales_outlet_fk
        foreign key (outlet_number) references outlets (outlet_number)
            on update cascade on delete cascade,
    constraint sales_product
        foreign key (product_code) references products (product_code)
            on update cascade on delete cascade
);

create index sale_emp_fk_idx
    on sales (emp_number);

create index sales_customer_fr_idx
    on sales (customer_id);

create index sales_outlet_fk_idx
    on sales (outlet_number);

create index sales_product_idx
    on sales (product_code);

