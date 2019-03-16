import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dis_Connected extends PApplet {

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

public void setup() {
  smooth();
  size (1000,700);
  background (0);
  
  //-------------------------------------------
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

public void draw() {
  


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
    textFont(font,50);
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
//Scene 1: Kitchen, Day 1 ------------------------------------------------------------------------------------
  if (scene == 1) {
    imageMode (CORNER);
    image (Kitchen_Bag,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    //Other Characters
    imageMode (CENTER);
    image (Wife,100,537,200,350);

    //Conversation
    textFont(font,20);
    textAlign (CENTER);

    if (chat == 1) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);

      fill (0);
      text ("Wife: \u201cI\u2019m heading out to work, goodbye! Love you!",500,650);
    }

    if (chat == 2) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);

      fill (0);
      text ("Dad: (to himself) She forgot her bag!",500,650);
      text ("I\u2019ll just text her to let her know she forgot it.",500,670);
    }

    if (chat == 3) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);

      fill (0);
      text ("Text: You forgot your purse. Again. Try not to forget it next time!",500,650);
    }

    if (chat == 4) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Dad: Okay, time for work",500,650);
      text (" hopefully I\u2019ll get that raise that I\u2019ve been waiting for",500,670);
    }

    //Transition to scene 2
    if (DadX > width && chat == 5) {
      scene = 2;
      DadX = 100;
    }
    
    //println
    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
//Scene 2: Work, Day 1 ---------------------------------------------------------------------------------------
  if (scene == 2) {
    imageMode (CORNER);
    image (Office,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    // //transition to conversation
    // if (DadX > 600) {
    //   chat = 6;
    // }

    //Conversation
    textFont(font,20);
    textAlign (CENTER);

    if (chat == 6) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Dad: (To himself) Okay, I wasn\u2019t told anything about the raise coming in,",500,650);
      text ("I\u2019ll email the boss to see what\u2019s up",500,670);
    }

    if (chat == 7) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Email: Hey boss, I heard that the yearly promotions were happening today, and I didn\u2019t get one. What\u2019s up with that?",500,650);
      text ("I\u2019ve been working my butt off and I think I deserve some compensation!",500,670);
    }

    if (chat == 8) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);

      fill (0);
      text ("Dad: Haha, I love messing with him",500,650);
    }

    //Transition to scene 3
    if (DadX < 0 && chat == 9) {
      scene = 3;
      DadX = 100;
    }

    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
//Scene 3: School, Day 1 -------------------------------------------------------------------------------------
  if (scene == 3) {
    imageMode (CORNER);
    image (School,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    //Non player character
    image (Son,205,560,200,300);

    //Conversation
    textFont(font,20);
    textAlign (CENTER);

    if (chat == 10) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Dad: Come on son, let\u2019s go home",500,650);
    }

    if (chat == 11) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Son: Okay, wanna hear what I did at school today?",500,650);
    }

    if (chat == 12) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("(Dad\u2019s phone rings)",500,650);
    }

    if (chat == 13) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Not now son...",500,650);
    }

    if (chat == 14) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Son: But-",500,650);
    }

    if (chat == 15) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Message (Wife): \u201cYou jerk, you could\u2019ve grabbed it for me, I hadn\u2019t left yet.",500,650);
      text ("And you didn\u2019t have to send me a text with that attitude!",500,670);
    }

    if (chat == 16) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Dad (Out loud): What? What attitude? Whatever, let\u2019s go home.",500,650);
    }

    //Transition to scene 4
    if (DadX < 0 && chat == 17) {
      scene = 4;
      DadX = 700;
    }

    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
//Scene 4: Kitchen, Day 2 ------------------------------------------------------------------------------------
  if (scene == 4) {
    imageMode (CORNER);
    image (Kitchen,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    //Transition to scene 5
    if (DadX > width) {
      scene = 5;
      DadX = 100;
    }

    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
//Scene 5: Work, Day 2 ---------------------------------------------------------------------------------------  if (Scene == 1) {
  if (scene == 5) {
    imageMode (CORNER);
    image (Office,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    //Transition to scene 6
    if (DadX < 0) {
      scene = 6;
      DadX = 100;
    }

    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
//Scene 6: School, Day 2 -------------------------------------------------------------------------------------
  if (scene == 6) {
    imageMode (CORNER);
    image (School,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    //Transition to scene 7
    if (DadX < 0) {
      scene = 7;
      DadX = 700;
    }

    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
//Scene 7: Kitchen, Day 2 ------------------------------------------------------------------------------------
  if (scene == 7) {
    imageMode (CORNER);
    image (Kitchen,0,0);

    //Player Character
    imageMode (CENTER);
    image (Dad,DadX,550,200,300);

    //Transition to scene 0
    if (DadX > width) {
      scene = 0;
      DadX = 100;
    }

    println ("DadX",DadX);
    println ("Scene",scene);
    println ("Chat",chat);
  }
}//Closes Draw
//Void keyPressed --------------------------------------------------------------------------------------------
public void keyPressed () {
    
   if (key == CODED) {
    
       if (keyCode == RIGHT) {
       DadX = DadX + 10;
      }
        
      else if (keyCode == LEFT ) {
      DadX = DadX - 10;
      }
   }
}
//Void mousePressed --------------------------------------------------------------------------------------------
public void mousePressed () {
    if (scene == 1) {
        if (chat < 5) {
            chat += 1;
        }
    }

    if (scene == 2) {
        if (chat < 9) {
            chat += 1;
        }
    }

    if (scene == 3) {
        if (chat < 17) {
            chat +=1;
        }
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dis_Connected" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
