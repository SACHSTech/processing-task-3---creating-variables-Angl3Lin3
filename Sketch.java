import processing.core.PApplet;

public class Sketch extends PApplet {
	
	

  public void settings() {

    size(400, 400);
  }

  public void setup() {
    background(0);
  }

  public void draw() {
	  
    float x = random(0, width);
    float y = random(0, height);

   stroke(225);
	 fill(225);

    beginShape();
	 vertex(x, y + 30);
	 vertex(x - 5, y + 20);
	 vertex(x, y + 10);
	 vertex(x + 5, y + 20);
	 endShape();
	 
	 beginShape();
	 vertex(x - 10, y + 5);
	 vertex(x - 15, y - 5);
	 vertex(x - 10, y - 15);
	 vertex(x - 5, y - 5);
	 endShape();
	 
	 beginShape();
	 vertex(x + 30, y + 20);
	 vertex(x + 20, y);
	 vertex(x + 30, y - 20);
	 vertex(x + 40, y);
	 endShape();
	 


  }
  
  // define other methods down here.
}