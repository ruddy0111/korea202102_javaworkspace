package music;
//���� ����, mp3���� ����
/*�߻� Ŭ������ ��ӹް� �Ǵ� �ڽ���, �θ� �ҿ����ϰ� ���ܳ��� �������� �ҿ��� �޼��带 �ϼ��� �ǹ��� ������ �ȴ�.

���� ���� ó���� ���⿡ �ȴ�.
extends = is a
*/
import riding.Roller;
import aircraft.Zetwing;

//�ڹٿ����� ���� ����� �����ϰ� �ִ�. ��, �ڽ� Ŭ������ Ư�� Ŭ������ �θ�� �дٸ� ���̻� �ٸ� Ŭ������ �߰��ؼ� �θ�� ������ �� ����.

public class MP3Player extends MusicPlayer implements Roller, Zetwing{
   public void setVolume(){
      System.out.println("MP3�÷��̾��� ������ �����մϴ�.");
   } 
   public void openMP3(){
      System.out.println("MP3������ �����մϴ�..");
   }
    public void roll(){
      System.out.println("�Ѹ� ����� �����մϴ�..");
   }
    public void fly(){
      System.out.println("������ ������ �ϴ��� ���ư��ϴ�..");
   }
}