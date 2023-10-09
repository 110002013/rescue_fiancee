
關卡：終極密碼(範圍:1~100 ) 有五次機會!
勇者輸入一個數字，如果大於100或小於0的話，他會跟你講說要重新輸入。
變數count紀錄總共猜了幾次

```
public static void number_3() {
  System.out.println("第三關策略篇「決戰！碧姬公主城堡」... "閱讀完請輸入ok");
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
```
