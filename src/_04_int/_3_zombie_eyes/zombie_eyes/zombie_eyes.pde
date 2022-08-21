PImage face;
void setup() {
size(500,500);
face = loadImage("face.jpeg");
face.resize(500, 500);
}
void draw() {
 face.resize(500, 500);
image(face, 0, 0);
ellipse(140,250,75,75);
}
