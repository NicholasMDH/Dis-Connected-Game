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
      imageMode(CENTER);
      image(SpeechBubbleV4,270,320,500,210);
      
      fill (0);
      text ("Dad: (To himself) Okay, I ",235,260);
      text ("wasn’t told anything about the",260,290);
      text ("raise coming in, I’ll email",240,320);
      text ("the boss to see what’s up.",230,350);
     

}  

    if (chat == 7) {
      imageMode(CENTER);
      image(SpeechBubbleV4,270,320,500,240);
      
      fill (0);
      text ("Email: Hey boss, I heard that",255,240);
      text ("the yearly promotions were",255,270);
      text ("happening today and I",255,300);   
      text ("Didn't get one. What's up ",255,330);
      text ("with that?",255,360);

}

    if (chat == 8) {
      imageMode(CENTER);
      image (SpeechBubble,270,320,500,250);

      fill (0);
      text ("Dad: Okay, I should go pick up my son!",270,280);
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
