//현실의 강아지 정의
class Dog{
/*강아지가 가질 수 있는 속성들을 변수로 선언해보자
      하나의 클래스가 보유한 변수들은 현실의 객체를 반영한 상태, 속성을 표현했다고 하여
      property라(속성) 한다
    */
   int age=5;
   String color="white";//js와 같이 문자열을 객체로 처리
   String name="Loli";

   //함수 즉 메서드 정의 js 와 약간 다르다
   //public  접근 제한자, void = 이 메서다가 반환값이 없다

   public String getName(){ //String 반환 메서드
      return name;
   }

   public int getAge(){
      return age;
   }
   public void run(){
      System.out.println(name+"가 뛰어요");
   }
}