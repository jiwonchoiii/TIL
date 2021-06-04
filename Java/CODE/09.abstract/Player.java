

abstract class Player {

	boolean pause; // �Ͻ����� ���¸� �����ϱ� ���� ����
	int currentPos;// ���� ����ǰ� �ִ� ��ġ�� �����ϱ� ���� ����

	Player() { // �߻�Ŭ������ �����ڰ� �־�� �Ѵ�.
		pause = false;
		currentPos = 0;
	}

	abstract void play(int pos);

	abstract void stop();

	void play() { // �߻� �޼��带 ����� �� �ִ�.
		play(currentPos);
	}

	void pause() {
		if (pause) { // pause�� true�λ��� - �� ���� ���¿��� pause�޼��尡 ȣ��Ǹ�
			pause = false; // pause�� ���¸� false�� �ٲٰ�
			play(currentPos); // ���� ��ġ���� play�Ѵ�

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
		void stop() { // {}��ȣ�� �־ �߻�޼��尡 �ƴ� �Ϲ� �޼���� ���ֵȴ�.

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
