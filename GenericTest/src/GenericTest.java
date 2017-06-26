/*
	 제네릭 클래스 만드는 방법
	 
class 클래스명<제네릭문자>{
	제네릭문자 변수명; //제네릭을 이용한 변수 선언
	
	제네릭문자 메서드명(){	// 반환값이 있는 메서드에서 사용한다.
		return 값;
	}
}

-- 많이 사용되는 제네릭 문자 --
T ==> Type
K ==> Key
V ==> Value
E ==> Element (자료구조에 들어가는 것들을 나타낼 때 사용한다.)



 */
class NonGenericClass{
	private Object val;
	
	public void setVal(Object v){
		this.val = v;
	}
	public Object getVal(){
		return val;
	}
}

//제네릭 사용하기
class MyGenericClass<T>{
	private T val;

	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	
	
}


public class GenericTest {
	public static void main(String[] args){
	
		NonGenericClass ng1 = new NonGenericClass();
		ng1.setVal("가나다라");
//		ng1.setVal(new Integer(10));
		String rtn = (String)ng1.getVal();
		System.out.println("문자열 : " + rtn);
		
		NonGenericClass ng2 = new NonGenericClass();
		ng1.setVal(100);
		Integer irtn = (Integer)ng2.getVal();
		System.out.println("정수 변환 : " + irtn);
		
		MyGenericClass<String> mg1 = new MyGenericClass<String>();
		mg1.setVal("대한민국");
		rtn = mg1.getVal();

		MyGenericClass<Integer> mg2 = new MyGenericClass<Integer>();
		mg2.setVal(100);
		irtn = mg2.getVal();
	
	
	
	}
}
