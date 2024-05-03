package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // do nothing
  } // contructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
    """);
  }
  // Warrior Menu
  public void printWarriorMenu() {
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
    System.out.println("***Select a Warrior Type:*** \n1) Human\n2) Elf\n3) Orc");
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
    System.out.println("***Select a Weapon:*** \n1) Dagger\n2) Sword\n3) Axe");
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
  }
  
  // Armor Menu
  public void printArmourMenu() {
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
    System.out.println("***Armour Pick:*** \n1) Leather\n2) Chainmail\n3) Platemail");
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
    System.out.println("\n***Attack Type:*** \n1) Normal\n2) Heavy");
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
  }

  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
    System.out.printf("%-25s (%s)\n", "Player: ", pWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      pWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      pWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n\n", 
      pWarrior.getDexterity());
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
    System.out.printf("%-25s (%s)\n", "Enemy:", eWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      eWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      eWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      eWarrior.getDexterity());
    System.out.printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
  } // printStats()

  // GameOver Message
  public void printGameOver(String winner) {
    System.out.printf("""
      <!-- ································································· -->
      <!-- : _____   ___  ___  ___ _____   _____  _   _ ___________ _ _ _  : -->
      <!-- :|  _\\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\ | | | : -->
      <!-- :| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ / | | | : -->
      <!-- :| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /| | | | : -->
      <!-- :| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\|_|_|_| : -->
      <!-- : \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_(_|_|_) : -->
      <!-- ································································· -->
    winner: %s
        """, winner);
  } // printGameOver()

} // class