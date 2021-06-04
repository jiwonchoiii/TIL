

abstract class Player {

	boolean pause; // 일시정지 상태를 저장하기 위한 변수
	int currentPos;// 현재 재생되고 있는 위치를 저장하기 위한 변수

	Player() { // 추상클래스도 생성자가 있어야 한다.
		pause = false;
		currentPos = 0;
	}

	abstract void play(int pos);

	abstract void stop();

	void play() { // 추상 메서드를 사용할 수 있다.
		play(currentPos);
	}

	void pause() {
		if (pause) { // pause가 true인상태 - 즉 정지 상태에서 pause메서드가 호출되면
			pause = false; // pause의 상태를 false로 바꾸고
			play(currentPos); // 현재 위치에서 play한다

		} else
			pause = true;
		stop();

	}

	class CDPlayer extends Player {
		int currentTrack;

		@Override
		void play(int currentPos) {
			play(currentTrack);
		}

		@Override
		void stop() { // {}괄호만 있어도 추상메서드가 아닌 일반 메서드로 간주된다.

		}

		void nextTrack() {
			currentTrack++;
		}

		void prevTrack() {
			if (currentTrack > 1)
				currentTrack--;
		}

	}
}
