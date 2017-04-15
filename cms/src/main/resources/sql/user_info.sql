DROP TABLE IF EXISTS `user_info`;  
  
CREATE TABLE `user_info` (  
  `sid` int(11) NOT NULL AUTO_INCREMENT,  
  `username` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`sid`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `user_t` */  
  
insert  into `user_info`(`sid`,`username`,`password`,`age`) values (1,'zjj','123456',24);  