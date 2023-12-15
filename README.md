# store
Jawaban untuk task backend #1
Menggunakan Spring boot java


**Jawaban Soal ke 2 ada di file backend2.sql** :

/* Soal 1 */
select * from employees

/* Soal 2 */
select count(*) from employees 
	where job_title = 'Manager'

/*Soal 3 */
select name, salary from employees 
	where department in ('Marketing', 'Sales')

/*Soal 4 */
select avg(salary) from employees 
	where join_date >= current_date - interval '5' year;

/*Soal 5 */
select e.name, sum(sd.sales) from employees e join sales_data sd 
	on e.employee_id = sd.employee_id 
		group by e.name 
		order by sum(sd.sales) desc
		limit 5

/*Soal 6 */		
select e.name, e.salary, av.average from employees e join 
	(select department, avg(salary) as average from employees 
		group by department 
		order by average 
		desc limit 1) as av
	on e.department = av.department

/*Soal 7 */
select row_number() over (order by sum(sd.sales) desc) as no, e.name, sum(sd.sales) as total 
	from employees e join sales_data sd 
		on e.employee_id = sd.employee_id 
		group by e.name
		
/*Soal 8 */
create or replace function getSalaryFromDepartment(dept varchar)
	returns table (name varchar, salary numeric(9,2))
	as
	$$
		select name, salary
		from employees 
		where department = dept;
	$$
	language sql;

select * from getSalaryFromDepartment('Marketing')



		




















