-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school` DEFAULT CHARACTER SET utf8 ;
USE `school` ;

-- -----------------------------------------------------
-- Table `school`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`addresses` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `number` VARCHAR(10) NOT NULL,
  `floor` SMALLINT(3) NULL DEFAULT NULL,
  `apartmentNo` SMALLINT(3) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`disciplines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`students` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `enrollmentDate` DATE NOT NULL,
  `address_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_student_address_idx` (`address_id` ASC),
  CONSTRAINT `FK_student_address`
    FOREIGN KEY (`address_id`)
    REFERENCES `school`.`addresses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`disciplines_studied`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines_studied` (
  `discipline_id` INT(11) NOT NULL,
  `student_id` INT(11) NOT NULL,
  PRIMARY KEY (`discipline_id`, `student_id`),
  INDEX `discipline_idx` (`discipline_id` ASC),
  INDEX `student_idx` (`student_id` ASC),
  CONSTRAINT `FK_discipline_discipline_student`
    FOREIGN KEY (`discipline_id`)
    REFERENCES `school`.`disciplines` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_student_discipline_student`
    FOREIGN KEY (`student_id`)
    REFERENCES `school`.`students` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`teachers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `salary` DECIMAL(10,0) NOT NULL,
  `address_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `Id_UNIQUE` (`id` ASC),
  INDEX `FK_teacher_address_idx` (`address_id` ASC),
  CONSTRAINT `FK_teacher_address`
    FOREIGN KEY (`address_id`)
    REFERENCES `school`.`addresses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`disciplines_taught`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines_taught` (
  `discipline_id` INT(11) NOT NULL,
  `teacher_id` INT(11) NOT NULL,
  PRIMARY KEY (`discipline_id`, `teacher_id`),
  INDEX `teacher_idx` (`teacher_id` ASC),
  CONSTRAINT `FK_discipline_discipline_teacher`
    FOREIGN KEY (`discipline_id`)
    REFERENCES `school`.`disciplines` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_teacher_discipline_teacher`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `school`.`teachers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

insert into teachers (name, email, salary) values ('Peter Ivanov', 'pivanov@gmail.com', 1921.5);
insert into teachers (name, email, salary) values ('Georgi Stoimenov', 'stoimenov@gmail.com', 1787.25);
insert into teachers (name, email, salary) values ('Nataliya Yordanova', 'nyyoo@abv.bg', 1888.21);
insert into teachers (name, email, salary) values ('Simeon Prodanov', 'sprod@yahoo.com', 1341.60);

insert into students (name, enrollmentDate) values ('Georgi Georgiev', '2000-10-22');
insert into students (name, enrollmentDate) values ('Stoyan Ivanov', '2010-11-18');
insert into students (name, enrollmentDate) values ('Mariya Grozdanova', '2009-05-27');
insert into students (name, enrollmentDate) values ('“Stefaniya Petkova', '2007-01-12');

insert into disciplines (name) values ('Mathematics');
insert into disciplines (name) values ('Geography');
insert into disciplines (name) values ('Physics');
insert into disciplines (name) values ('Informatics');

insert into addresses (country, city, street, number, floor, apartmentNo) values ('Bulgaria', 'Sofia', 'Boris', 211, 2, 5);
insert into addresses (country, city, street, number, floor, apartmentNo) values ('Bulgaria', 'Plovdiv', 'Bair Tepe', 8, 30, 124);
insert into addresses (country, city, street, number, floor, apartmentNo) values ('Bulgaria', 'Sofia', 'Vitosha', 6, 10, 63);
insert into addresses (country, city, street, number, floor, apartmentNo) values ('Sweden', 'Malmo', 'Karl Gustavson', 10, null, null);
insert into addresses (country, city, street, number, floor, apartmentNo) values ('Poland', 'Warsaw', 'Pliskice', 15, null, null);
insert into addresses (country, city, street, number, floor, apartmentNo) values ('Poland', 'Krakow', 'Universitat', 2, 1, 6);
insert into addresses (country, city, street, number, floor, apartmentNo) values ('Uruguay', 'Montevideo', 'Fortuna', 3, 3, 10);


-- Number of students who live in Sweden
select count(1), a.country
  from students s
  join addresses a on s.address_id = a.id
group by a.country;

select avg(t.salary), a.country, a.city
  from teachers t
  join addresses a on t.address_id = a.id
group by a.country, a.city
having avg(t.salary) > 1700;

-- where a.country = 'Bulgaria';

-- Number of Teachers who live in Bulgaria
-- Average Salary of teachers in Bulgaria
-- Max Salary of Math Teachers in Bulgaria
select max(salary)
  from teachers t
  join addresses a on t.address_id = a.id
  join disciplines_taught dt on dt.teacher_id = t.id
  join disciplines d on dt.discipline_id = d.id
where d.name = 'Mathematics' and a.country = 'Bulgaria';

-- Number of people who live in Bulgaria
select count(1) from
(
	select 'teacher', t.id, a.country
	  from teachers t
      join addresses a on a.id = t.address_id
	union
	select 'student', s.id, a.country
	  from students s
      join addresses a on a.id = s.address_id
) as tbl
where country = 'Bulgaria';

-- Number of people by countries (filter only those with more than 1 person)
select count(1), country from
(
	select 'teacher' as type, t.id, a.country
	  from teachers t
      join addresses a on a.id = t.address_id
	union all
	select 'student' as type, s.id, a.country
	  from students s
      join addresses a on a.id = s.address_id
) as tbl
group by country;

select count(1), country, type from
(
	select 'teacher' as type, t.id, a.country
	  from teachers t
      join addresses a on a.id = t.address_id
	union all
	select 'student' as type, s.id, a.country
	  from students s
      join addresses a on a.id = s.address_id
) as tbl
group by country, type;

-- Teachers with disciplines
select *
  from teachers t
  join disciplines_taught dt on t.id = dt.teacher_id
  join disciplines d on dt.discipline_id = d.id
where d.name='Mathematics';

-- Avg salary of math teachers
select avg(salary)
  from teachers t
  join disciplines_taught dt on t.id = dt.teacher_id
  join disciplines d on dt.discipline_id = d.id
where d.name='Mathematics';