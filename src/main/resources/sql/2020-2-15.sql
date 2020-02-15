ALTER TABLE `technologyforum`.`t_user`
ADD COLUMN `c_salt` varchar(255) NOT NULL AFTER `c_password`;