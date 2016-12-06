import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.Graphics;

class Canvas extends JComponent {
    GameEngine engine;
    InputManager input;

    Canvas(GameEngine engine) {
        this.engine = engine;
        this.input = new InputManager(engine);

        addMouseMotionListener(input);
        addKeyListener(input);

        setPreferredSize(new Dimension(850, 500));
    }

    public void paintComponent(Graphics g) {
        engine.drawBall(g);
        engine.drawPaddle(g);
    }
}
