package com.sdsk.rpg;

public class Main {


    public static void main(String[] args) {
      Character elf = new Character();
      elf.name = "�����ü�";
      elf.hp = 1;
      elf.info();

      Item book = new Item();
      book.weight = 100;
      book.name = "������";
      book.info();

      Sword shortSword = new Sword();
      shortSword.name = "�ܰ�";
      shortSword.attack = 100;
      shortSword.weight = 10;
      shortSword.durability = 100;


      Bow longBow = new Bow();
      longBow.name = "�պ���";
      longBow.attck = 70;
      longBow.range = 20;
  }


}
