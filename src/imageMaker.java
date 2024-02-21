import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class imageMaker extends Canvas{



        private Image image;

        public imageMaker(Image image) {
            this.image = image;
            Dimension size = new Dimension(image.getWidth(this), image.getHeight(this));
            setPreferredSize(size);
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(image, 0, 0, this);
        }
}
