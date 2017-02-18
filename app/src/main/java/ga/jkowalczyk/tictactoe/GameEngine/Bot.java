package ga.jkowalczyk.tictactoe.GameEngine;


import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class Bot {
    public int bot(ImageView[] imageView,TextView result,int status)
    {
        Boolean done = false;
        Boolean finish;
        Engine engine;
        engine = new Engine();
       /* Object s1,s2,s3,s4,s5,s6,s7,s8,s9;
        s1=imageView.getTag();
        s2=imageView2.getTag();
        s3=imageView3.getTag();
        s4=imageView4.getTag();
        s5=imageView5.getTag();
        s6=imageView6.getTag();
        s7=imageView7.getTag();
        s8=imageView8.getTag();
        s9=imageView9.getTag();*/

        Object s[] = new Object[9];
        for(int i=0;i<9;i++)
        {
            s[i]=imageView[i].getTag();
        }
        int min = 1;
        int max = 9;
        Random r = new Random();
        int num = r.nextInt((max - min)+1) + min;
        finish=engine.main_status();
        while ((!done)&&(!finish)) {
            if (num == 1) {
                if ((s[0] != "x") && (s[0] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[0], status);
                    engine.check(imageView, status, result);

                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
            if (num == 2) {
                if ((s[1] != "x") && (s[1] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[1], status);
                    engine.check(imageView,status, result);

                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 3) {
                if ((s[2] != "x") && (s[2] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[2], status);
                    engine.check(imageView,status, result);

                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 4) {
                if ((s[3] != "x") && (s[3] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[3], status);
                    engine.check(imageView, status, result);
                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 5) {
                if ((s[4] != "x") && (s[4] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[4], status);
                    engine.check(imageView, status, result);
                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 6) {
                if ((s[5] != "x") && (s[5] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[5], status);
                    engine.check(imageView, status, result);
                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 7) {
                if ((s[6] != "x") && (s[6] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[6], status);
                    engine.check(imageView,  status, result);
                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 8) {
                if ((s[7] != "x") && (s[7] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[7], status);
                    engine.check(imageView, status, result);
                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
             if (num == 9) {
                if ((s[8] != "x") && (s[8] != "o")) {
                    status++;
                    done = true;
                    engine.touch(imageView[8], status);
                    engine.check(imageView, status, result);
                }
                else {
                    num = r.nextInt((max - min) + 1) + min;
                }
            }
        }
        return status;
    }

}
