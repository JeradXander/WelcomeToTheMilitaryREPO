package com.welcomeToTheMilitary.minigame;

import com.welcomeToTheMilitary.character.ServiceMember;

public interface iMinigame {
    boolean play();
    // it used to be FinalBoss
    boolean play(ServiceMember usr);

    //boolean getIsWin();

}