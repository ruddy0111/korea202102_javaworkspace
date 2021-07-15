package music;
//볼륨 조절, mp3파일 지원
/*추상 클래스를 상속받게 되는 자식은, 부모가 불완전하게 남겨놓은 빚더미인 불완전 메서드를 완성할 의무를 가지게 된다.

강제 구현 처지에 놓기에 된다.
extends = is a
*/
import riding.Roller;
import aircraft.Zetwing;

//자바에서는 다중 상속을 금지하고 있다. 즉, 자식 클래스가 특정 클래스를 부모로 둔다면 더이상 다른 클래스를 추가해서 부모로 지정할 수 없다.

public class MP3Player extends MusicPlayer implements Roller, Zetwing{
   public void setVolume(){
      System.out.println("MP3플레이어의 볼륨을 조절합니다.");
   } 
   public void openMP3(){
      System.out.println("MP3파일을 지원합니다..");
   }
    public void roll(){
      System.out.println("롤링 기능을 지원합니다..");
   }
    public void fly(){
      System.out.println("음악을 들으며 하늘을 날아갑니다..");
   }
}