//To Do:
//Make sure all images are finalized
//add basic conversations on all screens
//Add non-controllable characters as stationary objects on screens
//add screen constraints and transitions between screens in screens themselves
//Add hints to start conversations on screens
//Make sure all characters are level with the ground

//Things that don't work:

//Notes:
//Dad and son are 100,150 pixels (display as 200,300, dad at y = 550, and son at y = 560), wife is 100,175 pixels (display as 200,350, at y = 537)
//Load player character in every time the screen changes to declare starting position on the screen

//------------------------------------------------------------------------------------------------------------

//Variables:
float scene = 0;

int DadX = 700;
int chat = 0;

//Fonts:
PFont font;

//Images:

//speech Bubble
PImage SpeechBubble;
PImage SpeechBubbleV2;
PImage SpeechBubbleV3;
PImage SpeechBubbleV4;

//Background scenes
PImage Kitchen_Bag;
PImage Kitchen;
PImage Office;
PImage School;

//Characters
PImage Dad;
PImage Dad_L;
PImage Dad_Mad;
PImage Dad_Mad_L;
PImage Dad_Mad_Phone;
PImage Dad_Mad_Phone_L;
PImage Dad_Phone;
PImage Dad_Phone_L;
PImage Dad_Sad;
PImage Dad_Sad_L;
PImage Son;
PImage Son_L;
PImage Son_Mad;
PImage Son_Mad_L;
PImage Wife;
PImage Wife_L;
PImage Wife_Mad;
PImage Wife_Mad_L;

void setup() {
  smooth();
  size (1000,700);
  background (0);
  
  //-------------------------------------------
  
  SpeechBubble = loadImage ("Speech_bubble.png");
  SpeechBubbleV2 = loadImage ("Speech_bubbleV2.png");
  SpeechBubbleV3 = loadImage ("Speech_bubbleV3.png");
  SpeechBubbleV4 = loadImage ("Speech_bubbleV3_L.png");
  
  Kitchen_Bag = loadImage ("Kitchen_Bag.png");
  Kitchen = loadImage ("Kitchen.png");
  Office = loadImage ("Office.png");
  School = loadImage ("School.png");

  Dad = loadImage ("Dad.png");
  Dad_L = loadImage ("Dad_L.png");
  Dad_Mad = loadImage ("Dad_Mad.png");
  Dad_Mad_L = loadImage ("Dad_Mad_L.png");
  Dad_Mad_Phone = loadImage ("Dad_Mad_Phone.png");
  Dad_Mad_Phone_L = loadImage ("Dad_Mad_Phone_L.png");
  Dad_Phone = loadImage ("Dad_Phone.png");
  Dad_Phone_L = loadImage ("Dad_Phone_L.png");
  Dad_Sad = loadImage ("Dad_Sad.png");
  Dad_Sad_L = loadImage ("Dad_Sad_L.png");
  Son = loadImage ("Son.png");
  Son_L = loadImage ("Son_L.png");
  Son_Mad = loadImage ("Son_Mad.png");
  Son_Mad_L = loadImage ("Son_Mad_L.png");
  Wife = loadImage ("Wife.png");
  Wife_L = loadImage ("Wife_L.png");
  Wife_Mad = loadImage ("Wife_Mad.png");
  Wife_Mad_L = loadImage ("Wife_Mad_L.png");

  //------------------------------------------
  font = createFont("manaspc.ttf",32);
}

void draw() {
 println ("mouseX=",mouseX,"mouseY",mouseY);  


  //Scene 0: Title Screen --------------------------------------------------------------------------------------
  if (scene == 0) {
    //Resetting variables

    imageMode (CORNER);
    image (Kitchen,0,0);

    imageMode (CENTER);
    image (Dad_Phone_L,800,550,200,300);
    image (Wife,100,537,200,350);
    image (Son,205,560,200,300);
    
    //Title
    strokeWeight (3);
    fill (255);
    rectMode (CENTER);
    rect (500,100,450,80);
    
    fill (0);
    textFont(font,45);
    textAlign (CENTER);
    text ("Dis-Connected",500,120);

    //Start Button
    strokeWeight (3);
    fill (255);
    rectMode (CENTER);
    rect (500,550,150,60);

    fill (0);
    textFont (font);
    textAlign (CENTER);
    text ("Start",500,560);

    if ((mousePressed == true) && (mouseX > 350) && (mouseX < 650) && (mouseY > 490) && (mouseY < 610)) {
      scene = 1;
    }

    println ("Scene",scene);
  }
