package ca.mcgill.ecse321.designpatterns.adapter;

public class CircleAdapter implements Shape{
    private Circle adaptee;

    public CircleAdapter(Circle circle){ this.adaptee=circle;}
    
    
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        
        int x = (x1+x2)/2;
        int y = (y1+y2)/2;
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        int radius=Math.min(width, height)/2;

        adaptee.draw(x,y,radius);
    }
}
