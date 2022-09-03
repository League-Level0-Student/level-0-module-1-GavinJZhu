PImage face;

void setup() {
  face = loadImage("face2");
  size(500, 500);
  face.resize(500, 500);
}

void draw() {
  image(face, 0, 0);
  fill(8, 244, 165);
  ellipse(160, 225, 175, 175);
  fill(40, 232, 242);
  ellipse(325, 240, 100, 100);
  fill(0, 0, 0);
  ellipse(160, 225, 50, 50);
}

void mouseMoved() {
  fill(255, 0, 0);
  ellipse(160, 225, 175, 175);
  fill(0, 0, 255);
  ellipse(325, 240, 100, 100);
  fill(0, 0, 0);
  ellipse(160, 225, 50, 50);
  fill(0, 0, 0);
  ellipse(325, 240, 30, 30);
}
