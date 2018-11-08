void setup() {
  PImage face = loadImage("face.png");
  size(800,600);
    face.resize(width,height);
    background(face);
}
void draw() {
  fill(255,255,255);
  ellipse(380,145,100,75);
  fill(0,0,0);
  ellipse(mouseX,mouseY,45,45);
  fill(255,255,255);
  if(mousePressed){
    println(mouseX+","+mouseY);
  }
  if(mouseX>366){
    mouseX=366;
  }

  
}
 