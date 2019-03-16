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
