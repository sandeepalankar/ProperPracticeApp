package com.heyletscode.ihavetofly;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.heyletscode.ihavetofly.GameView.screenRatioX;
import static com.heyletscode.ihavetofly.GameView.screenRatioY;
import java.util.Random;

public class Powerup {

    public int speed = 20;
    int x = 0, y, powerupWidth, powerupHeight, powerupCounter = 1;
    Bitmap powerup1, powerup2, powerup3, powerup4, powerup5, powerup6, powerup7;

    Powerup (Resources res) {

        int[] powerupArray = {R.drawable.sanitizer, R.drawable.banana, R.drawable.mask,
                R.drawable.broccoli, R.drawable.sanitizer1, R.drawable.chicken,
                R.drawable.milk};

        Random rand = new Random();
        int s = rand.nextInt(7);

        powerup1 = BitmapFactory.decodeResource(res, powerupArray[s]);
        powerup2 = BitmapFactory.decodeResource(res, powerupArray[s]);
        powerup3 = BitmapFactory.decodeResource(res, powerupArray[s]);
        powerup4 = BitmapFactory.decodeResource(res, powerupArray[s]);
        powerup5 = BitmapFactory.decodeResource(res, powerupArray[s]);
        powerup6 = BitmapFactory.decodeResource(res, powerupArray[s]);
        powerup7 = BitmapFactory.decodeResource(res, powerupArray[s]);

        powerupWidth = powerup1.getWidth();
        powerupHeight = powerup1.getHeight();

        powerupWidth /= 7;
        powerupHeight /= 7;

        powerupWidth = (int) (powerupWidth * screenRatioX);
        powerupHeight = (int) (powerupHeight * screenRatioY);

        powerup1 = Bitmap.createScaledBitmap(powerup1, powerupWidth, powerupHeight, false);
        powerup2 = Bitmap.createScaledBitmap(powerup2, powerupWidth, powerupHeight, false);
        powerup3 = Bitmap.createScaledBitmap(powerup3, powerupWidth, powerupHeight, false);
        powerup4 = Bitmap.createScaledBitmap(powerup4, powerupWidth, powerupHeight, false);
        powerup5 = Bitmap.createScaledBitmap(powerup5, powerupWidth, powerupHeight, false);
        powerup6 = Bitmap.createScaledBitmap(powerup6, powerupWidth, powerupHeight, false);
        powerup7 = Bitmap.createScaledBitmap(powerup7, powerupWidth, powerupHeight, false);

        y = -powerupHeight;
    }

        Bitmap getPowerup () {
            if (powerupCounter == 1) {
                powerupCounter++;
                return powerup1;
            }

            if (powerupCounter == 2) {
                powerupCounter++;
                return powerup2;
            }

            if (powerupCounter == 3) {
                powerupCounter++;
                return powerup3;
            }

            if (powerupCounter == 4) {
                powerupCounter++;
                return powerup4;
            }

            if (powerupCounter == 5) {
                powerupCounter++;
                return powerup5;
            }

            if (powerupCounter == 6) {
                powerupCounter++;
                return powerup6;
            }

            powerupCounter = 1;
            return powerup7;
        }

    Rect getCollisionShape () {
        return new Rect(x, y, x + powerupWidth, y + powerupHeight);
    }
}
