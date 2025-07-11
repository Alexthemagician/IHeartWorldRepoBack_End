CREATE USER 'iheartworld'@'localhost'IDENTIFIED BY 'iheartworld';
GRANT ALL PRIVILEGES ON *.* TO 'iheartworld'@'localhost';
ALTER USER 'iheartworld'@'localhost' IDENTIFIED WITH mysql_native_password BY 'iheartworld';