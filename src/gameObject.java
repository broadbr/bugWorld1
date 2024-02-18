import java.awt.*;

    public abstract class gameObject
    {

        protected String name = "bug";

        protected int damage;
        protected int price;
        protected int health;

        protected int x;
        protected int y;

        protected gameObject(){
            x=200;
            y=200;
        };

        protected gameObject(int x, int y) {

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
        public int getValue() {
            return 1;
        }

        public String getName() {
            return this.name;
        }

        public int getDamage() {
            return this.damage;
        }

        public int getPrice() {
            return this.price;
        }

        public int getHealth() {
            return this.health;
        }


    }
