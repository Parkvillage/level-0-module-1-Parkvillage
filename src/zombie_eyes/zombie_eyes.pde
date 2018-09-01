PImage face;
void setup(){
   face = loadImage("face.png");

size(200,250);  
  
}
void draw(){
  image(face, 0, 0);
ellipse(mouseX,mouseY,50,50);
fill(mouseX,0,mouseY);
ellipse(135,95,50,50); 
fill(mouseX,0,mouseY);
}