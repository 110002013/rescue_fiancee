# rescue_fiancee
### 遊戲介紹
這回未婚妻又被大猩猩給捉走了，瑪莉歐要孤身奮鬥去拯救未婚妻，他們還設置重重的關卡來阻止馬力歐，現在就讓瑪莉歐打敗可惡的大猩猩救出未婚妻吧！  
### 關卡介紹
遊戲開始的時候會要求輸入勇者的名字，輸入ＯＫ(大小寫皆可)後會跑出前情提要，再輸入ＯＫ後會呼叫副程式poem_１，如果不是輸入ＯＫ就會直接結束遊戲。
```
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("請輸入勇者名字:");
String name = input.nextLine();
System.out.println("這回未婚妻又被大猩猩給捉走了，"+name+"勇者要孤身奮鬥去拯救未婚妻，\n" + "他們還設置重重的關來阻止你，希望你能打敗可惡的大猩猩救出未婚妻！\n"
    + "準備好就輸入ok並按下Enter");
```
#### 關卡一
第一關是冒險篇，名字叫做「被攻佔的碧姬公主城堡」需要通過關卡才能夠渡過岩漿，但是岩漿火焰令腳下晃動不已，要特別小心。  
關卡內容：我們總共有六首詩，然後隨機抽一首詩來默打 ，如果默打不出來就直接掉入岩漿，必須重頭來過！！
```
String start = input.nextLine();
  String start_L = start.toLowerCase();
  if (start_L.equals("ok")) {
   poem_1();
  } else {
   System.out.println("掰掰，有緣再相見");
  }
 }
```

上面會呼叫副程式poem_1，就會從六首中用亂數隨機抽取一首詩，會把抽到的詩與使用者的默打傳到副程式poem_one
```
 public static void poem_one(int x, String write) {
  String o_poem[] = { // o_poem陣列存詩
    "春眠不覺曉，處處聞啼鳥。夜來風雨聲，花落知多少。", "功蓋三分國，名成八陣圖。江流石不轉，遺恨失吞吳。", "千山鳥飛絕，萬徑人蹤滅。孤舟蓑笠翁，獨釣寒江雪。",
    "北斗七星高，哥舒夜帶刀。至今窺牧麻，不敢過臨洮。", "白日依山盡，黃河入海流。欲窮千里目，更上一層樓。", "向晚意不適，驅車登古原。夕陽無限好，只是近黃昏。" };
  String os_poem[] = new String[24];
.
.
.
.
  poem_two(os_poem, write);
 }

#### 關卡二

