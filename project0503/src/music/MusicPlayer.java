package music;
//불완전한 추상메서드가 단 하나라도 섞여있으면 이 클래스도 완전하지 못한 클래스로 간주.
//이런 클래스를 추상클래스라 한다.
public abstract class MusicPlayer{
	//장차 이 클래스를 상속받는 객체들이 각각 어떤 방법으로 구현될지 해당 시점에서 알 수 없기에 정해놓으면 안된다.
	//따라서 자식에게 구현을 강제해야하므로, 아래의 메서드들은 몸체 없는 불완전한 메서드로 정의한다.
	//이런 메서드를 추상메서드라 한다
	/**
	볼륨을 조절하는 메서드 정의
	*/
	public abstract void setVolume();
	/**
	MP3파일을을 조절하는 메서드 정의
	*/
	public abstract void openMP3();

}