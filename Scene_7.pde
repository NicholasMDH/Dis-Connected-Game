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
