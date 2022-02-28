create table items (
    id integer not null, 
    item_name varchar(255),
    price float, 
    item_description varchar(255), 
    item_image varchar(255), 
    update_on date,
  
    primary key (id)
   
);
