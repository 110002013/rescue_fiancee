import java.util.*;

public class levels_3 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
	 Scanner input = new Scanner(System.in);
	 System.out.println("請輸入勇者名字:");
	  String name = input.nextLine();
  System.out.println("這回未婚妻又被大猩猩給捉走了，"+name+"勇者要孤身奮鬥去拯救未婚妻，\n" + "牠們還設置重重的關來阻止你，希望你能打敗可惡的大猩猩救出未婚妻！\n"
    + "準備好就輸入ok並按下Enter");

  
  String start = input.nextLine();
  String start_L = start.toLowerCase();
  if (start_L.equals("ok")) {
   poem_1();
  } else {
   System.out.println("掰掰，有緣再相見");
  }

 }

 public static void poem_1() {
  System.out.println("第一關冒險篇「被攻佔的碧姬公主城堡」需要通過關卡才能夠渡過岩漿，\n" + "但是岩漿火焰令腳下晃動不已，要特別小心。\r\n"
    + "關卡：隨機抽一首詩來默打    <注意！！如果默打不出來就直接掉入岩漿，必須重新來過！！>\n" + "（A）《春曉》孟浩然           春眠不覺曉，處處聞啼鳥。夜來風雨聲，花落知多少。\n"
    + "（B）《八陣圖》杜甫           功蓋三分國，名成八陣圖。江流石不轉，遺恨失吞吳。\n" + "（C）《江雪》柳宗元           千山鳥飛絕，萬徑人蹤滅。孤舟蓑笠翁，獨釣寒江雪。\n"
    + "（D）《哥舒歌》西鄙人       北斗七星高，哥舒夜帶刀。至今窺牧麻，不敢過臨洮。\n" + "（E）《登鸛雀樓》王之渙   白日依山盡，黃河入海流。欲窮千里目，更上一層樓。\n"
    + "（F）《登樂遊原》李商隱   向晚意不適，驅車登古原。夕陽無限好，只是近黃昏。\n 準備好請輸入ok題目將會出現");
  Scanner input = new Scanner(System.in);
  String start = input.nextLine();
  String start_L = start.toLowerCase();
  if (start_L.equals("ok")) {
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.println("小注意：忘記的字用空白鍵代替、字數加標點符號必需是24個");
   int x = (int) (Math.random() * 5 + 1);
   if (x == 1) {// 如果抽到A是《春曉》孟浩然
    System.out.println("你抽到了《春曉》孟浩然，請打：");
   }
   if (x == 2) {// 如果抽到B是《八陣圖》杜甫
    System.out.println("你抽到了《八陣圖》杜甫，請打：");
   }
   if (x == 3) {// 如果抽到C是《江雪》柳宗元
    System.out.println("你抽到了《江雪》柳宗元，請打：");
   }
   if (x == 4) {// 如果抽到D是《哥舒歌》西鄙人
    System.out.println("你抽到了《哥舒歌》西鄙人，請打：");
   }
   if (x == 5) {// 如果抽到E是《登鸛雀樓》王之渙
    System.out.println("你抽到了《登鸛雀樓》王之渙，請打：");
   }
   if (x == 6) {// 如果抽到E是《登樂遊原》李商隱
    System.out.println("你抽到了《登樂遊原》李商隱，請打：");
   }
   String write = input.nextLine();// 使用者默打的
   poem_one(x, write);// 把抽到哪首詩和玩家默打的傳到副程式one
  }

 }

 public static void poem_one(int x, String write) {
  String o_poem[] = { // o_poem陣列存詩
    "春眠不覺曉，處處聞啼鳥。夜來風雨聲，花落知多少。", "功蓋三分國，名成八陣圖。江流石不轉，遺恨失吞吳。", "千山鳥飛絕，萬徑人蹤滅。孤舟蓑笠翁，獨釣寒江雪。",
    "北斗七星高，哥舒夜帶刀。至今窺牧麻，不敢過臨洮。", "白日依山盡，黃河入海流。欲窮千里目，更上一層樓。", "向晚意不適，驅車登古原。夕陽無限好，只是近黃昏。" };
  String os_poem[] = new String[24];
  if (x == 1) {
   os_poem = o_poem[0].split("");
  }
  if (x == 2) {
   os_poem = o_poem[1].split("");
  }
  if (x == 3) {
   os_poem = o_poem[2].split("");

  }
  if (x == 4) {
   os_poem = o_poem[3].split("");
  }
  if (x == 5) {
   os_poem = o_poem[4].split("");

  }
  if (x == 6) {
   os_poem = o_poem[5].split("");
  }
  poem_two(os_poem, write);
 }

 public static void poem_two(String[] os_poem, String write) {
  // a是全部錯的，b是標點符號，c是國字，d是哪一些位子錯
  int a = 0, b = 0, c = 0;
  String w_peom[] = write.split("");
  if (w_peom.length < 24) {
   System.out.println("\n有少字，請在檢查，標點符號也要寫，忘記的字請打空白，掰掰，有緣再相見!");
  } else if (w_peom.length > 24) {
   System.out.println("你打太多字了啦啦啦，空白格要注意喔!掰掰，有緣再相見");
  } else {
   for (int i = 0; i < os_poem.length; i++) {
    if (!w_peom[i].equals(os_poem[i])) {
     a++;
     System.out.println("第" + (i + 1) + "個字錯，         " + w_peom[i] + "是" + os_poem[i]);
     if (i == 5 || i == 11 || i == 17 || i == 23) {
      b++;
     } else {
      c++;
     }
    }
   }

   if (a != 0) {
    System.out.println("標點符號錯" + b + "個");
    System.out.println("字錯" + c + "個");
    System.out.println("總共" + a + "個地方寫錯了，在背熟一點喔，掰掰，有緣再相見" + "");

   } else {
    System.out.println("你真棒!全對!準備好，輸入ok進入下一關");
    Scanner input = new Scanner(System.in);
    String start = input.nextLine();
    String start_L = start.toLowerCase();
    if (start_L.equals("ok")) {
     riddle_2();
    } else {
     System.out.println("掰掰，有緣再相見");

    }
   }
  }
 }

 public static void riddle_2() {
  System.out.println("第二關益智篇「薄荷諸島隱藏關卡」若能穿越薄荷島就能乘船去尋找大魔王，如果不細心的話會很難找出答案\r\n"
    + "關卡：猜謎語   <注意！！若沒找出正確的答案會被困在島上，也必須重新來過！！>\n" + "閱讀完請輸入ok題目將會出現");
  Scanner input = new Scanner(System.in);
  String start_1 = input.nextLine();
  String start_L = start_1.toLowerCase();
  if (start_L.equals("ok")) {
   int x = (int) (Math.random() * 10 + 2);

   String question_riddle[] = { "叫馬不是馬，地上不見它。若用它做藥，請到海里找(猜動物)", "尖尖牙齒大大嘴，長長尾巴短短腿。捕捉獵物流眼淚，可惜那是假慈悲(猜動物)",
     "空中有一兵，嗡嗡叫不停。棍棒它不怕，專門把人叮（猜動物）", "五句話（猜成語）", "棄文就武（猜成語） ", "上林垂釣（猜成語）", "黯（猜成語）", "泵（猜成語） ",
     "田（猜成語）", "身上滑膩膩，喜歡鑽河底。張嘴吐泡泡，可以測天氣?(猜動物)", "小小一條龍，鬍鬚硬似粽， 活著沒有血，死了滿身紅?(猜動物)",
     "小黑,小白,小黃,小紅四人搭飛機,請問是誰會暈機會吐?" };
   String answer_riddle[] = { "海馬", "鱷魚", "蚊子", "三言兩語", "投筆從戎", "緣木求魚", "有聲有色", "水落石出", "縱橫交錯", "泥鰍", "蝦","小白" };
   System.out.println("題目：" + question_riddle[x]);
   String i_riddle_answer = input.nextLine();// 玩家輸入的答案
   if (i_riddle_answer.equals(answer_riddle[x])) {
    System.out.println("恭喜你答對了，準備好，輸入ok趕快進入最後一關吧~");
    String start_2 = input.nextLine();
    String start_L2 = start_2.toLowerCase();
    if (start_L2.equals("ok")) {
     number_3();
    } else {
     System.out.println("掰掰，有緣再相見");

    }
   } else {
    System.out.println("掰掰，有緣再相見");

   }
  } else {
   System.out.println("掰掰，有緣再相見");

  }

 }

 public static void number_3() {
  System.out.println("第三關策略篇「決戰！碧姬公主城堡」本關為最後一關，有許多逐漸掉落懸掛著很多冰錐的堡壘，\n" + "踏著天秤上雪山，懸掛著很多冰錐的洞窟以及搖搖晃晃的幽靈屋，要留心喔！\r\n"
    + "題目：終極密碼(範圍:1~100 )  <注意！！有五次機會，如果沒答對必須重頭來過！！>\n" + "閱讀完請輸入ok");
  Scanner input = new Scanner(System.in);
  String start_1 = input.nextLine();
  String start_L = start_1.toLowerCase();
  if (start_L.equals("ok")) {
   int x = 0;
   x = (int) (Math.random() * 99 + 1); // 將X設為終極密碼-電腦變數
   int count = 0, n1 = 0, n2 = 100; // 將猜的次數、最小值、最大值設定好
   while (true) {
    System.out.print("請輸入數字:");
    int number = input.nextInt(); // number設為玩家輸入字
    count++;
    if (number < n1 || number > n2) {
     System.out.println("錯誤！必須輸入" + n1 + "到" + n2 + "之間的數字，請重新輸入！");
    }
    if (number < 100 && number > 0) {
     if (number < x && number > n1) {
      n1 = number;
      System.out.println("在猜大一點的數字!!!");
      System.out.println("範圍: " + n1 + "~" + n2);
     } else if (number > x && number < n2) {
      n2 = number;
      System.out.println("在猜小一點的數字!!!");
      System.out.println("範圍: " + n1 + "~" + n2);
     } else if (number == x) {
      n1 = number;
      System.out.println("恭喜猜對勒!!!");
      break;
     }
    } else {
     System.out.println("輸入錯誤!請重新輸入!");
    }
   }
   System.out.println("共猜了 " + count + " 次唷!");
   if (count > 5) {
    System.out.println("挑戰失敗，掰掰，有緣再相見");
   } else {
    System.out.println("恭喜你救出了未婚妻哈哈哈!!!!!");
   }
  } else {
   System.out.println("掰掰，有緣再相見");
  }
 }
}