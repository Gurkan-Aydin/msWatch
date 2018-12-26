create table ms_list_type
(
  id        int         not null
    primary key,
  type_name varchar(20) null
);

create table producer
(
  id            int         not null
    primary key,
  producer_name varchar(20) null
);

create table movies_series
(
  id           int         not null
    primary key,
  title        varchar(20) null,
  point        int         null,
  cover        varchar(45) null,
  producer_id  int         null,
  time         int         null,
  release_date date        null,
  is_series    varchar(45) null,
  constraint movies_series_producer_id_fk
    foreign key (producer_id) references producer (id)
      on update cascade on delete cascade
);

create table movies
(
  id         int         not null
    primary key,
  video_link varchar(45) null,
  constraint movies_movies_series_id_fk
    foreign key (id) references movies_series (id)
      on update cascade on delete cascade
);

create table series
(
  id            int  not null
    primary key,
  end_date      date null,
  season_number int  null,
  constraint series_movies_series_id_fk
    foreign key (id) references movies_series (id)
);

create table episode
(
  id             int         not null
    primary key,
  series_id      int         null,
  season_number  int         null,
  episode_number int         null,
  episode_name   varchar(20) null,
  episode_time   int         null,
  video_link     varchar(45) null,
  constraint episode_series_id_fk
    foreign key (series_id) references series (id)
);

create table status
(
  id          int         not null
    primary key,
  status_name varchar(20) null
);

create table type
(
  id        int         not null
    primary key,
  type_name varchar(45) null
);

create table user
(
  id        int          not null
    primary key,
  name      varchar(20)  null,
  lastname  varchar(20)  null,
  user_name varchar(45)  null,
  password  varchar(45)  null,
  birthday  date         null,
  open_date date         null,
  email     varchar(255) null
);

create table ms_type
(
  type_id int null,
  user_id int null,
  constraint ms_type_pk
    unique (type_id, user_id),
  constraint fk_id
    foreign key (type_id) references type (id)
      on update cascade on delete cascade,
  constraint fk_user_id
    foreign key (user_id) references user (id)
      on update cascade on delete cascade
);

create table user_ms_list
(
  id    int not null
    primary key,
  ms_id int null,
  u_id  int null,
  type  int null,
  constraint favorite_movies_series_id_fk
    foreign key (ms_id) references movies_series (id)
      on update cascade on delete cascade,
  constraint favorite_user_id_fk
    foreign key (u_id) references user (id)
      on update cascade on delete cascade,
  constraint user_ms_list_ms_list_type_id_fk
    foreign key (type) references ms_list_type (id)
      on update cascade on delete cascade
);

create table user_type
(
  id        int not null
    primary key,
  user_id   int null,
  status_id int null,
  constraint user_type_status_id_fk
    foreign key (status_id) references status (id)
      on update cascade on delete cascade,
  constraint user_type_user_id_fk
    foreign key (user_id) references user (id)
      on update cascade on delete cascade
);


