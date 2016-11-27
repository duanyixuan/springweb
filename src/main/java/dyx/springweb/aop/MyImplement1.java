package dyx.springweb.aop;

public class MyImplement1 implements MyInter {

	@Override
	public void save(int id) {
		// TODO Auto-generated method stub
		System.out.println("save ->" + id);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

	@Override
	public void exception() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		int c = a / b;
	}

}
