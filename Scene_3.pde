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
      imageMode (CENTER);
      image (SpeechBubbleV2,500,350,500,200);
      
      fill (0);
      text ("Dad: Come on son, let’s go home.",500,330);
    }

    if (chat == 11) {
      imageMode(CENTER);
      image (SpeechBubble,450,350,710,150);
      
      fill (0);
      text ("Son: Okay, wanna hear what I did at school today?",450,340);
    }

    if (chat == 12) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("(Dad’s phone rings)",500,650);
    }

    if (chat == 13) {
      imageMode (CENTER);
      image (SpeechBubbleV2,500,350,350,200);
      
      fill (0);
      text ("Dad: Not now son...",500,330);
    }

    if (chat == 14) {
      imageMode(CENTER);
      image (SpeechBubble,500,400,250,150);
      
      fill (0);
      text ("Son: But-",500,400);
    }

    if (chat == 15) {
      fill (255);
      rectMode (CORNER);
      rect (0,600,1000,700);
      
      fill (0);
      text ("Message (Wife): “You jerk,",500,250);
      text ("you could’ve grabbed it for",500,270);
      text ("me, I hadn’t left yet. And",500, 290);
      text ("you didn’t have to send me",500,310);
      text ("a text with that attitude!",500,330); 
}

    if (chat == 16) {
      imageMode (CENTER);
      image (SpeechBubbleV2,550,320,530,250);
      
      fill (0);
      text ("Dad (Out loud): What? What attitude?",550,280);
      text ("Whatever, let’s go home.",480,300); 
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
