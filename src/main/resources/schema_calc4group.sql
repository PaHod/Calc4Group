
CREATE TABLE expense_participants
(
  paid_for   INT                                                      NOT NULL,
  share_type ENUM ('equal', 'amount', 'percente', 'equal_and_amount') NULL,
  amount     MEDIUMTEXT                                               NOT NULL,
  expense_id INT                                                      NULL
)
  ENGINE = InnoDB;

CREATE TABLE expenses
(
  expense_id  INT AUTO_INCREMENT
    PRIMARY KEY,
  created_by  INT  NULL,
  paid_by     INT  NULL,
  create_date DATE NULL,
  resolved    INT  NULL
)
  ENGINE = InnoDB;

CREATE TABLE group_events
(
  group_id   INT AUTO_INCREMENT
    PRIMARY KEY,
  group_name VARCHAR(25) NULL
)
  ENGINE = InnoDB;

CREATE TABLE users
(
  user_id  INT AUTO_INCREMENT
    PRIMARY KEY,
  username VARCHAR(25) NOT NULL,
  password VARCHAR(25) NULL,
  email    VARCHAR(45) NULL
)
  ENGINE = InnoDB;


