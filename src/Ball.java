
import java.awt.Color;
import java.awt.Point;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Ball {

    Color color = null;//小球的颜色
    Point ballPosition;//触发事件时传递小球坐标

    public Ball(Point BallPosition) {

        this.ballPosition = BallPosition;
        int randomNumber = (int) Math.round(Math.random() * 10);
        switch (randomNumber) {
            case 1:
                this.color = Color.YELLOW;
                break;
            case 2:
                this.color = Color.BLUE;
                break;
            case 3:
                this.color = Color.RED;
                break;
            case 4:
                this.color = Color.BLACK;
                break;
            case 5:
                this.color = new Color(200, 200, 109);
                break;
            case 6:
                this.color = new Color(131, 175, 155);
                break;
            case 7:
                this.color = new Color(254, 67, 101);
                break;
            case 8:
                this.color = new Color(252, 157, 154);
                break;
            default:
                this.color = new Color(249, 205, 173);
                break;
        }

    }
}
