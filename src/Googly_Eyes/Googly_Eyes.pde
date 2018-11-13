PImage face;
void setup() {
   face = loadImage("face.png");
  size(800,600);
    face.resize(width,height);
    background(face);
}
void draw() {
  if(mousePressed){
    println(mouseX+","+mouseY);
  }
  if(mouseX<364){
    mouseX=364;
  }
  if(mouseX>400){
    mouseX=400;
  }
  
  if(mouseY>156) {
    mouseY=156;
  }
  if(mouseY<133){
    mouseY=133;
  }
  background(face);
  fill(255,255,255);
  ellipse(380,145,100,75);
  fill(255,255,255);
  ellipse(500,145,100,75);
  fill(0,0,0);
  ellipse(mouseX,mouseY,45,45);
  ellipse(mouseX+120,mouseY,45,45);
  


  
}
 