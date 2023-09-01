package com.jslhrd.exam02;
interface DataAccess{
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccess{
	@Override
	public void select() {
		System.out.println("Oracle select()");
	}
	@Override
	public void insert() {
		System.out.println("Oracle insert()");		
	}
	@Override
	public void update() {
		System.out.println("Oracle update()");
	}
	@Override
	public void delete() {
		System.out.println("Oracle sdelete()");		
	}
}
class MySqlDao implements DataAccess{
	@Override
	public void select() {
		System.out.println("MySql select()");		
	}
	@Override
	public void insert() {
		System.out.println("MySql insert()");		
	}
	@Override
	public void update() {
		System.out.println("MySql update()");				
	}
	@Override
	public void delete() {
		System.out.println("MySql delete()");				
	}
}
public class DaoExam {
	private static void dbWork(DataAccess dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
