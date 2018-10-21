use lagou;

-- 消费者表
create table wl_customer
(
	customer_id nvarchar(10) not null unique primary key,
	customer_name nvarchar(10) ,
	customer_sex int ,
	user_id nvarchar(10),
	customer_pwd nvarchar(10) ,
	customer_phone nvarchar(20),
	customer_birth datetime,
	customer_address nvarchar(50),
	note nvarchar(50),
	foreign key(user_id) references wl_user(user_id)
);

drop table wl_customer;
select * from wl_customer;
desc wl_customer;


-- 订单表
create table wl_order
(
	order_id nvarchar(10) not null primary key,
	order_type int ,
	order_num nvarchar(10),
	cargo_name nvarchar(20),
	cargo_weight int,
	mail_people nvarchar(20),
	mail_address nvarchar(50),
	consignee_address nvarchar(50),
	order_start int ,
	mail_phone nvarchar(20),
	consignee nvarchar(20),
	consignee_phone nvarchar(20),
	starting_city nvarchar(10),
	middle_city nvarchar(10),
	end_city nvarchar(10),
	shipping_price decimal(18,0),
	delivery_price decimal(18,0),
	count_price nvarchar(10),
	car nvarchar(10),
	note nvarchar(50)
)
drop table wl_order;
select *from wl_order;

-- 车辆表
create table wl_car
(
	car_id nvarchar(10) not null primary key,
	car_model nvarchar(10),
	produce_place nvarchar(20),
	route_num nvarchar(10),
	produce_date datetime,
	buy_date datetime,
	note nvarchar(50),
	foreign key(route_num) references wl_route(route_num)
)

-- 路线表
create table wl_route
(
	route_num nvarchar(10) not null primary key,
	route_name nvarchar(10),
	startint_province nvarchar(10),
	starting_cnum  nvarchar(10),
	middle_pnum nvarchar(10),
	middle_cnum nvarchar(10),
	end_pnum nvarchar(10),
	end_cnum nvarchar(10),
	transport_price decimal(18,0),
	note  nvarchar(10),
	foreign key(startint_province) references wl_province(province_id),
	foreign key(starting_cnum) references wl_city(city_id),
	foreign key(middle_pnum) references wl_province(province_id),
	foreign key(middle_cnum) references wl_city(city_id),
	foreign key(end_pnum) references wl_province(province_id),
	foreign key(end_cnum) references wl_city(city_id)
	
)


-- 城市表
create table wl_city
(
	city_id nvarchar(10) not null primary key,
	city_name nvarchar(10),
	province_id nvarchar(10),
	foreign key(city_id) references wl_province(province_id)
)

-- 城市区域表
create table wl_cregion
(
	region_id nvarchar(10) not null primary key,
	region_name nvarchar(10),
	city_id nvarchar(50),
	foreign key (city_id) references wl_city(city_id)
)

--省份表
create table wl_province
(
	province_id nvarchar(10) not null primary key,
	province_name nvarchar(10)
)

-- 管理员表
create table wl_admin
(
	admin_id nvarchar(10) not null primary key,
	admin_name nvarchar(10),
	admin_sex int ,
	user_id nvarchar(10),
	admin_start int ,
	admin_city nvarchar(10),
	admin_address nvarchar(10),
	admin_pwd nvarchar(10),
	admin_phone nvarchar(20),
	note nvarchar(50),
	foreign key (user_id) references wl_user(user_id)
)


-- 交接单
create table wl_recipt
(
	origin_city nvarchar(10) not null primary key,
	terminus_city nvarchar(10),
	arrived_city nvarchar(10),
	recipt_status int ,
	recipt_time datetime,
	note nvarchar(50)
)

-- 配送点
create table wl_distribution
(
	distribution_id int not null primary key,
	distribution_name nvarchar(10),
	province_id nvarchar(10),
	city_id nvarchar(10),
	admin_id nvarchar(10),
	phone nvarchar(20),
	distribution_address nvarchar(50),
	note nvarchar(50),
	foreign key (province_id) references wl_province(province_id),
	foreign key (city_id) references wl_city(city_id),
	foreign key (admin_id) references wl_admin(admin_id)
)

drop table wl_distribution;

-- 配送范围(d:distribution )
create table wl_darea
(
	darea_id int not null primary key,
	darea_name nvarchar(10) ,
	darea_price decimal(18,0),
	city_id nvarchar(10),
	note nvarchar(50),
	foreign key (city_id) references wl_city(city_id)
)

-- 用户组表
create table wl_user
(
	user_id nvarchar(10) not null primary key,
	user_name nvarchar(10) not null ,
	note nvarchar(50)
)