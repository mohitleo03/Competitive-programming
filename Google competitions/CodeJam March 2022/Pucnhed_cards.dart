import 'dart:io';

void main() {
  int T = int.parse((stdin.readLineSync().toString()));
  List<List<String>> result = [];
  if (T >= 1 && T <= 81) {
    for (int i = 0; i < T; i++) {
      String RxC = stdin.readLineSync().toString();
      List<String> rxc = RxC.split(" ");
      int R = int.parse(rxc[0]);
      int C = int.parse(rxc[1]);
      List<String> mini_result = [];
      if (R >= 2 && R <= 10 && C >= 2 && C <= 10) {
        for (int j = 0; j < (R * 2) + 1; j++) {
          for (int k = 0; k < (C * 2) + 1; k++) {
            if ((j + k) <= 1 || (j == 1 && k == 1)) {
              mini_result.add(".");
            } 
            else if (j % 2 == 0 && k % 2 == 0) {
              mini_result.add("+");
            }
            else if (j % 2 != 0 && k % 2 == 0) {
              mini_result.add("|");
            }
            else if (j % 2 == 0 && k % 2 != 0) {
              mini_result.add("-");
            }
            else if (j % 2 != 0 && k % 2 != 0) {
              mini_result.add(".");
            }
          }
          mini_result.add("\n");
        }
        result.add(mini_result);
      }
    }
    for (int i = 0; i < T; i++) {
      print("Case #${i + 1}:");
      String ans = result[i].join("");
      print(ans);
    }
  }
}
