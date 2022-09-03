int y=50;
int x=50;

void setup() {
  size(150, 150);
  background(#800080);
  for (int i=0; i<3; i++) {
    text("ice cream", x, y);
    y=y+10;
  }
  text("banana", 50, 80);
}
