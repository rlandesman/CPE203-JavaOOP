import processing.core.PImage;

import java.util.List;

public class Blacksmith extends EntityBasic{
    public Blacksmith(String id, Point pos, List<PImage> images) {
        super(id, pos,images);
    }

    public List<PImage> getImages(){return images;}
}
