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
