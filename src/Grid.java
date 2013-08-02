
import java.awt.Color;
import java.awt.Point;
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Grid extends JButton {

    final String GAME_MODEL_EASY = "EASY";
    final String GAME_MODEL_MEDIUM = "MEDIUM";
    final String GAME_MODEL_HARD = "HARD";
    boolean isBallExist = false;//判断当前网格是否有小球    
    Ball ball = null;
    Boolean signalOfCreateABall = false;
    Point coodrinate;

    public Grid(Point p) {
        coodrinate = p;
    }

    public void CreateTheBall() {
        Ball newBall = new Ball(this.coodrinate);
        this.ball = newBall;
    }

    public void CreateTheBall(Color color) {
        Ball newBall = new Ball(this.coodrinate);
        this.ball = newBall;
        this.ball.color = color;
    }
}
