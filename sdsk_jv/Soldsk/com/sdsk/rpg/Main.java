package com.sdsk.rpg;

public class Main {


    public static void main(String[] args) {
      Character elf = new Character();
      elf.name = "¿¤ÇÁ±Ã¼ö";
      elf.hp = 1;
      elf.info();

      Item book = new Item();
      book.weight = 100;
      book.name = "¸¶µµ¼­";
      book.info();

      Sword shortSword = new Sword();
      shortSword.name = "´Ü°Ë";
      shortSword.attack = 100;
      shortSword.weight = 10;
      shortSword.durability = 100;


      Bow longBow = new Bow();
      longBow.name = "·Õº¸¿ì";
      longBow.attck = 70;
      longBow.range = 20;
  }


}
