CREATE DATABASE food_reservation_160424066;
USE food_reservation_160424066;

CREATE TABLE users (
    id         INT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(50)  NOT NULL UNIQUE,
    password   VARCHAR(50)  NOT NULL,
    name       VARCHAR(100) NOT NULL,
    role       ENUM('admin','customer') DEFAULT 'customer',
    login_at   DATETIME
);

-- Data awal: akun admin
INSERT INTO users (username, password, name, role)
VALUES ('admin', 'admin123', 'Administrator', 'admin');

CREATE TABLE tables_resto (
    id           INT AUTO_INCREMENT PRIMARY KEY,
    table_number VARCHAR(10)  NOT NULL,
    capacity     INT          NOT NULL,
    status       ENUM('available','reserved','occupied') DEFAULT 'available'
);

-- Data awal: 10 meja
INSERT INTO tables_resto (table_number, capacity) VALUES
    ('T01',2), ('T02',2), ('T03',4), ('T04',4), ('T05',4),
    ('T06',6), ('T07',6), ('T08',8), ('T09',8), ('T10',10);

CREATE TABLE menu_items (
    id        INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(100)  NOT NULL,
    category  VARCHAR(50)   NOT NULL,
    price     DECIMAL(10,2) NOT NULL,
    available TINYINT(1)    DEFAULT 1
);

-- Data awal
INSERT INTO menu_items (name, category, price) VALUES
    ('Nasi Goreng Spesial', 'Makanan', 35000),
    ('Mie Goreng',          'Makanan', 28000),
    ('Ayam Bakar',          'Makanan', 45000),
    ('Soto Ayam',           'Makanan', 25000),
    ('Es Teh Manis',        'Minuman',  8000),
    ('Jus Alpukat',         'Minuman', 18000),
    ('Es Jeruk',            'Minuman', 10000);

CREATE TABLE reservations (
    id               INT AUTO_INCREMENT PRIMARY KEY,
    user_id          INT NOT NULL,
    table_id         INT NOT NULL,
    reservation_date DATE NOT NULL,
    reservation_time TIME NOT NULL,
    guest_count      INT  NOT NULL,
    status           ENUM('pending','confirmed','cancelled') DEFAULT 'pending',
    created_at       DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id)  REFERENCES users(id),
    FOREIGN KEY (table_id) REFERENCES tables_resto(id)
);

CREATE TABLE order_items (
    id             INT AUTO_INCREMENT PRIMARY KEY,
    reservation_id INT NOT NULL,
    menu_id        INT NOT NULL,
    quantity       INT NOT NULL DEFAULT 1,
    status         ENUM('Pending','Preparing','Ready','Served') DEFAULT 'Pending',
    FOREIGN KEY (reservation_id) REFERENCES reservations(id),
    FOREIGN KEY (menu_id)        REFERENCES menu_items(id)
);
