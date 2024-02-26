CREATE TABLE IF NOT EXISTS `molecule` (
   `molecule_id` int NOT NULL AUTO_INCREMENT,
   `customer_id` int NOT NULL,
   `s3_location` varchar(200),
   `formula` varchar(50),
   `inchi` varchar(150),
   `created_at` date NOT NULL,
   `created_by` varchar(20) NOT NULL,
   `updated_at` date DEFAULT NULL,
   `updated_by` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`molecule_id`)
);

CREATE TABLE IF NOT EXISTS `group` (
    `group_id` int NOT NULL AUTO_INCREMENT,
    `group_name` varchar(50) NOT NULL,
    `customer_id` int NOT NULL,
    `created_at` date NOT NULL,
    `created_by` varchar(20) NOT NULL,
    `updated_at` date DEFAULT NULL,
    `updated_by` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`group_id`)
);

CREATE TABLE IF NOT EXISTS `molecule_grouping` (
   `molecule_grouping_id` int NOT NULL AUTO_INCREMENT,
   `group_id` int NOT NULL,
   `molecule_id` int NOT NULL,
   `created_at` date NOT NULL,
   `created_by` varchar(20) NOT NULL,
   `updated_at` date DEFAULT NULL,
   `updated_by` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`molecule_grouping_id`)
);
