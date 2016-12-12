import com.molymade.apps.molybeads.R;

/**
 * Created by MolyMade.Yoga on 12/12/2016.
 */

public class Bead {
    String image ;
    int radius = 100;
    int x = 0;
    int y = 0;

    public Bead(String image){
        this.image = image;
    }
    public Bead(String image, int radius){
        this.image = image;
        this.radius = radius;
    }

    public int getImageId(){
        return R.drawable.bead0;
    }

    public String getImage() {
        return image;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
