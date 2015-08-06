## Adapter 패턴 ##
: 한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환한다.
어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다.

- 사용예제 (http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries)
 . java.util.Arrays#asList()
 . java.io.InputStreamReader(InputStream) (returns a Reader)
 . java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 . javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()
- Class Adapter
 . 지구인과 외계인과 대화하기
 . java는 다중 상속을 지원하지 않기 때문에, class Adapter 적용이 불가능하나, 꼼수로
   interface와 상속을 사용하여 구현해보자
- Object(Instance) Adpater
- 관계 이해하기
  . target : LivingThing.java, 지금 필요한 메소드를 결정
  . client : Main.java, target, 역할에 있는 메소드를 가지고 일을 한다.
  . Adapter : EarthianAdapter.java, 주인공으로 Adaptee 역할의 메소드를 사용해서 Target 역할을 만족시키기 위한 것
  . Adaptee : Alian.java, 이미 준비되어 있는 메소드를 가지고 있는 역할
  * Class Adapter : Adapter의 역할은 '상속'을 사용한 Adpater 역할을 이용
  * Object Adapter : '위임'을 사용한 Adapter 역할 수행
- [When use adapter pattern]
  . 이미 존재하고 있는 클래스 재사용
  . 기존의 클래스를 개조해서 필요한 클래스를 만든다. -> 필요한 메소드를 발빠르게 만들 수 있다.
  . 만약 버그가 발생해도 기존의 클래스 에는 버그가 없으므로 Adapter 역할의 클래스를 중점적으로 조사 -> 프로그램 검사도 상당히 쉽다.
- [Why use adapter pattern]
  . 이미 만들어진 클래스를 새로운 인터페이스에 맞게 개조를 할 때
  . 기존 클래스 수정 -> 테스트 수행 필요 -> 추가 비용소요
  . Adapter 패턴은 기존의 클래스를 전혀 수정하지 않고 목적한 인터페이스에 맞추려는 것
  . Adapter 패턴에서는 기존 클래스의 소스 프로그램이 반드시 필요 없다.
  . 기존 클래스의 사양만 알면 새로운 클래스를 만들 수 있다.
- [생각]
 . 한 어댑터에 한 클래스만 감싸지 않아도 된다. 다중 어댑터도 얼마든지 가능하다. 
    대형 타켓 인터페이스를 구현해야 되는 경우 할 일이 많아진다고 생각할 수도 있지만, 
    그 경우에 어댑터를 사용하지 않는다고 하면 어차피 클라이언트 코드의 상당 부분을 고쳐야 한다. 결국 할 일이 많아진다는 건 변하지 않는다.
- [관련 패턴]
 . Bridge 패턴
  . Adapter 패턴은 인터페이스가 서로 다른 클래스들을 연결하는 패턴입니다.
  . Bridge 패턴은 기능의 계층과 구현의 계층을 연결시키는 패턴입니다.
 . Decorator 패턴
  . Adapter 패턴은 인터페이스의 차리를 조정하기 위한 패턴입니다.
  . Decorator 패턴은 인터페이스를 수정하지 않고 기능을 추가하는 패턴입니다.
- 참조 사이트
 . Heade-First 기본 : http://secretroute.tistory.com/entry/Head-First-Design-Patterns-제7강-Adapter-패턴과-Facade-패턴
 . Adapter 패턴의 장단점 : http://choipattern.blogspot.kr/2013/08/adapter.html
 