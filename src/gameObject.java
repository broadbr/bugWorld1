import java.awt.*;

    public abstract class gameObject
    {

        protected String name = "";

        protected int damage = 1;
        protected int price;
        protected int health;

        protected boolean targeted = false;

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

        public abstract void damageObject(int var1);

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

        public void setHealth(int health){this.health=health;}

        public int getHealth() {
            return this.health;
        }

        public void setDamage(int damage) {this.damage=damage;}

        public boolean isTargeted()
        {
            return this.targeted;
        }

        public void setNotTargeted()
        {
            this.targeted = false;
        }

        public void setTargeted()
        {
            this.targeted = true;
        }


    }
