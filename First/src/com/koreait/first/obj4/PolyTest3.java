package com.koreait.first.obj4;

public class PolyTest3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Fish fish = new Fish();

//		PolyTest3 p3 = new PolyTest3(); //메서드 선언부에 static이 없다면, PolyTest3에 접근할 수 있는 주소값 생성
//		p3.polyCry(dog);
//		p3.polyCry(cat);
//		p3.polyCry(bird);

		polyCry(dog);
		polyCry(cat);
		polyCry(bird);
		polyCry(fish);
//		bird.flying();

	}

//static이 없는경우, PolyTest3에 접속할수 있는 주소값 생성 후 사용 (ex p3.polyCry(value))
//static은 메모리공간에 이미 올라가있으므로, 메서드 호출시에 바로 접근가능하게 해준다.	
	public static void polyCry(Animal a) {
		a.crying();
//		if (a instanceof Dog) {
////			Dog dog = (Dog)a;
////			dog.shakeTail();
//			((Dog) a).shakeTail();

		}
	}
//}
