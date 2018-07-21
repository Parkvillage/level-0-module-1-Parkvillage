import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch

void setup(){
  minim = new Minim(this);      //in the setup method
sound = minim.loadFile("sound.mp3");      //in the setup method
  size(500,500);
  fill(212,160,142);
  ellipse(250,250,300,300);
  fill(212,66,8);
  ellipse(250,250,270,270);
}
void draw(){
  PImage cheese=loadImage("cheese.gif");
  if(mousePressed){
    
  image(cheese,mouseX,mouseY);
  sound.play();
sound.rewind();

}
PImage baseball=loadImage("baseball.gif");
if (mousePressed && (mouseButton == RIGHT)) {
image(baseball,mouseX,mouseY);
  sound.play();
sound.rewind();




}
}