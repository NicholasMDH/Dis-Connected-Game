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
