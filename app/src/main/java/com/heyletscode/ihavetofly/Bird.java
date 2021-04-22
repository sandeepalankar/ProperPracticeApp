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
    int x = 0, y, width, height, birdCounter = 1;
    Bitmap bird1, bird2, bird3, bird4, bird5, bird6, bird7, bird8, bird9, bird10, bird11, bird12,
            bird13, bird14, bird15, bird16, bird17, bird18;
    Bird (Resources res) {

        int[] customerArray = {R.drawable.green, R.drawable.green_2,
                R.drawable.mohawk, R.drawable.mohawk_2_cart,
                R.drawable.mohawk_cart, R.drawable.nm_green,
                R.drawable.nm_green_2, R.drawable.nm_mohawk,
                R.drawable.nm_mohawk_cart, R.drawable.covid, R.drawable.nm_purple,
                R.drawable.nm_purple_cart, R.drawable.nm_red_2_cart,
                R.drawable.nm_red_cart, R.drawable.purple,
                R.drawable.purple_2, R.drawable.red_2_cart,
                R.drawable.red_cart, R.drawable.covid};

        Random rand = new Random();
        int n = rand.nextInt(18);

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
        bird11 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird12 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird13 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird14 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird15 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird16 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird17 = BitmapFactory.decodeResource(res, customerArray[n]);
        bird18 = BitmapFactory.decodeResource(res, customerArray[n]);

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
        bird11 = Bitmap.createScaledBitmap(bird11, width, height, false);
        bird12 = Bitmap.createScaledBitmap(bird12, width, height, false);
        bird13 = Bitmap.createScaledBitmap(bird13, width, height, false);
        bird14 = Bitmap.createScaledBitmap(bird14, width, height, false);
        bird15 = Bitmap.createScaledBitmap(bird15, width, height, false);
        bird16 = Bitmap.createScaledBitmap(bird16, width, height, false);
        bird17 = Bitmap.createScaledBitmap(bird17, width, height, false);
        bird18 = Bitmap.createScaledBitmap(bird18, width, height, false);

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

        if (birdCounter == 10) {
            birdCounter++;
            return bird10;
        }

        if (birdCounter == 11) {
            birdCounter++;
            return bird11;
        }

        if (birdCounter == 12) {
            birdCounter++;
            return bird12;
        }

        if (birdCounter == 13) {
            birdCounter++;
            return bird13;
        }

        if (birdCounter == 14) {
            birdCounter++;
            return bird14;
        }

        if (birdCounter == 15) {
            birdCounter++;
            return bird15;
        }

        if (birdCounter == 16) {
            birdCounter++;
            return bird16;
        }

        if (birdCounter == 17) {
            birdCounter++;
            return bird17;
        }

        birdCounter = 1;
        return bird18;
    }

    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }

}
