package com.heyletscode.ihavetofly;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.heyletscode.ihavetofly.GameView.screenRatioX;
import static com.heyletscode.ihavetofly.GameView.screenRatioY;
import java.util.Random;

public class Bird {

    public int speed = 20;
    public boolean wasShot = true;
    int x = 0, y, width, height, wBorder, hBorder, birdCounter = 1;
    Bitmap bird1, bird2, bird3, bird4, bird5, bird6, bird7, bird8, bird9, bird10, bird11, bird12;

    Bird (Resources res) {

        int[] customerArray = {R.drawable.green_mohawk_blue_shirt,
                R.drawable.long_blonde_grocery_cart, R.drawable.zebra_mohawk_white_shirt,
                 R.drawable.nm_green, R.drawable.covid, R.drawable.nm_mohawk,
                R.drawable.nm_mohawk_cart, R.drawable.nm_purple,
                R.drawable.zebra_mohawk_grocery_cart, R.drawable.nm_red_2_cart};

        Random rand = new Random();
        int n = rand.nextInt(10);

        bird1 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird2 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird3 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird4 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird5 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird6 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird7 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird8 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird9 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird10 = BitmapFactory.decodeResource(res, customerArray[n]);

        width = bird1.getWidth();
        height = bird1.getHeight();

        width /= 4;
        height /= 4;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        bird1 = Bitmap.createScaledBitmap(bird1, width, height, false);
        bird2 = Bitmap.createScaledBitmap(bird2, width, height, false);
        bird3 = Bitmap.createScaledBitmap(bird3, width, height, false);
        bird4 = Bitmap.createScaledBitmap(bird4, width, height, false);
        bird5 = Bitmap.createScaledBitmap(bird5, width, height, false);
        bird6 = Bitmap.createScaledBitmap(bird6, width, height, false);
        bird7 = Bitmap.createScaledBitmap(bird7, width, height, false);
        bird8 = Bitmap.createScaledBitmap(bird8, width, height, false);
        bird9 = Bitmap.createScaledBitmap(bird9, width, height, false);
        bird10 = Bitmap.createScaledBitmap(bird10, width, height, false);

        y = -height;
    }

    Bitmap getBird () {

        if (birdCounter == 1) {
            birdCounter++;
            return bird1;
        }

        if (birdCounter == 2) {
            birdCounter++;
            return bird2;
        }

        if (birdCounter == 3) {
            birdCounter++;
            return bird3;
        }

        if (birdCounter == 4) {
            birdCounter++;
            return bird4;
        }

        if (birdCounter == 5) {
            birdCounter++;
            return bird5;
        }

        if (birdCounter == 6) {
            birdCounter++;
            return bird6;
        }

        if (birdCounter == 7) {
            birdCounter++;
            return bird7;
        }

        if (birdCounter == 8) {
            birdCounter++;
            return bird8;
        }

        if (birdCounter == 9) {
            birdCounter++;
            return bird9;
        }

        birdCounter = 1;
        return bird10;
    }

    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }

}
