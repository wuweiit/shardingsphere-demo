CREATE SCHEMA IF NOT EXISTS demo_ds;
CREATE SCHEMA IF NOT EXISTS demo_ds_0;
CREATE SCHEMA IF NOT EXISTS demo_ds_1;

use demo_ds_0;

CREATE TABLE IF NOT EXISTS t_order_2021
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2022
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2023
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2024
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2025
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);


use demo_ds_1;

CREATE TABLE IF NOT EXISTS t_order_2021
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2022
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2023
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2024
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS t_order_2025
(
    order_id   BIGINT AUTO_INCREMENT,
    user_id    INT    NOT NULL,
    address_id BIGINT NOT NULL,
    STATUS     VARCHAR(50),
    PRIMARY KEY (order_id)
);