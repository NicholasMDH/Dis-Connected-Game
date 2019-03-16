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
      imageMode (CENTER);
      image (SpeechBubbleV2,550,320,735,250);

      fill (0);
      text ("Wife: “I’m heading out to work, goodbye! Love you!",550,285);
    }

    if (chat == 2) {
      imageMode(CENTER);
      image (SpeechBubble,350,369,710,250);

      fill (0);
      text ("Dad (to himself): She forgot her bag!",270,325);
      text ("I’ll just text her to let her know she forgot it.",350,355);
    }

    if (chat == 3) {
    imageMode(CENTER);
    image (SpeechBubble,430,369,550,250);

      fill (0);
      text ("Text: You forgot your purse.",410,330);
      text ("Trt not to forget it next time!",385,360);
  }

    if (chat == 4) {
      imageMode(CENTER);
      image (SpeechBubble,350,369,710,250);

      fill (0);
      text ("Dad: Okay, time for work, hopefully",260,330);
      text ("I’ll get that raise that I’ve been waiting for.",335,360);
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
