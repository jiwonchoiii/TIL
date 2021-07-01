package bicycle;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@NoArgsConstructor
@Log4j
public class SmallTire implements ITire {

   int tireLife;

   @Override
   public int roll(int distance) {
      log.debug("roll(distance) invoked.");
      log.info(ITire.SMALL_INCH + "인치 타이어로 자전거가 굴러갑니다.");

      tireLife = ITire.SMALL_INCH_TIRE_LIFE;

      while (this.tireLife > 0) {
         distance = distance - 5; // 한번 주행시 5km, 타이어 수명 -1
         tireLife--;
         log.info("남은 거리 : " + distance + "km / 타이어 수명 : " + this.tireLife);
         if (distance <= 4) {
            log.info("남은거리 " + distance + "km!!! 마지막 스퍼트!!!");
            distance = 0;
            break;
         } // if
         if (this.tireLife <= 0) {
            log.info("타이어의 현재 수명이 " + this.tireLife + " 입니다.");
            log.info("타이어 교체 필요!!");
            log.info("타이어를 교체합니다.");

            break;
         } // if
      } // while

      return distance;
   }

   @Override
   public void pin() {
      log.info("압정을 밟았다.");
      this.tireLife = 0;
      log.info("타이어를 교체합니다.");
//   this.roll();
   }// roll

}// end class
