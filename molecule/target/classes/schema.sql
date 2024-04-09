CREATE TABLE IF NOT EXISTS `molecule` (
   `molecule_id` int NOT NULL AUTO_INCREMENT,
   `account_id` varchar(50) NOT NULL,
   `molecule_name` varchar(100) NOT NULL,
   `molecule_formula` varchar(50) NOT NULL,
   `molecule_description` varchar(200),
   `molecule_inchi` varchar(300) NOT NULL,
   `img_url` varchar(200),
   `molecule_detail_id` int,
   `created_at` date NOT NULL,
   `created_by` varchar(20) NOT NULL,
   `updated_at` date DEFAULT NULL,
   `updated_by` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`molecule_id`)
);

CREATE TABLE IF NOT EXISTS `group` (
    `group_id` int NOT NULL AUTO_INCREMENT,
    `account_id` int NOT NULL,
    `group_name` varchar(20) NOT NULL,
    `group_description` varchar(200),
    `created_at` date NOT NULL,
    `created_by` varchar(20) NOT NULL,
    `updated_at` date DEFAULT NULL,
    `updated_by` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`group_id`)
);

CREATE TABLE IF NOT EXISTS `molecule_group` (
   `molecule_group_id` int NOT NULL AUTO_INCREMENT,
   `group_id` int NOT NULL,
   `molecule_id` int NOT NULL,
   `created_at` date NOT NULL,
   `created_by` varchar(20) NOT NULL,
   `updated_at` date DEFAULT NULL,
   `updated_by` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`molecule_group_id`)
);
