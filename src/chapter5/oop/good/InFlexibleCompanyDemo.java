package chapter5.oop.good;

public class InFlexibleCompanyDemo {
    public static void main(String[] args) {
    	//Employee e = new Employee(); Employee 추상메서드로 선언으로 사용 불가능
    	Employee mereClerk1 = new MereClerk("철수", 100);
    	Employee mereClerk2 = new MereClerk("영희", 200);
    	
    	Employee manager = new Manager("홍길동", 200, "개발부"); // (1) List list = new ArrayList();
    	Manager manager2 = new Manager("둘리", 300, "인사부"); // (2) ArrayList list2 = new ArrayList();
    	
    	//manager. 했을때 타입으로 인해서 이름과 salary만 가능하다.
    	//Employee 타입
    	System.out.println(manager.getName() + " " + manager.getSalary());
    	//Manager 타입
    	System.out.println(manager2.getName() + " " + manager2.getSalary() + " " + manager2.getDepartment());
        
//        MereClerk mereClerk1 = new MereClerk("철수", 100);
//        MereClerk mereClerk2 = new MereClerk("영희", 100);
//        Manager manager = new Manager("홍길동", 200);

        
        
        System.out.println("현재 월급입니다.");
        
        System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
        System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
        System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

        System.out.println("");
        
        
        System.out.println("올린 후의 월급입니다.");
        
        mereClerk1.manageSalary(10);
        System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
        
        mereClerk2.manageSalary(10);
        System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
        
        manager.manageSalary(10);
        System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");
        
   }
}

;