package app0526.ex2;

import javax.swing.JProgressBar;

//내가 이미 누군가의 자식이라면,  Thread를 상속받을 수는 없다.
//단, 쓰레드가 보유한 run() 메서드만을 보유하고 있는 인터페이스인 Runnable인터페이스 구현 가능.

public class BarThread extends JProgressBar implements Runnable{
	int n;
	int step;
	
	public BarThread(int step) {
		this.step=step;
		
	}
	
	public void run() {
		while(true) {
			n+=step;
			setValue(n);
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
