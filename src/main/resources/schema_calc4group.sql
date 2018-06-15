create table expense
(
  expenseId int auto_increment
    primary key,
  createdBy int null,
  paidBy int null,
  createDate date null,
  resolved int null
)
  engine=InnoDB
;

create table expense_participant
(
  paidFor int not null,
  shareType enum('equal', 'amount', 'percente', 'equal_and_amount') null,
  amount mediumtext not null,
  expenseId int null
)
  engine=InnoDB
;

create table group_event
(
  groupId int auto_increment
    primary key,
  groupName varchar(25) null,
  constraint groupId_UNIQUE
  unique (groupId)
)
  engine=InnoDB
;

create table group_users
(
  groupId int not null,
  userId int not null
)
  engine=InnoDB
;

create table user
(
  userId int auto_increment
    primary key,
  username varchar(25) not null,
  password varchar(25) null,
  email varchar(45) null,
  constraint userId_UNIQUE
  unique (userId),
  constraint username_UNIQUE
  unique (username)
)
  engine=InnoDB
;

