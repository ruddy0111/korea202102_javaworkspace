//������ ������ ����
class Dog{
/*�������� ���� �� �ִ� �Ӽ����� ������ �����غ���
      �ϳ��� Ŭ������ ������ �������� ������ ��ü�� �ݿ��� ����, �Ӽ��� ǥ���ߴٰ� �Ͽ�
      property��(�Ӽ�) �Ѵ�
    */
   int age=5;
   String color="white";//js�� ���� ���ڿ��� ��ü�� ó��
   String name="Loli";

   //�Լ� �� �޼��� ���� js �� �ణ �ٸ���
   //public  ���� ������, void = �� �޼��ٰ� ��ȯ���� ����

   public String getName(){ //String ��ȯ �޼���
      return name;
   }

   public int getAge(){
      return age;
   }
   public void run(){
      System.out.println(name+"�� �پ��");
   }
}