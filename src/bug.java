import java.awt.*;

    public abstract class bug
    {

        protected int x;
        protected int y;

        protected bug(){
            x=200;
            y=200;
        };

        protected bug(int x, int y) {

            this.x=x;
            this.y=y;

        }

        public abstract void Update();

        public abstract void Render(Graphics var1);

        public abstract Rectangle getBounds();



        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }


    }
